package com.youkeda.notebook.service.noteBook.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.PictureEntity;
import com.youkeda.notebook.service.noteBook.mapper.PictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**图片表 service*/
@Service
public class PictureService {

    @Autowired
    PictureMapper pictureMapper;
    
    /**
     * 新增
     * @param in 入参
     * @param pictureId 图片id
     * @return id
     */
    @Transactional
    public String insertPicture(PictureEntity in,String pictureId) {
    	if(StringUtil.isEmpty(in.getCreateId())) {throw new ServiceException("insert", -666, "创建人不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreateName())) {throw new ServiceException("insert", -666, "创建人名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostId())) {throw new ServiceException("insert", -666, "创建人角色不能为空！"); }
    	else if(StringUtil.isEmpty(in.getCreatePostName())) {throw new ServiceException("insert", -666, "创建人角色名称不能为空！"); }
    	else if(StringUtil.isEmpty(in.getUsedId())) {throw new ServiceException("insert", -666, "引用处表id不能为空！"); }
    	else if(StringUtil.isEmpty(in.getPictureUrl())) {throw new ServiceException("insert", -666, "图片url不能为空！"); }
    	else if(StringUtil.isEmpty(in.getPictureInfo())) {throw new ServiceException("insert", -666, "图片描述不能为空！"); }

    	if(StringUtil.isEmpty(pictureId)){
            in.setPictureId("picture-"+ UUID.randomUUID().toString().substring(0,8));
    	}
    	in.setPictureId(pictureId);
    	in.setToken("" + System.nanoTime());
        pictureMapper.insertPicture(in);
        return pictureId;
    }

    /**
     * 修改
     *
     * @param in 入参
     * @return 数量
     */
    @Transactional
    public int updatePicture(PictureEntity in) {
    	if(StringUtil.isEmpty(in.getPictureId())) {throw new ServiceException("insert", -666, "图片id不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateId())) {throw new ServiceException("update", -666, "修改人不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdateName())) {throw new ServiceException("update", -666, "修改人名称不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostId())) {throw new ServiceException("update", -666, "修改人角色不能为空！"); }
	   	else if(StringUtil.isEmpty(in.getUpdatePostName())) {throw new ServiceException("update", -666, "修改人角色名称不能为空！"); }
        
      	String oldToken = in.getToken();
      	if(StringUtil.isEmpty(in.getToken())){
      		PictureEntity query = new PictureEntity();
      		query.setPictureId(in.getPictureId());
      		oldToken = queryPictureById(query).getToken();
      	}
	    in.setOldToken(oldToken);
        in.setToken("" + System.nanoTime());
		int c= pictureMapper.updatePicture(in);
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
    public List<PictureEntity> listPicture(PictureEntity in, Integer rowNumber, Integer pageNumber) {
        if (rowNumber != null && pageNumber != null) {
            PageHelper.startPage(pageNumber, rowNumber);
        }
        return pictureMapper.listPicture(in);
    }
    
    /**
     * 查询一条 主表
     *
     * @param in 查询条件
     * @return 信息
     */
    public PictureEntity queryPictureById(PictureEntity in) {
        PictureEntity pictureEntity = pictureMapper.queryPictureById(in);
        if (pictureEntity == null) {
            throw new ServiceException("querypictureById",-666,"消息表为空");
        }
        return pictureEntity;
    }
}
