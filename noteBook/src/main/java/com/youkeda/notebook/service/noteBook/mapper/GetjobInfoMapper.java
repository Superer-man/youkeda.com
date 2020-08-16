package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.GetjobInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**就业情况表 mapper*/
@Component
public interface GetjobInfoMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertGetjobInfo(GetjobInfoEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateGetjobInfo(GetjobInfoEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<GetjobInfoEntity> listGetjobInfo(GetjobInfoEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    GetjobInfoEntity queryGetjobInfoById(GetjobInfoEntity in);
}
