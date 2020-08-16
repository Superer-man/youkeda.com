package com.youkeda.notebook.service.noteBook.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import io.swagger.annotations.ApiModelProperty;

/**
 * 院校表实体
 */
public class SchoolEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="院校id")private String schoolId;//院校id     
	@ApiModelProperty(value="院校名称")private String schoolName;//院校名称     
	@ApiModelProperty(value="院校简介")private String schoolInfo;//院校简介     
	@ApiModelProperty(value="院校所属省份")private String province;//院校所属省份     
	
	@ApiModelProperty(value="账套ID")private String sobId;//账套ID
	@ApiModelProperty(value="创建人")private String createId;//创建人
	@ApiModelProperty(value="创建人名称")private String createName;//创建人名称
	@ApiModelProperty(value="创建时间")private String createTime;//创建时间
	@ApiModelProperty(value="创建人角色")private String createPostId;//创建人角色
	@ApiModelProperty(value="创建人角色名称")private String createPostName;//创建人角色名称
	@ApiModelProperty(value="更新人角色")private String updatePostId;//更新人角色
	@ApiModelProperty(value="更新人角色名称")private String updatePostName;//更新人角色名称
	@ApiModelProperty(value="更新人")private String updateId;//更新人
	@ApiModelProperty(value="更新人名称")private String updateName;//更新人名称
	@ApiModelProperty(value="更新时间")private String updateTime;//更新时间
	@ApiModelProperty(value="删除标志0否 1是")private String flag;//删除标志0否 1是
	@ApiModelProperty(value="是否成功")private String isSuccess;//是否成功
	@ApiModelProperty(value="成功码")private String successCode;//成功码
	@ApiModelProperty(value="token")private String token;//token

	//扩展字段
	@ApiModelProperty(value="oldToken")private String oldToken;//oldToken

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSobId() {
		return sobId;
	}

	public void setSobId(String sobId) {
		this.sobId = sobId;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreatePostId() {
		return createPostId;
	}

	public void setCreatePostId(String createPostId) {
		this.createPostId = createPostId;
	}

	public String getCreatePostName() {
		return createPostName;
	}

	public void setCreatePostName(String createPostName) {
		this.createPostName = createPostName;
	}

	public String getUpdatePostId() {
		return updatePostId;
	}

	public void setUpdatePostId(String updatePostId) {
		this.updatePostId = updatePostId;
	}

	public String getUpdatePostName() {
		return updatePostName;
	}

	public void setUpdatePostName(String updatePostName) {
		this.updatePostName = updatePostName;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOldToken() {
		return oldToken;
	}

	public void setOldToken(String oldToken) {
		this.oldToken = oldToken;
	}
	
	
	
	

	/**get 院校id*/
	public String getSchoolId() {
		return schoolId;
	}

	/**set 院校id*/
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	/**get 院校名称*/
	public String getSchoolName() {
		return schoolName;
	}

	/**set 院校名称*/
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**get 院校简介*/
	public String getSchoolInfo() {
		return schoolInfo;
	}

	/**set 院校简介*/
	public void setSchoolInfo(String schoolInfo) {
		this.schoolInfo = schoolInfo;
	}

	/**get 院校所属省份*/
	public String getProvince() {
		return province;
	}

	/**set 院校所属省份*/
	public void setProvince(String province) {
		this.province = province;
	}

}
