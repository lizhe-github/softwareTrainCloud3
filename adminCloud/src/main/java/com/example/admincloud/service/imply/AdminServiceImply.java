package com.example.admincloud.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.admincloud.service.IAdminService;
import com.example.admincloud.entity.Admin;
import com.example.admincloud.mapper.AdminMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImply extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
}
