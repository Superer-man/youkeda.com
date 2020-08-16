package com.youkeda.notebook.service.noteBook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.GetjobDirectionEntity;
import com.youkeda.notebook.service.noteBook.mapper.GetjobDirectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**就业方向表 service*/
@Service
public class GetjobDirectionService {

    @Autowired
    GetjobDirectionMapper getjobDirectionMapper;

    /**
     * 新增
     * @param in 入参
     * @param getjobDirectionId 就业方向表id
     * @return id
     */
    @Transactional
    public String insertGetjobDirection(GetjobDirectionEntity in,String getjobDirectionId) {
    	if(StringUtil.isEmpty(in.getCreateId())) {throw new ServiceException("insert", -666, "创建人不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreateName())) {throw new ServiceException("insert", -666, "创建人名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostId())) {throw new ServiceException("insert", -666, "创建人角色不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostName())) {throw new ServiceException("insert", -666, "创建人角色名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSpecialtyInfoId())) {throw new ServiceException("insert", -666, "专业id不能为空！"); }
    	else if(StringUtil.isEmpty(in.getSpecialtyName())) {throw new ServiceException("insert", -666, "专业名称不能为空！"); }

    	if(StringUtil.isEmpty(getjobDirectionId)){
    		in.setGetjobDirectionId("jobDir-"+ UUID.randomUUID().toString().substring(0,8));
    	}
    	in.setGetjobDirectionId(getjobDirectionId);
    	in.setToken("" + System.nanoTime());
        getjobDirectionMapper.insertGetjobDirection(in);
        return getjobDirectionId;
    }

    /**
     * 修改
     *
     * @param in 入参
     * @return 数量
     */
    @Transactional
    public int updateGetjobDirection(GetjobDirectionEntity in) {
    	if(StringUtil.isEmpty(in.getGetjobDirectionId())) {throw new ServiceException("insert", -666, "就业方向表id不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateId())) {throw new ServiceException("update", -666, "修改人不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateName())) {throw new ServiceException("update", -666, "修改人名称不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostId())) {throw new ServiceException("update", -666, "修改人角色不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostName())) {throw new ServiceException("update", -666, "修改人角色名称不能为空！"); }
        
      	String oldToken = in.getToken();
      	if(StringUtil.isEmpty(in.getToken())){
      		GetjobDirectionEntity query = new GetjobDirectionEntity();
      		query.setGetjobDirectionId(in.getGetjobDirectionId());
      		oldToken = queryGetjobDirectionById(query).getToken();
      	}
	    in.setOldToken(oldToken);
        in.setToken("" + System.nanoTime());
		int c= getjobDirectionMapper.updateGetjobDirection(in);
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
    public List<GetjobDirectionEntity> listGetjobDirection(GetjobDirectionEntity in, Integer rowNumber, Integer pageNumber) {
        if (rowNumber != null && pageNumber != null) {
            PageHelper.startPage(pageNumber, rowNumber);
        }
        return getjobDirectionMapper.listGetjobDirection(in);
    }
    
    /**
     * 查询一条 主表
     *
     * @param in 查询条件
     * @return 信息
     */
    public GetjobDirectionEntity queryGetjobDirectionById(GetjobDirectionEntity in) {
        GetjobDirectionEntity getjobDirectionEntity = getjobDirectionMapper.queryGetjobDirectionById(in);
        if (getjobDirectionEntity == null) {
            throw new ServiceException("querygetjobDirectionById",-666,"消息表为空");
        }
        return getjobDirectionEntity;
    }
}
