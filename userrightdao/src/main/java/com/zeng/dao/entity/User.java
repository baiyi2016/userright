package com.zeng.dao.entity;

/**
 * 
 * @author zeng
 */
public class User {
	/**
	 *  用户id
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  密码
	 */
	private String password;
	/**
	 *  是否禁用0禁用1不禁用
	 */
	private Integer isdelete;
	/**
	 *  角色id
	 */
	private Integer roleId;
	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户id
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名
	 * @param username
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUsername(){
    	return username;
    }
	/**
	 * 密码
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
    /**
     * 密码
     * @return
     */	
    public String getPassword(){
    	return password;
    }
	/**
	 * 是否禁用0禁用1不禁用
	 * @param isdelete
	 */
	public void setIsdelete(Integer isdelete){
		this.isdelete = isdelete;
	}
	
    /**
     * 是否禁用0禁用1不禁用
     * @return
     */	
    public Integer getIsdelete(){
    	return isdelete;
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
}