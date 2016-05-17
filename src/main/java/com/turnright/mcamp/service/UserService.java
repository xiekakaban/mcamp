package com.turnright.mcamp.service;

import com.turnright.mcamp.entity.User;

public interface UserService {
	//用户登录
	public boolean login(User user);
	//用户注册
	public boolean register(User user);
}
