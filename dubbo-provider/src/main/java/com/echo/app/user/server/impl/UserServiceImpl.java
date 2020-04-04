package com.echo.app.user.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.echo.app.user.entity.User;
import com.echo.app.user.service.UserService;
import com.echo.app.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: com.echo.app.user.server.impl
 * @author: Echo
 * @create: 2020-04-04 18:31
 **/
@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(String userId) {
        User user = userMapper.getUserById(userId);
        return user;
    }

    @Override
    public void updateUser(User user) {

    }
}
