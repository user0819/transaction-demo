package com.wang.demo.service.impl;

import com.wang.demo.entity.User;
import com.wang.demo.mapper.UserMapper;
import com.wang.demo.service.ISerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangxiang
 * @since 2020/6/15 11:17
 */
@Service
public class SerUserServiceImpl implements ISerUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void addUser(User user) {
        System.out.println("线程开始休眠2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userMapper.insertSelective(user);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
