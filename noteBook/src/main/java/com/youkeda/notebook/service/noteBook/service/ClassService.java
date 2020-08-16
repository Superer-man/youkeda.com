package com.youkeda.notebook.service.noteBook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.ClassEntity;
import com.youkeda.notebook.service.noteBook.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**班级表 service*/
@Service
public class ClassService {

    @Autowired
    ClassMapper classMapper;
    
    /**
     * 新增
     * @param in 入参
     * @param classId 班级id
     * @return id
     */
    @Transactional
    public String insertClass(ClassEntity in,String classId) {
    	if(StringUtil.isEmpty(in.getCreateId())) {throw new ServiceException("insert", -666, "创建人不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreateName())) {throw new ServiceException("insert", -666, "创建人名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostId())) {throw new ServiceException("insert", -666, "创建人角色不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostName())) {throw new ServiceException("insert", -666, "创建人角色名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getClassName())) {throw new ServiceException("insert", -666, "班级名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSpecialtyInfoId())) {throw new ServiceException("insert", -666, "专业id不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSpecialtyName())) {throw new ServiceException("insert", -666, "专业名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getLearnerNum())) {throw new ServiceException("insert", -666, "学员数量不能为空！"); }

    	if(StringUtil.isEmpty(classId)){
    		in.setClassId("class-"+ UUID.randomUUID().toString().substring(0,8));
    	}
    	in.setClassId(classId);
    	in.setToken("" + System.nanoTime());
        classMapper.insertClass(in);
        return classId;
    }

    /**
     * 修改
     *
     * @param in 入参
     * @return 数量
     */
    @Transactional
    public int updateClass(ClassEntity in) {
    	if(StringUtil.isEmpty(in.getClassId())) {throw new ServiceException("insert", -666, "班级id不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateId())) {throw new ServiceException("update", -666, "修改人不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateName())) {throw new ServiceException("update", -666, "修改人名称不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostId())) {throw new ServiceException("update", -666, "修改人角色不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostName())) {throw new ServiceException("update", -666, "修改人角色名称不能为空！"); }
        
      	String oldToken = in.getToken();
      	if(StringUtil.isEmpty(in.getToken())){
      		ClassEntity query = new ClassEntity();
      		query.setClassId(in.getClassId());
      		oldToken = queryClassById(query).getToken();
      	}
	    in.setOldToken(oldToken);
        in.setToken("" + System.nanoTime());
		int c= classMapper.updateClass(in);
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
    public List<ClassEntity> listClass(ClassEntity in, Integer rowNumber, Integer pageNumber) {
        if (rowNumber != null && pageNumber != null) {
            PageHelper.startPage(pageNumber, rowNumber);
        }
        return classMapper.listClass(in);
    }
    
    /**
     * 查询一条 主表
     *
     * @param in 查询条件
     * @return 信息
     */
    public ClassEntity queryClassById(ClassEntity in) {
        ClassEntity classEntity = classMapper.queryClassById(in);
        if (classEntity == null) {
            throw new ServiceException("queryclassById",-666,"消息表为空");
        }
        return classEntity;
    }
}
