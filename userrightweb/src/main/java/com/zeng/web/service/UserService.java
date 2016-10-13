package com.zeng.web.service;

import com.zeng.dao.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface UserService {

    public int addUser(User user);

    public List<User> findUserByUser(User user);
}
