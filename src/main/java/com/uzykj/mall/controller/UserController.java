package com.uzykj.mall.controller;

import com.uzykj.mall.pojo.User;
import com.uzykj.mall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by xbh 2019-05-14
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户API")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add", name = "新增用户")
    @ApiOperation(value = "新增用户", notes = "添加新用户")
    public User createUser(@RequestBody User user) {
        if (user != null) {
            return userService.sava(user);
        }
        return null;
    }
}
