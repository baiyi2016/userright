package com.zeng.dao.entity;

/**
 * 
 * @author zeng
 */
public class RoleDetail {
	/**
	 *  角色详情id
	 */
	private Integer roleDetailId;
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 *  模块id
	 */
	private String moduleId;
	/**
	 * 角色详情id
	 * @param roleDetailId
	 */
	public void setRoleDetailId(Integer roleDetailId){
		this.roleDetailId = roleDetailId;
	}
	
    /**
     * 角色详情id
     * @return
     */	
    public Integer getRoleDetailId(){
    	return roleDetailId;
    }
	/**
	 * 角色id
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色id
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 模块id
	 * @param moduleId
	 */
	public void setModuleId(String moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块id
     * @return
     */	
    public String getModuleId(){
    	return moduleId;
    }
}