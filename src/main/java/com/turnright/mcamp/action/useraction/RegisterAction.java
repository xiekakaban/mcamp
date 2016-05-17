package com.turnright.mcamp.action.useraction;

import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionContext;
import com.turnright.mcamp.action.AbstractAction;
import com.turnright.mcamp.entity.User;
import com.turnright.mcamp.impl.UserServiceImpl;
import com.turnright.mcamp.service.UserService;
import com.turnright.mcamp.util.MD5Convert;
import com.turnright.mcamp.util.ValidatorUtil;

public class RegisterAction extends AbstractAction{

	private static final long serialVersionUID = 2237372077361340113L;
	private User user;
	private UserService userService = new UserServiceImpl();
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(user == null){
			return SHOW;
		}else{
			if(userService.register(user)){
				return SUCCESS;
			}
			else{
				return ERROR;
			}
		}
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(user==null){
			
		}else{
			clearActionErrors();//先清空ActionError
			if(!ValidatorUtil.CommonValidator(user.getUsername())){
				this.addActionError("用户名不能为空，且在6-20个字符之间");
			}
			if(!ValidatorUtil.CommonValidator(user.getPwd())){
				this.addActionError("密码不能为空，且在6-20个字符之间");
			}
			if(!ValidatorUtil.emailValidator(user.getEmail())){
				this.addActionError("请输入正确的邮箱");
			}
		}
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
