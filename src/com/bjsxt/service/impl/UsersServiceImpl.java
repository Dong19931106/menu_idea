package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public int insRegister(Users users) {
        return usersMapper.insUsers(users);
    }
}
