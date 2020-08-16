package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.PictureEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**图片表 mapper*/
@Component
public interface PictureMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertPicture(PictureEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updatePicture(PictureEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<PictureEntity> listPicture(PictureEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    PictureEntity queryPictureById(PictureEntity in);
}
