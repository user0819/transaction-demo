package com.wang.demo.service;

import com.wang.demo.entity.User;

/**
 * @author wangxiang
 * @since 2020/6/15 11:16
 */
public interface ISerUserService {
    void addUser(User user);

    User getUser(Integer id);
}
