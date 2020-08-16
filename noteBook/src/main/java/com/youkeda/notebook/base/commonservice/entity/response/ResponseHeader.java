package com.youkeda.notebook.base.commonservice.entity.response;

import java.io.Serializable;

public class ResponseHeader implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 0成功
	 */
	int code = 0;

	String msg = "";

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
