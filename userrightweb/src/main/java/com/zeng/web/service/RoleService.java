package com.zeng.web.service;

import com.zeng.dao.entity.Role;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RoleService {

    public List<Role> findRoleByRole(Role role);
}
