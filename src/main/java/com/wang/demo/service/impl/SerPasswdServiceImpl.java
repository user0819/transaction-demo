package com.wang.demo.service.impl;

import com.wang.demo.entity.Passwd;
import com.wang.demo.mapper.PasswdMapper;
import com.wang.demo.service.ISerPasswdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiang
 * @since 2020/6/15 11:19
 */
@Service
public class SerPasswdServiceImpl implements ISerPasswdService {

    @Autowired
    private PasswdMapper passwdMapper;
    @Override
    public int addPasswd(Passwd passwd) {
        return passwdMapper.insert(passwd);
    }

    @Override
    public Passwd getPasswd(Integer id) {
        return passwdMapper.selectByPrimaryKey(id);
    }
}
