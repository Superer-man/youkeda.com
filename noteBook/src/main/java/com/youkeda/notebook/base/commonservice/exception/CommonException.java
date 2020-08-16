package com.youkeda.notebook.base.commonservice.exception;


import lombok.Data;

@Data
public class CommonException extends Exception {
    private String code;
    private String msg;
    public CommonException(String msg, String code){
        super(msg);
        this.code=code;
        this.msg=msg;
    }
}
