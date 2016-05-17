package com.turnright.mcamp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.turnright.mcamp.enums.ActiveEnum;
import com.turnright.mcamp.enums.SexEnum;

@Entity
@Table(name="user")
public class User extends AbstractEntity{
	//在AbstractEntity中已经包含有id,create_time和last_create_time
	@Id
	@GenericGenerator(name="fk_uuid",strategy="uuid")
	@GeneratedValue(generator="fk_uuid")
	private String id;
	
	@Column(name="username",columnDefinition="VARCHAR(20) NOT NULL UNIQUE")
	private String username;
	
	@Column(name="pwd",columnDefinition="VARCHAR(32) NOT NULL")
	private String pwd;
	
	@Column(name="weichat",columnDefinition="VARCHAR(50) NOT NULL")
	private String weichat;
	
	@Column(name="email",columnDefinition="VARCHAR(50) NOT NULL UNIQUE")
	private String email;
	
	@Column(name="sex",columnDefinition="SMALLINT(1) NOT NULL DEFAULT 2")
	@Enumerated(EnumType.ORDINAL)
	private SexEnum sex = SexEnum.unknow;
	
	@Column(name="location",columnDefinition="VARCHAR(17) NOT NULL DEFAULT '00'")
	private String location = "00";
	
	@Column(name="scores",columnDefinition="INT(10) NOT NULL DEFAULT 0")
	private int scores = 0;
	
	@Column(name="avator",columnDefinition="VARCHAR(256) NOT NULL DEFAULT 'default.jpg'")
	private String avator = "default.jpg";
	
	@Column(name="active",columnDefinition="SMALLINT(1) NOT NULL DEFAULT 0")
	@Enumerated(EnumType.ORDINAL)
	private ActiveEnum active = ActiveEnum.unactive;
	
	@Column(name="optional",columnDefinition="text")
	private String optional;
	
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getWeichat() {
		return weichat;
	}
	public void setWeichat(String weichat) {
		this.weichat = weichat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public String getAvator() {
		return avator;
	}
	public void setAvator(String avator) {
		this.avator = avator;
	}
	public ActiveEnum getActive() {
		return active;
	}
	public void setActive(ActiveEnum active) {
		this.active = active;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
}
