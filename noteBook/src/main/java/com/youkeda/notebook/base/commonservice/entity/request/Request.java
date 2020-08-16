package com.youkeda.notebook.base.commonservice.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="统一入参",description="统一入参对象")
public class Request implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="入参头废弃以后不用了",name="header")
	private RequestHeader header = new RequestHeader();

	@ApiModelProperty(value="键值对对象",name="body")
	private RequestData body = new RequestData();
	
	public Request() {}
	
	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public RequestData getBody() {
		return body;
	}

	public void setBody(RequestData body) {
		this.body = body;
	}

}
