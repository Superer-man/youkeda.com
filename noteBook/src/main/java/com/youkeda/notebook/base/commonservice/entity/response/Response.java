package com.youkeda.notebook.base.commonservice.entity.response;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;


/**
 * @author
 */
public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Object body = new Object();
	
	Response(ResponseHeader header,Object body){
		this.header = header;
		this.body = body;
	}
	
	public Response() {
        
    }

	public Response(int code,Object body){
		this.body = body;
		this.header.setCode(code);
	}
	
	public Response(boolean flag,Object body){
		this.header.setCode(flag?0:1);
		if(!flag) {
            this.header.setMsg(body.toString());
            this.body = new HashMap<String,Object>();
        }else {
            this.body = body;
        }
	}
	
	private  ResponseHeader header = new ResponseHeader();
	
	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
        return JSONObject.toJSONString(this);
	    
	}
}
