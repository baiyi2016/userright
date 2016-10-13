package com.zeng.dao.entity;

/**
 * 
 * @author zeng
 */
public class Role {
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 *  角色名
	 */
	private String rolename;
	/**
	 *  角色描述
	 */
	private String roleDescribe;
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
	 * 角色名
	 * @param rolename
	 */
	public void setRolename(String rolename){
		this.rolename = rolename;
	}
	
    /**
     * 角色名
     * @return
     */	
    public String getRolename(){
    	return rolename;
    }
	/**
	 * 角色描述
	 * @param roleDescribe
	 */
	public void setRoleDescribe(String roleDescribe){
		this.roleDescribe = roleDescribe;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getRoleDescribe(){
    	return roleDescribe;
    }
}