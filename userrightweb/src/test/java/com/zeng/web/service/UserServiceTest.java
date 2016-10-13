package com.zeng.web.service;

import com.zeng.dao.entity.User;
import com.zeng.web.controller.StartWebApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value=StartWebApp.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
       public void findUserByUser1() {
        List<User> list = userService.findUserByUser(null);
        for(User user:list) {
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void findUserByUser2() {
        User user = new User();
        List<User> list = userService.findUserByUser(user);
        for(User u:list) {
            System.out.println(u.getUsername());
        }
    }

    @Test
    public void findUserByUser3() {
        User user = new User();
        user.setUserId(1);
        List<User> list = userService.findUserByUser(user);
        for(User u:list) {
            System.out.println(u.getUsername());
        }
    }

    @Test
    public void findUserByUser4() {
        User user = new User();
        user.setUsername("曾超");
        user.setPassword("1234");
        List<User> list = userService.findUserByUser(user);
        for(User u:list) {
            System.out.println(u.getUsername());
        }
    }
}
