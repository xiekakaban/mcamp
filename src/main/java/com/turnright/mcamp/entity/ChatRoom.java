package com.turnright.mcamp.entity;

import java.util.Date;

public class ChatRoom extends AbstractEntity{
	//在AbstractEntity中已经包含有id,create_time和last_create_time
	private String userid;
	private String weichat_name;
	private String thunbnail;
	private String twod_code;
	private String brief;
	private int stars;
	private String tag;
	private String location;
	private int view;
	private String optional;
	public ChatRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getWeichat_name() {
		return weichat_name;
	}
	public void setWeichat_name(String weichat_name) {
		this.weichat_name = weichat_name;
	}
	public String getThunbnail() {
		return thunbnail;
	}
	public void setThunbnail(String thunbnail) {
		this.thunbnail = thunbnail;
	}
	public String getTwod_code() {
		return twod_code;
	}
	public void setTwod_code(String twod_code) {
		this.twod_code = twod_code;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	
}
