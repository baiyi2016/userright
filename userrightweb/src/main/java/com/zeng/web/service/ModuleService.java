package com.zeng.web.service;

import com.zeng.dao.entity.Module;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface ModuleService {
    public List<Module> findModuleByModule(Module module);
}
