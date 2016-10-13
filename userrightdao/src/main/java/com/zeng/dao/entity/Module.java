package com.zeng.dao.entity;

/**
 * 
 * @author zeng
 */
public class Module {
	/**
	 *  模块id
	 */
	private String moduleId;
	/**
	 *  模块名
	 */
	private String modulename;
	/**
	 *  模块级别
	 */
	private Integer moduleLevel;
	/**
	 *  父模块id
	 */
	private String parentModuleId;
	/**
	 *  模块url
	 */
	private String moduleUrl;
	/**
	 *  是否有子模块0没有1有
	 */
	private Integer childModule;
	/**
	 *  排序号
	 */
	private Integer orderId;
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
	/**
	 * 模块名
	 * @param modulename
	 */
	public void setModulename(String modulename){
		this.modulename = modulename;
	}
	
    /**
     * 模块名
     * @return
     */	
    public String getModulename(){
    	return modulename;
    }
	/**
	 * 模块级别
	 * @param moduleLevel
	 */
	public void setModuleLevel(Integer moduleLevel){
		this.moduleLevel = moduleLevel;
	}
	
    /**
     * 模块级别
     * @return
     */	
    public Integer getModuleLevel(){
    	return moduleLevel;
    }
	/**
	 * 父模块id
	 * @param parentModuleId
	 */
	public void setParentModuleId(String parentModuleId){
		this.parentModuleId = parentModuleId;
	}
	
    /**
     * 父模块id
     * @return
     */	
    public String getParentModuleId(){
    	return parentModuleId;
    }
	/**
	 * 模块url
	 * @param moduleUrl
	 */
	public void setModuleUrl(String moduleUrl){
		this.moduleUrl = moduleUrl;
	}
	
    /**
     * 模块url
     * @return
     */	
    public String getModuleUrl(){
    	return moduleUrl;
    }
	/**
	 * 是否有子模块0没有1有
	 * @param childModule
	 */
	public void setChildModule(Integer childModule){
		this.childModule = childModule;
	}
	
    /**
     * 是否有子模块0没有1有
     * @return
     */	
    public Integer getChildModule(){
    	return childModule;
    }
	/**
	 * 排序号
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 排序号
     * @return
     */	
    public Integer getOrderId(){
    	return orderId;
    }
}