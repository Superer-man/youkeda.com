package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.SpecialtyInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**专业情况表 mapper*/
@Component
public interface SpecialtyInfoMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertSpecialtyInfo(SpecialtyInfoEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateSpecialtyInfo(SpecialtyInfoEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<SpecialtyInfoEntity> listSpecialtyInfo(SpecialtyInfoEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    SpecialtyInfoEntity querySpecialtyInfoById(SpecialtyInfoEntity in);
}
