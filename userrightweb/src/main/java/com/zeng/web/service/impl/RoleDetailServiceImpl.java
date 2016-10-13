package com.zeng.web.service.impl;

import com.zeng.dao.entity.RoleDetail;
import com.zeng.dao.mapper.RoleDetailMapper;
import com.zeng.web.service.RoleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class RoleDetailServiceImpl implements RoleDetailService {

    @Autowired
    private RoleDetailMapper roleDetailMapper;

    @Override
    public List<RoleDetail> findRoleDetailByRoleDetail(RoleDetail roleDetail) {
        if(roleDetail==null) {
            return roleDetailMapper.searchRoleDetailByParams(null);
        }
        Map<String,String> map = new HashMap<String,String>();
        if(roleDetail.getRoleDetailId()!=null) {
            map.put("roleId",roleDetail.getRoleDetailId()+"");
        }
        if(roleDetail.getRoleId()!=null) {
            map.put("roleId",roleDetail.getRoleId()+"");
        }
        if(roleDetail.getModuleId()!=null) {
            map.put("moduleId",roleDetail.getModuleId());
        }
        return roleDetailMapper.searchRoleDetailByParams(map);
    }
}
