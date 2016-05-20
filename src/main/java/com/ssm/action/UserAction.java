package com.ssm.action;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import com.ssm.service.impl.UserServiceImpl;

import java.util.List;

/**
 * Created by XH on 2016/5/20.
 */
public class UserAction {

    private UserService userService;
    private User user;

    public String userLogin(){
        System.out.println("½øÈëuserLoginAction...");
        System.out.println("userService------------->"+userService);

       /* List<User> userList=userService.getUser();
        System.out.println("userList------>"+userList);
        boolean flag = false;
        for(User u : userList){
            if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
                System.out.println("id---------->"+u.getId());
                flag=true;
                break;
            }
        }
        if(flag){
            return "loginSuccess";
        }else {
            return "input";
        }*/
        return "loginSuccess";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
