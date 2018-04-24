package com.joy.demo.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018-04-14.
 */
public class User {
    private int age;
    private String name;
    private String desc;
    private Date birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(int age, String name, String desc, Date birthday) {
        this.age = age;
        this.name = name;
        this.desc = desc;
        this.birthday = birthday;
    }

    public User() {
    }
}
