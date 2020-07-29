package com.wang.demo.service.impl;

import com.wang.demo.entity.Passwd;
import com.wang.demo.entity.User;
import com.wang.demo.service.ISerPasswdService;
import com.wang.demo.service.ISerRegistrationService;
import com.wang.demo.service.ISerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxiang
 * @since 2020/6/15 11:22
 */
@Service
public class SerRegistrationServiceImpl implements ISerRegistrationService {
    @Autowired
    private ISerUserService userService;
    @Autowired
    private ISerPasswdService passwdService;

    @Override
    public void register() {
        Integer id = (int)(Math.random()*1000);
        System.out.println(id);
        User user = new User();
        user.setId(id);
        user.setName("wang");
        userService.addUser(user);

        User dbUser = userService.getUser(id);
        int inserId = 0;
        if (dbUser != null) {
            Passwd passwd = new Passwd();
            passwd.setUserId(dbUser.getId());
            passwd.setPassword(dbUser.getName());
            inserId = passwdService.addPasswd(passwd);

        }
        Passwd passwd = passwdService.getPasswd(inserId);
        System.out.println(passwd);
    }
}
