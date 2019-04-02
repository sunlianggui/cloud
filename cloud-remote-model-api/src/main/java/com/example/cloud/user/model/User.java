package com.example.cloud.user.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/28.
 */
public class User implements Serializable {

    public String userName;
    public int age;
    public String sex;

    public User() {
    }

    public User(String userName, int age, String sex) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
