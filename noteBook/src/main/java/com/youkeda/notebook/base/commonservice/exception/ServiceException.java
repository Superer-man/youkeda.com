/*
 * 文件名：ServiceException.java
 * 版权：Copyright by caiyun
 * 描述：
 * 修改人：ly
 * 修改时间：2018年3月13日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.youkeda.notebook.base.commonservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * todo 
 * @author ly
 * @version 2018年3月13日
 * @see ServiceException
 * @since
 */

public class ServiceException extends BusinessException{

    private static final long serialVersionUID = 1L;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public ServiceException(String bizType, int bizCode, String message) {
        super(bizType, bizCode, message);
        logger.error(bizType);
    }
  
}
