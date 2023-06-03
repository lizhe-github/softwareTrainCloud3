package com.example.common.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.common.entity.noPersist.sqlQuery.SqlRelation;
import com.example.common.entity.noPersist.sqlQuery.QueryCondition;
import com.example.common.entity.noPersist.sqlQuery.QueryParam;
import com.example.common.entity.noPersist.sqlQuery.SqlCondition;

import java.util.List;

/**
 * 只适用于只有一个AND或OR的情况查询结果才是正确的，其它不是 其它另外写controller
 * @param <T>
 */
public class QueryConditionUtil<T> {

    public QueryWrapper<T> getQueryWrapper(List<QueryParam> queryParamList){
        QueryWrapper<T> queryWrapper=new QueryWrapper<>();
        for(QueryParam queryParam:queryParamList){
            QueryCondition queryCondition = queryParam.getQueryCondition();
            String relation = queryParam.getRelation();
            switch (relation){
                case (SqlRelation.RELATION_AND):
                    switch (queryCondition.getCondition()){
                        case (SqlCondition.CONDITION_EQUAL):
                            queryWrapper = queryWrapper.and(wq -> wq.eq(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_NOT_EQUAL):
                            queryWrapper = queryWrapper.and(wq -> wq.ne(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_IN):
                            queryWrapper = queryWrapper.and(wq -> wq.in(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_NOT_IN):
                            queryWrapper = queryWrapper.and(wq -> wq.notIn(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_LIKE):
                            queryWrapper = queryWrapper.and(wq -> wq.like(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        default:
                            queryWrapper = queryWrapper.and(wq -> wq.eq(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                    }
                    break;
                case (SqlRelation.RELATION_OR):
                    switch (queryCondition.getCondition()){
                        case (SqlCondition.CONDITION_EQUAL):
                            queryWrapper = queryWrapper.or(wq -> wq.eq(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_NOT_EQUAL):
                            queryWrapper = queryWrapper.or(wq -> wq.ne(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_IN):
                            queryWrapper = queryWrapper.or(wq -> wq.in(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_NOT_IN):
                            queryWrapper = queryWrapper.or(wq -> wq.notIn(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        case (SqlCondition.CONDITION_LIKE):
                            queryWrapper = queryWrapper.or(wq -> wq.like(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                        default:
                            queryWrapper = queryWrapper.or(wq -> wq.eq(queryCondition.getProperty(), queryCondition.getValue()));
                            break;
                    }
                    break;
                default:
                    break;

            }
        }
        return queryWrapper;
    }
}
