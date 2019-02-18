package com.zl.springbootmybatis.entity;

import java.util.List;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-17 15:57
 */
public class Author {
    private int id;
    private String username;
    private String password;
    private String email;
    private List<Fans> fans;

    public List<Fans> getFans() {
        return fans;
    }

    public void setFans(List<Fans> fans) {
        this.fans = fans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
