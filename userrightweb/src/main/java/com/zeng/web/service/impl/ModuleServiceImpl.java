package com.zeng.web.service.impl;

import com.zeng.dao.entity.Module;
import com.zeng.dao.mapper.ModuleMapper;
import com.zeng.web.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> findModuleByModule(Module module) {
        if(module==null) {
            return moduleMapper.searchModuleByParams(null);
        }
        Map<String,String> map = new HashMap<String,String>();
        if(module.getModuleId()!=null) {
            map.put("moduleId",module.getModuleId());
        }
        return moduleMapper.searchModuleByParams(map);
    }
}
