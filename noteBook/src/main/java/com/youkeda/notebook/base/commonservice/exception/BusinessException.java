/*
 * 文件名：BusinessException.java 版权：Copyright by caiyun 描述： 修改人：ly 修改时间：2018年3月13日
 * 跟踪单号： 修改单号： 修改内容：
 */

package com.youkeda.notebook.base.commonservice.exception;

/**
 * todo
 * 
 * @author ly
 * @version 2018年3月13日
 * @see BusinessException
 * @since
 */
public abstract class BusinessException extends RuntimeException  {
    
    private static final long serialVersionUID = 1L;

    // 业务类型
    private String bizType;

    // 业务代码
    private int bizCode;

    // 错误信息
    private String message;

    public BusinessException(String bizType, int bizCode, String message) {
        super(message);
        this.bizType = bizType;
        this.bizCode = bizCode;
        this.message = message;
    }

    public BusinessException(String message) {
        super(message);
        this.bizType = "";
        this.bizCode = -1;
        this.message = message;
    }

    public BusinessException(String bizType, String message) {
        super(message);
        this.bizType = bizType;
        this.bizCode = -1;
        this.message = message;
    }

    public BusinessException(int bizCode, String message) {
        super(message);
        this.bizType = "";
        this.bizCode = bizCode;
        this.message = message;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public int getBizCode() {
        return bizCode;
    }

    public void setBizCode(int bizCode) {
        this.bizCode = bizCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}