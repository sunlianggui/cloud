package com.example.cloud.component;

/**
 * Created by Administrator on 2019/1/7.
 */
public class Result<T> {

    private String code;
    private T date;
    private String description;

    public Result(String code, T date, String description) {
        this.code = code;
        this.date = date;
        this.description = description;
    }

    public Result(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
