package com.zeng.web.service.impl;

import com.zeng.dao.entity.User;
import com.zeng.dao.mapper.UserMapper;
import com.zeng.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> findUserByUser(User user) {
        if(user==null) {
            return userMapper.searchUserByParams(null);
        }
        Map<String,String> map = new HashMap<String,String>();
        if(user.getUserId()!=null) {
            Integer userId = user.getUserId();
            map.put("userId",userId+"");
        }
        map.put("username",user.getUsername());
        map.put("password",user.getPassword());
        return userMapper.searchUserByParams(map);
    }


}
