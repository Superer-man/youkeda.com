/*
 * 文件名：EventResponse.java 版权：Copyright by caiyun 描述： 修改人：ly 修改时间：2018年2月10日
 * 跟踪单号： 修改单号： 修改内容：
 */

package com.youkeda.notebook.base.commonservice.entity.event;


import java.io.Serializable;
import java.util.List;


/**
 * todo 事件响应实体
 * 
 * @author ly
 * @version 2018年2月10日
 * @see EventResponse
 * @since
 */
public class EventResponse implements Serializable  {

    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 1L;

    public EventResponse(List<Current> currentData, List<Next> nextData) {
        this.currentData = currentData;
        this.nextData = nextData;
    }

    List<Current> currentData;

    List<Next> nextData;

    public List<Current> getCurrentData() {
        return currentData;
    }

    public List<Next> getNextData() {
        return nextData;
    }

}
