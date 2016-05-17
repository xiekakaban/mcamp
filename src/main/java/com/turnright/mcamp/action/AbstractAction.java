package com.turnright.mcamp.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{
	
	private static final long serialVersionUID = 1L;

	protected String SHOW = "show";

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected ServletContext application;
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
		
	}
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		this.session = request.getSession(); 
	}
	
	
	
}
