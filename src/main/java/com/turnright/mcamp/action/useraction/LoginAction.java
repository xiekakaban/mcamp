package com.turnright.mcamp.action.useraction;

import com.turnright.mcamp.action.AbstractAction;
import com.turnright.mcamp.constant.SessionConstant;
import com.turnright.mcamp.entity.User;
import com.turnright.mcamp.impl.UserServiceImpl;
import com.turnright.mcamp.service.UserService;

public class LoginAction extends AbstractAction{
	/**Context*/
	private User user;
	private UserService userService = new UserServiceImpl();
	public String login() throws Exception {
		if(user == null){
			return SHOW;
		}
		else{
			if(userService.login(user)){
				session.setAttribute(SessionConstant.USERNAME,user.getUsername());
				return SUCCESS;
			}else{
				return ERROR;
			}
		}
	}
	public String logout() throws Exception{
		session.removeAttribute(SessionConstant.USERNAME);
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
