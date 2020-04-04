package com.echo.app.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: com.echo.app.user.entity
 * @author: Echo
 * @create: 2020-04-04 17:09
 **/
public class User implements Serializable{

    private static final long serialVersion = 1L;
    private String id;
    private String userId;
    private String userName;
    private Date created;

    public User() {
    }

    public User(String id, String userId, String userName, Date created) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.created = created;
    }

    public static long getSerialVersion() {
        return serialVersion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
