package com.service;

import com.domain.User;

import java.util.List;

/**
 * 用户的业务层接口
 * */
public interface IUserService {

    /**
     * 查询用户列表
     * */
    List<User> findAll();

    /**
     * 根据id查询
     * */
    User findById(Integer userID);

    /**
     *更改用户
     * */
    void updateUser(User user);
}
