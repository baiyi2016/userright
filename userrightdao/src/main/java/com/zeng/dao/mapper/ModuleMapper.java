package com.zeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.zeng.dao.entity.Module;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface ModuleMapper {

	int insertModule(Module module);

	int deleteModuleByModuleId(String moduleId);

	int updateModule(Module module);

	Page<Module> searchModuleByParams(@Param("map")Map<String, String> map , Pageable pageable);

	List<Module> searchModuleByParams(@Param("map")Map<String, String> map);

} 
