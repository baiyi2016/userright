package com.zeng.web.service;

import com.zeng.dao.entity.RoleDetail;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RoleDetailService {

    public List<RoleDetail> findRoleDetailByRoleDetail(RoleDetail roleDetail);
}
