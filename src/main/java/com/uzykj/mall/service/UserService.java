package com.uzykj.mall.service;

import com.uzykj.mall.pojo.User;

import java.util.List;

/**
 * Create by xbh 2019-5-11 user interface
 */
public interface UserService {

    /**
     * find a user
     * @param uuid
     * @return User
     */
    User findOne(String uuid);

    /**
     * update a user
     * @param user
     */
    void updateUser(User user);

    /**
     * save a user
     * @param user
     * @return User
     */
    User sava(User user);

    /**
     * delete a user
     * @param uuid
     */
    void deleteUser(String uuid);

    /**
     * find all user
     * @param page
     * @param size
     * @return List
     */
    List<User> findAll(Integer page,Integer size);

}
