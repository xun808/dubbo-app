package com.echo.app.user.entity;

/**
 * @program: com.echo.app.user.entity
 * @author: Echo
 * @create: 2020-04-05 17:23
 * 定义放回状态码
 **/
public interface StatusCode {

    int OK = 20000;//成功
    int ERROR = 20001;//失败
int LOGINERROR = 20002;//登录失败or密码错误
    int ACCESSERROR = 20003;//权限不足
    int REMOTEERROR = 20004;//远程调用失败
    int REPERROE = 20005;//重复操作
}
