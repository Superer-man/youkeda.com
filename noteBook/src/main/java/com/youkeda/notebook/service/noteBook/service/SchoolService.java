package com.youkeda.notebook.service.noteBook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.SchoolEntity;
import com.youkeda.notebook.service.noteBook.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**院校表 service*/
@Service
public class SchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    
    /**
     * 新增
     * @param in 入参
     * @param schoolId 院校id
     * @return id
     */
    @Transactional
    public String insertSchool(SchoolEntity in,String schoolId) {
    	if(StringUtil.isEmpty(in.getCreateId())) {throw new ServiceException("insert", -666, "创建人不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreateName())) {throw new ServiceException("insert", -666, "创建人名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostId())) {throw new ServiceException("insert", -666, "创建人角色不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostName())) {throw new ServiceException("insert", -666, "创建人角色名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSchoolName())) {throw new ServiceException("insert", -666, "院校名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSchoolInfo())) {throw new ServiceException("insert", -666, "院校简介不能为空！"); }
    	else if(StringUtil.isEmpty(in.getProvince())) {throw new ServiceException("insert", -666, "院校所属省份不能为空！"); }

    	if(StringUtil.isEmpty(schoolId)){
            in.setSchoolId("school-"+ UUID.randomUUID().toString().substring(0,8));
    	}
    	in.setSchoolId(schoolId);
    	in.setToken("" + System.nanoTime());
        schoolMapper.insertSchool(in);
        return schoolId;
    }

    /**
     * 修改
     *
     * @param in 入参
     * @return 数量
     */
    @Transactional
    public int updateSchool(SchoolEntity in) {
    	if(StringUtil.isEmpty(in.getSchoolId())) {throw new ServiceException("insert", -666, "院校id不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateId())) {throw new ServiceException("update", -666, "修改人不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateName())) {throw new ServiceException("update", -666, "修改人名称不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostId())) {throw new ServiceException("update", -666, "修改人角色不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostName())) {throw new ServiceException("update", -666, "修改人角色名称不能为空！"); }
        
      	String oldToken = in.getToken();
      	if(StringUtil.isEmpty(in.getToken())){
      		SchoolEntity query = new SchoolEntity();
      		query.setSchoolId(in.getSchoolId());
      		oldToken = querySchoolById(query).getToken();
      	}
	    in.setOldToken(oldToken);
        in.setToken("" + System.nanoTime());
		int c= schoolMapper.updateSchool(in);
		if(c<1){
			throw new ServiceException("update", -649, "操作失败，疑似并发操作，请重试！");
		}
		return c;
    }

    /**
     * 查询列表 主表
     *
     * @param in         查询条件
     * @param rowNumber  条数
     * @param pageNumber 页数
     * @return 列表
     */
    public List<SchoolEntity> listSchool(SchoolEntity in, Integer rowNumber, Integer pageNumber) {
        if (rowNumber != null && pageNumber != null) {
            PageHelper.startPage(pageNumber, rowNumber);
        }
        return schoolMapper.listSchool(in);
    }
    
    /**
     * 查询一条 主表
     *
     * @param in 查询条件
     * @return 信息
     */
    public SchoolEntity querySchoolById(SchoolEntity in) {
        SchoolEntity schoolEntity = schoolMapper.querySchoolById(in);
        if (schoolEntity == null) {
            throw new ServiceException("queryschoolById",-666,"消息表为空");
        }
        return schoolEntity;
    }
}
