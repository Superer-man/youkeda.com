package com.youkeda.notebook.service.noteBook.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import io.swagger.annotations.ApiModelProperty;

/**
 * 优秀学员表实体
 */
public class NiceLearnerEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="优秀学员id")private String learnerId;//优秀学员id     
	@ApiModelProperty(value="所属班级id")private String classId;//所属班级id     
	@ApiModelProperty(value="所属班级名称")private String className;//所属班级名称     
	@ApiModelProperty(value="学员开始学习时间")private String startTime;//学员开始学习时间     
	@ApiModelProperty(value="学员学习结束时间")private String endTime;//学员学习结束时间     
	@ApiModelProperty(value="优秀学员案例")private String niceLearnerInfo;//优秀学员案例     
	
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
	
	
	
	

	/**get 优秀学员id*/
	public String getLearnerId() {
		return learnerId;
	}

	/**set 优秀学员id*/
	public void setLearnerId(String learnerId) {
		this.learnerId = learnerId;
	}

	/**get 所属班级id*/
	public String getClassId() {
		return classId;
	}

	/**set 所属班级id*/
	public void setClassId(String classId) {
		this.classId = classId;
	}

	/**get 所属班级名称*/
	public String getClassName() {
		return className;
	}

	/**set 所属班级名称*/
	public void setClassName(String className) {
		this.className = className;
	}

	/**get 学员开始学习时间*/
	public String getStartTime() {
		return startTime;
	}

	/**set 学员开始学习时间*/
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**get 学员学习结束时间*/
	public String getEndTime() {
		return endTime;
	}

	/**set 学员学习结束时间*/
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**get 优秀学员案例*/
	public String getNiceLearnerInfo() {
		return niceLearnerInfo;
	}

	/**set 优秀学员案例*/
	public void setNiceLearnerInfo(String niceLearnerInfo) {
		this.niceLearnerInfo = niceLearnerInfo;
	}

}
