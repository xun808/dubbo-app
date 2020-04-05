package com.echo.app.user.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @program: com.echo.app.user
 * @author: Echo
 * @create: 2020-04-05 17:20
 * 返回值,用于返回操作完成之后的状态
 **/
public class Result implements Serializable {

    private boolean flag;
    private Integer code;
    private String massage;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, Integer code, String massage) {
        this.flag = flag;
        this.code = code;
        this.massage = massage;
    }

    public Result(boolean flag, Integer code, String massage, Object data) {
        this.flag = flag;
        this.code = code;
        this.massage = massage;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", massage='" + massage + '\'' +
                ", data=" + data +
                '}';
    }
}
