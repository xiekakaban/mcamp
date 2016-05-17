package com.turnright.mcamp.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextInitialized implements ServletContextListener{
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("==================WebService End==================");
	}
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("=================WebService Start=================");
		ServletContext application = sce.getServletContext();
		//initUsers(application);
	}
	private void initUsers(ServletContext application){
//		ConcurrentHashMap<String,User> users = new ConcurrentHashMap<String,User>();
//		User user = new User();
//		user.setId("6574839303");
//		user.setUsername("xiekakaban");
//		try {
//			user.setPwd(MD5Convert.StringToMd5_32("123456"));//会报没有MD5算法的错误
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		user.setWeichat("xiekakaban");
//		user.setEmail("ruantianbo@163.com");
//		user.setSex(SexEnum.male);
//		user.setLocation("00");
//		user.setScores(10029);
//		user.setAvator("default.jpg");
//		user.setActive(ActiveEnum.active);
//		user.setOptional("");
//		users.put(user.getUsername(), user);
//		for(Map.Entry<String,User> e : users.entrySet()){
//			e.getValue().show();;
//		}
//		application.setAttribute("users", users);
	}

}
