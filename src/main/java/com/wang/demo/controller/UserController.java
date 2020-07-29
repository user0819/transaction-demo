package com.wang.demo.controller;

import com.wang.demo.service.ISerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiang
 * @since 2020/6/15 11:49
 */
@RestController
public class UserController {
    @Autowired
    private ISerRegistrationService registrationService;

    @GetMapping("/register")
    public void register(){
        registrationService.register();
    }
}
