package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.SchoolEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**院校表 mapper*/
@Component
public interface SchoolMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertSchool(SchoolEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateSchool(SchoolEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<SchoolEntity> listSchool(SchoolEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    SchoolEntity querySchoolById(SchoolEntity in);
}
