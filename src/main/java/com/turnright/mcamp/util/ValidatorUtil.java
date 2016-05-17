package com.turnright.mcamp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {
	/**字段不能为空,true表示不为空，false表示为空*/
	public static Boolean notEmpty(String field){
		if(field!=null && !field.isEmpty()){
			return true;
		}
		return false;
	}
	/**字段长度验证，在maxLength和minLength之间*/
	public static Boolean lengthValidator(String field,int minLength,int maxLength){
		if(field.length()>=minLength && field.length()<=maxLength){
			return true;
		}
		return false;
	}
	/**匹配正则表达式*/
	public static Boolean regxValidator(String field,String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(field);
		if(matcher.matches()){
			return true;
		}
		return false;
	}
	/**字段不能为空，6-20个字符之间*/
	public static Boolean CommonValidator(String field){
		if(notEmpty(field) && lengthValidator(field,6,20)){
			return true;
		}
		return false;
	}
	/**检测邮箱*/
	public static Boolean emailValidator(String field){
		String emailRegex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		if(notEmpty(field) && regxValidator(field, emailRegex)){
			return true;
		}
		return false;
	}
}
