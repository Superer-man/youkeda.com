package com.youkeda.notebook.service.noteBook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.NiceLearnerEntity;
import com.youkeda.notebook.service.noteBook.mapper.NiceLearnerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**优秀学员表 service*/
@Service
public class NiceLearnerService {

    @Autowired
    NiceLearnerMapper niceLearnerMapper;
    
    /**
     * 新增
     * @param in 入参
     * @param learnerId 优秀学员id
     * @return id
     */
    @Transactional
    public String insertNiceLearner(NiceLearnerEntity in,String learnerId) {
    	if(StringUtil.isEmpty(in.getCreateId())) {throw new ServiceException("insert", -666, "创建人不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreateName())) {throw new ServiceException("insert", -666, "创建人名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostId())) {throw new ServiceException("insert", -666, "创建人角色不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostName())) {throw new ServiceException("insert", -666, "创建人角色名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getClassId())) {throw new ServiceException("insert", -666, "所属班级id不能为空！"); }
    	else if(StringUtil.isEmpty(in.getClassName())) {throw new ServiceException("insert", -666, "所属班级名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getStartTime())) {throw new ServiceException("insert", -666, "学员开始学习时间不能为空！"); }

    	if(StringUtil.isEmpty(learnerId)){
            in.setLearnerId("Learner-"+ UUID.randomUUID().toString().substring(0,8));
    	}
    	in.setLearnerId(learnerId);
    	in.setToken("" + System.nanoTime());
        niceLearnerMapper.insertNiceLearner(in);
        return learnerId;
    }

    /**
     * 修改
     *
     * @param in 入参
     * @return 数量
     */
    @Transactional
    public int updateNiceLearner(NiceLearnerEntity in) {
    	if(StringUtil.isEmpty(in.getLearnerId())) {throw new ServiceException("insert", -666, "优秀学员id不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateId())) {throw new ServiceException("update", -666, "修改人不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateName())) {throw new ServiceException("update", -666, "修改人名称不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostId())) {throw new ServiceException("update", -666, "修改人角色不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostName())) {throw new ServiceException("update", -666, "修改人角色名称不能为空！"); }
        
      	String oldToken = in.getToken();
      	if(StringUtil.isEmpty(in.getToken())){
      		NiceLearnerEntity query = new NiceLearnerEntity();
      		query.setLearnerId(in.getLearnerId());
      		oldToken = queryNiceLearnerById(query).getToken();
      	}
	    in.setOldToken(oldToken);
        in.setToken("" + System.nanoTime());
		int c= niceLearnerMapper.updateNiceLearner(in);
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
    public List<NiceLearnerEntity> listNiceLearner(NiceLearnerEntity in, Integer rowNumber, Integer pageNumber) {
        if (rowNumber != null && pageNumber != null) {
            PageHelper.startPage(pageNumber, rowNumber);
        }
        return niceLearnerMapper.listNiceLearner(in);
    }
    
    /**
     * 查询一条 主表
     *
     * @param in 查询条件
     * @return 信息
     */
    public NiceLearnerEntity queryNiceLearnerById(NiceLearnerEntity in) {
        NiceLearnerEntity niceLearnerEntity = niceLearnerMapper.queryNiceLearnerById(in);
        if (niceLearnerEntity == null) {
            throw new ServiceException("queryniceLearnerById",-666,"消息表为空");
        }
        return niceLearnerEntity;
    }
}
