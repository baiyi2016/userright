package com.zeng.web.vo;

import com.zeng.dao.entity.Module;
import com.zeng.dao.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public class UserVo {

    private User user;

    private List<Module> list;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Module> getList() {
        return list;
    }

    public void setList(List<Module> list) {
        this.list = list;
    }
}
