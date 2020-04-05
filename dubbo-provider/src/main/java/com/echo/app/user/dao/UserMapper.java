package com.echo.app.user.dao;

import com.echo.app.user.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program: com.echo.app.user.dao
 * @author: Echo
 * @create: 2020-04-04 18:36
 **/
@Mapper
public interface UserMapper {


    @Select("select id,userId,username,created from user where userId = #{userId}")
    public User getUserById(String userId);

    @Insert("insert into user(id,userId,userName,created) values (#{id},#{userId},#{userName},#{created})")
    public void save(User user);
}
