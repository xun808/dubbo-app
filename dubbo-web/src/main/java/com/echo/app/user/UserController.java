package com.echo.app.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.echo.app.user.entity.User;
import com.echo.app.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
 * @program: com.echo.app.user
 * @author: Echo
 * @create: 2020-04-04 19:12
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Reference
            //(registry = "address=zookeeper://192.168.25.129:2181") user/detail/101
    private UserService userService;

    @ResponseBody
    @RequestMapping("detail/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }


    @PostMapping("save")
    public User save(User user){
        user.setUserId(UUID.randomUUID().toString().replace("-",""));
        user.setCreated(new Date());
        userService.updateUser(user);
        return user;
    }
}
