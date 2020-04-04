package com.echo.app.user.service;

import com.echo.app.user.entity.User;

/**
 * @program: com.echo.app.user.service
 * @author: Echo
 * @create: 2020-04-04 17:34
 **/
public interface UserService {
    /**
     * 根据userId查找
     * @param userId
     * @return
     */

    public User getUserById(String userId);

    /**
     * 修改一个用户
     * @param user
     */
    public void updateUser(User user);
}
