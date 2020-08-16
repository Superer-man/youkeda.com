/*
 * 文件名：Current.java 版权：Copyright by caiyun 描述： 修改人：ly 修改时间：2018年2月10日 跟踪单号：
 * 修改单号： 修改内容：
 */

package com.youkeda.notebook.base.commonservice.entity.event;


import java.io.Serializable;
import java.util.Map;


/**
 * todo
 * 
 * @author ly
 * @version 2018年2月10日
 * @see Current
 * @since
 */
public class Current implements Serializable {
    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 1L;
    
    public Current(String dataId,String current,String total) {
        this.dataId = dataId;
        this.current = current;
        this.total = total;
    }
    public Current(String dataId,String current,String total,Map<String, ?> condition) {
    	this.dataId = dataId;
    	this.current = current;
    	this.total = total;
    	this.condition = condition;
    }

    private String dataId;

    private String current = "";

    private String total = "";
    
    private Map<String, ?> condition;

    public Map<String, ?> getCondition() {
		return condition;
	}
	
	public void setCondition(Map<String, ?> condition) {
		this.condition = condition;
	}
	
	public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
