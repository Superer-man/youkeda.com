package com.youkeda.notebook.base.commonservice.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public interface BaseMapper<T, PK extends Serializable>  {
	/**
	 * 插入一个实体
	 * 
	 * @param entity
	 */
	int insert(T entity);

	/**
	 * 根据实体主键删除一个实体
	 * 
	 * @param primaryKey
	 */
	int delete(PK primaryKey);
	
	/** 
	 * @Title: batchDelete 
	 * @Description: 根据主键ID批量删除
	 * @param @param ids
	 * @param @return    设定文件 
	 * @return int    返回类型 
	 * @throws 
	 */ 
	int batchDelete(String []ids);

	/**
	 * 更新一个实体
	 * 
	 * @param entity
	 */
	int update(T entity);

	/**
	 * 查询所有实体
	 * 
	 * @return
	 */
	List<T> queryAll();

	/**
	 * 查询所有实体,根据实体属性值为判断条件查询所有实体，
	 * 
	 * @param entity
	 * @return
	 */
	List<T> queryAllByEntity(T entity);

	/**
	 * 根据主键获取一个实体
	 * 
	 * @param primaryKey
	 * @return
	 */
	T queryOne(PK primaryKey);
	
	/**
	 * 根据MAP查询，
	 * 
	 * @param entity
	 * @return
	 */
	List<T> queryAllByMap(Map<String,Object> params);
	/**
	 * 根据MAP查询 包含角色，
	 * 
	 * @param entity
	 * @return
	 */
	List<T> queryAllWithRoleByMap(Map<String,Object> params);

	
	/**
	 * 批量插入
	 * @param list
	 * @return
	 */
	int insertList(List<T> list);

}
