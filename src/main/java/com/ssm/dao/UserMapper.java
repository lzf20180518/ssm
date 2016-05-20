package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by XH on 2016/5/20.
 */
public interface UserMapper {
    //@Insert("insert into ssm_user values(#{id},#{username},#{password})")
    public void addUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);

    //@Select("SELECT * FROM ssm_user")
    public List<User> getUser();
}
