package com.wang.demo.entity;

public class Passwd {
    @Override
    public String toString() {
        return "Passwd{" +
                "id=" + id +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                '}';
    }

    private Integer id;

    private Integer userId;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}