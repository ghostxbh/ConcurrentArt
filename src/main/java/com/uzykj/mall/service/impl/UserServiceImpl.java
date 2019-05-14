package com.uzykj.mall.service.impl;

import com.uzykj.mall.dao.UserMapper;
import com.uzykj.mall.pojo.User;
import com.uzykj.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Create by xbh 2019-05-11
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findOne(String uuid) {
        return userMapper.findOne(uuid);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User sava(User user) {
        //设置uuid
        String uuid = UUID.randomUUID().toString();
        user.setUuid(uuid);
        user.setCreateTime(new Date());
        int insert = userMapper.insert(user);
        if (insert > 0) {
            return userMapper.findOne(uuid);
        }
        return new User();
    }

    @Override
    public void deleteUser(String uuid) {
        userMapper.deleteOne(uuid);
    }

    @Override
    public List<User> findAll(Integer page, Integer size) {
        return userMapper.findAll(page, size);
    }
}
