package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

/**
 * Created by XH on 2016/5/20.
 */
public interface UserService {
    public void addUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
    public List<User> getUser();
}
