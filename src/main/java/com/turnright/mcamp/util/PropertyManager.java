package com.turnright.mcamp.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager{
	Properties prop;
	String propertiesPath = "env/dev/application.properties";
	public PropertyManager(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(propertiesPath);
			prop.load(fis);// 将属性文件流装载到Properties对象中     
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	/**默认加载resource目录下dev下的application.properties,可以通过load()方法进行改变*/
	public void load(){
		
	}
}
