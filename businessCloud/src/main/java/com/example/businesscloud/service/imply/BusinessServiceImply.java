package com.example.businesscloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.businesscloud.service.IBusinessService;
import com.example.businesscloud.entity.Business;
import com.example.businesscloud.mapper.BusinessMapper;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImply extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {
}
