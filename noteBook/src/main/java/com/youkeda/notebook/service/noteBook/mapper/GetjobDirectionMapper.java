package com.youkeda.notebook.service.noteBook.mapper;

import com.youkeda.notebook.base.commonservice.dao.BaseMapper;
import com.youkeda.notebook.service.noteBook.entity.GetjobDirectionEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**就业方向表 mapper*/
@Component
public interface GetjobDirectionMapper extends BaseMapper<Object,String> {
    /**新增
     * @param in 入参
     * @return 数量
     */
    int insertGetjobDirection(GetjobDirectionEntity in);

    /**修改
     * @param in 入参
     * @return 数量
     */
    int updateGetjobDirection(GetjobDirectionEntity in);


    /**查询列表
     * @param in 入参
     * @return 列表
     */
    List<GetjobDirectionEntity> listGetjobDirection(GetjobDirectionEntity in);
   
    /**查询一条
     * @param in 入参
     * @return 信息
     */
    GetjobDirectionEntity queryGetjobDirectionById(GetjobDirectionEntity in);
}
