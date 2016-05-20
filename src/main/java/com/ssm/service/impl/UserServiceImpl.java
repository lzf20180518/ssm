package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

import java.util.List;

/**
 * Created by XH on 2016/5/20.
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public List<User> getUser() {
        return userMapper.getUser();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
}
