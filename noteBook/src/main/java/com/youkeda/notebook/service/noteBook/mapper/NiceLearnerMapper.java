package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.NiceLearnerEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**优秀学员表 mapper*/
@Component
public interface NiceLearnerMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertNiceLearner(NiceLearnerEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateNiceLearner(NiceLearnerEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<NiceLearnerEntity> listNiceLearner(NiceLearnerEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    NiceLearnerEntity queryNiceLearnerById(NiceLearnerEntity in);
}
