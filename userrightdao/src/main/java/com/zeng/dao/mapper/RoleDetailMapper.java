package com.zeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.zeng.dao.entity.RoleDetail;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface RoleDetailMapper {

	void insertRoleDetail(RoleDetail roleDetail);

	void deleteRoleDetailByRoleDetailId(Integer RoleDetailId);

	void updateRoleDetail(RoleDetail roleDetail);

	Page<RoleDetail> searchRoleDetailByParams(@Param("map")Map<String, String> map , Pageable pageable);

	List<RoleDetail> searchRoleDetailByParams(@Param("map")Map<String, String> map);

} 
