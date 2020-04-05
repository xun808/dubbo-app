package com.echo.app.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.echo.app.user.entity.Result;
import com.echo.app.user.entity.StatusCode;
import com.echo.app.user.entity.User;
import com.echo.app.user.service.UserService;
import com.echo.app.user.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IdWorker idWorker;
    @Reference
    private UserService userService;
            //(registry = "address=zookeeper://192.168.25.129:2181") user/detail/101

    @ResponseBody
    @RequestMapping("detail/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }


    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Result save(@RequestBody User user){
        user.setUserId(idWorker.nextId()+"");
        user.setCreated(new Date());
        userService.updateUser(user);
        return new Result(true, StatusCode.OK,"添加成功");
    }


}
