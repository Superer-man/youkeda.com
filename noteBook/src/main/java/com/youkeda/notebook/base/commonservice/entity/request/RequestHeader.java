package com.youkeda.notebook.base.commonservice.entity.request;

import java.io.Serializable;

public class RequestHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3175010342126384621L;
	private String userId;
	private String userName;
	private String organizationId; // 部门Id
	private String organizationName; // 部门名称
	private String deviceId;// 用户设备ID或MAC地址，设备确保唯一字段
	private String deviceType;
	private String devModuleID;
	private String accessToken;
	private String appVersion;
	private String osVersion;
	private String appIdentifier;
	private String workBench;
	private String companyId;  //公司id
	private String companyName;
	private String postId;//岗位ID
	private String postName;//岗位名称
	private String roleId;//角色ID
	
	public RequestHeader() {}
	
	public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDevModuleID() {
		return devModuleID;
	}
	public void setDevModuleID(String devModuleID) {
		this.devModuleID = devModuleID;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getAppIdentifier() {
		return appIdentifier;
	}
	public void setAppIdentifier(String appIdentifier) {
		this.appIdentifier = appIdentifier;
	}
	public String getWorkBench() {
		return workBench;
	}
	public void setWorkBench(String workBench) {
		this.workBench = workBench;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
