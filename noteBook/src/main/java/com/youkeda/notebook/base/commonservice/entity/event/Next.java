/*
 * 文件名：Next.java 版权：Copyright by caiyun 描述： 修改人：ly 修改时间：2018年2月10日 跟踪单号： 修改单号：
 * 修改内容：
 */

package com.youkeda.notebook.base.commonservice.entity.event;


import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * todo
 * 
 * @author ly
 * @version 2018年2月10日
 * @see Next
 * @since
 */

public class Next implements Serializable {

    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 1L;

    public Next(String dataId, String total, Map<String, ?> condition,List<String> sourceIds) {
        this.dataId = dataId;
        this.total = total;
        this.condition = condition;
        this.sourceIds = sourceIds;
    }
    
    public Next(String dataId, String total, Map<String, ?> condition) {
        this.dataId = dataId;
        this.total = total;
        this.condition = condition;
    }

    private String dataId;

    private String total;

    private Map<String, ?> condition;
    
    private List<String> sourceIds;

    public String getDataId() {
        return dataId;
    }

    public String getTotal() {
        return total;
    }

    public Map<String, ?> getCondition() {
        return condition;
    }

    public List<String> getSourceIds()
    {
        return sourceIds;
    }
    
}
