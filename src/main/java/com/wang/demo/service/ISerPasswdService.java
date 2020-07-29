package com.wang.demo.service;

import com.wang.demo.entity.Passwd;

/**
 * @author wangxiang
 * @since 2020/6/15 11:18
 */
public interface ISerPasswdService {
    int addPasswd(Passwd passwd);

    Passwd getPasswd(Integer id);
}
