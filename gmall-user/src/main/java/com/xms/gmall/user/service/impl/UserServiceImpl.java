package com.xms.gmall.user.service.impl;

import com.xms.gmall.user.bean.UmsMenber;
import com.xms.gmall.user.mapper.UserMapper;
import com.xms.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public List<UmsMenber> getAll() {
        List<UmsMenber> umm = mapper.selectAll();
        return umm;
    }
}
