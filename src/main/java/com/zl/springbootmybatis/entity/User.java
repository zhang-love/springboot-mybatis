package com.zl.springbootmybatis.entity;

import org.apache.ibatis.type.Alias;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 16:49
 */
public class User {
    private int id;
    private String username;
    private String password ;
    private String grade ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
