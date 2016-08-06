package com.pro.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class BaseAction implements ServletRequestAware {

	protected HttpServletRequest request;
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

}
