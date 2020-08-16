package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.ClassEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**班级表 mapper*/
@Component
public interface ClassMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertClass(ClassEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateClass(ClassEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<ClassEntity> listClass(ClassEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    ClassEntity queryClassById(ClassEntity in);
}
