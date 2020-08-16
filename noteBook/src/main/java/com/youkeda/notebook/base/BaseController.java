/*
 * 文件名：BaseController.java
 * 版权：Copyright by caiyun
 * 描述：
 * 修改人：ly
 * 修改时间：2018年4月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.youkeda.notebook.base;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * todo controller基类
 * @author ly
 * @version 2018年4月11日
 * @see com.tbi.base.BaseController
 * @since
 */
public class BaseController {
    
    private final boolean test = false;
    private static ThreadLocal<HttpSession> threadLocalHttpSession = new ThreadLocal<HttpSession>();
    
    public static ThreadLocal<HttpSession> getThreadLocalHttpSession() {
		return threadLocalHttpSession;
	}

	/**
     * 得到request对象
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }
    
    /**
     * 得到session对象
     */
    public HttpSession getSession() {
    	HttpSession session = null;
        if(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())!=null){
        	session = getRequest().getSession();
        }else{
        	session = threadLocalHttpSession.get();
        }
        return session;
    }
    
    /**
     * 当前登录用户ID
     */
    public String getUserId() {
        if(test) {
            return "1";
        }
        return getSession().getAttribute("userId").toString();
    }
    
    /**
     * 当前登陆用户岗位ID
     */
    public String getPostId() {
        if(test) {
            return "1";
        }
        return getSession().getAttribute("postId").toString();
    }
    /**
     * 当前登陆用户岗位名称
     */
    public String getPostName() {
    	if(test) {
    		return "超级管理员";
    	}
    	return getSession().getAttribute("postName").toString();
    }
    /**
     * 获得登录token
     */
    public String getAccessToken() {
    	if(test) {
    		return "";
    	}
    	return getSession().getAttribute("accessToken").toString();
    }
    
    
    /**
     * 当前用户名
     * @throws UnsupportedEncodingException 
     */
    public String getUserName() {
        if(test) {
            return "超级管理员";
        }
        
        String userName = getSession().getAttribute("userName").toString();
        try
        {
            return URLDecoder.decode(userName,"utf8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    
    /**
     * Description: 获取当前异常路径
     * @return 
     * @see
     */
    public String getExceptionType(String methodName) {
        return this.getClass().getName()+"-"+methodName;
    }
    
}
