package com.ssm.test;

import com.ssm.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XH on 2016/5/20.
 */
public class DaoTest {

    public static void main(String args[]){
       ApplicationContext atx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
       //UserService userService = (UserService)atx.getBean("userService");
        UserAction userAction = (UserAction)atx.getBean("userAction");

//        User user  = new User("admin","123");
//        userService.addUser(user);
//        List<User> list=userService.getUser();
//        if(list!=null){
//            System.out.println(list.size());
//        }

        System.out.println("userService==============>"+userAction.getUserService().getUser());
    }

}
