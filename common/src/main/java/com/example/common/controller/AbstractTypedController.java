package com.example.common.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.util.QueryConditionUtil;
import com.example.common.entity.noPersist.sqlQuery.QueryParam;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@Slf4j
public class AbstractTypedController<T, IdType extends Serializable> {  // extends AbstractDomainEntity


//    @Resource  不能狗在这里注入  这个只可以由它的子类构造方法注入  如果用例这个注解的话 那么当用到这个抽象的controller的基类的时候，
//    会尝试注入它，但这里给的基类service是一个泛型，有很多个它的子类不能被注入成功
    protected IService<T> svcContext;


    protected QueryConditionUtil<T> queryConditionUtil;

    //#region 关联的数据实体

    @Operation(summary = "查询 单个实体")
    @GetMapping("/{id}")
    public T queryById(@PathVariable IdType id) {
        return svcContext.getById(id);
    }

    @GetMapping("/all")
    @Operation(summary = "查询 全部实体")
    public List<T> findAll() {
        return svcContext.list();
    }

    @PostMapping("/by")
    @Operation(summary = "查询 符合条件的所有实体")
    /**@ModelAttribute  ??????????????? 对于使用list不要使用它*/
    //wrapper当中设置查询条件和排序等
    public List<T> findBy(@RequestBody List<QueryParam> queryParamList) {
        System.out.println(queryParamList);
        QueryWrapper<T> queryWrapper = queryConditionUtil.getQueryWrapper(queryParamList);
        return svcContext.list(queryWrapper);
    }

    /**
     * @param page 分页
     * @return
     */
    @Operation(summary = "查询 分页")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public IPage<T> pageQuery(IPage<T> page) {

        //page 参数类型IPage 使用它的实现类Page之类就好  至于page如何使用就看教程
        return svcContext.page(page);
    }

    /**
     * 根据条件分页查询对象
     *
     * @param queryParamList 查询条件
     * @param page  分页
     * @return
     */
    @Operation(summary = "查询 分页 条件")
    @RequestMapping(value = "/pageCondition", method = RequestMethod.POST)
    public IPage<T> pageQueryBy(@ModelAttribute IPage<T> page, List<QueryParam> queryParamList) {
        QueryWrapper<T> queryWrapper = queryConditionUtil.getQueryWrapper(queryParamList);
        return svcContext.page(page, queryWrapper);
    }

    //#endregion

    //#region 关联的数据实体基本操作

    @PostMapping
    @Operation(summary = "创建 数据实体")
    public T create(@RequestBody T item) {
        svcContext.save(item);
        return item;
    }

    @PutMapping
    @Operation(summary = "修改 数据实体")
    public T update(@RequestBody T entity) {
        //updateWrapper 设置更新条件和更新内容
        boolean b = svcContext.updateById(entity);
        return entity;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除 数据实体")
    public ResponseEntity<Void> delete(@PathVariable IdType id) {
        svcContext.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/batch")
    @Operation(summary = "批量更新")
    public ResponseEntity<Void> batchCreate(@RequestBody List<T> items) {
        var res = svcContext.updateBatchById(items);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/batch")
    @Operation(summary = "批量更新")
    public ResponseEntity<Void> batchUpdate(@RequestBody List<T> items) {
        var res = svcContext.updateBatchById(items);
//        var ids = res.stream().map(r -> r.getEntityId()).toArray();
        System.out.println(items);
//        log.debug("items: {}", ids.length);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/batch")
    @Operation(summary = "批量删除")
    public ResponseEntity<Integer> batchDelete(@RequestParam List<IdType> ids) {
        boolean res = svcContext.removeBatchByIds(ids);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    //#endregion

}
