package com.service.impl;

import com.dao.IUserDao;
import com.domain.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer userID) {
        return userDao.findById(userID);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
