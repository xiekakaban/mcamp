package com.turnright.mcamp.entity;

import java.lang.reflect.Field;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class AbstractEntity {
	/**All entity can show it`s field*/
	
	@Column(name="create_time",columnDefinition="datetime NOT NULL")
	private Date create_time;
	
	@Column(name="last_modify_time",columnDefinition="datetime NOT NULL")
	private Date last_modify_time;
	
	private AbstractEntity entity;
	public AbstractEntity(){
		entity = this;
	}
	public void show() {
		try {
			Field[] fields = {};
			fields = entity.getClass().getDeclaredFields();
			StringBuilder sb = new StringBuilder();
			Field field = null;
			for (int i = 0; i < fields.length; i++) {
				try {
					field = fields[i];
					field.setAccessible(true);
					sb.append("[").append(fields[i].getName()).append(":").append(fields[i].get(entity)).append("]");
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(sb.toString());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getLast_modify_time() {
		return last_modify_time;
	}
	public void setLast_modify_time(Date last_modify_time) {
		this.last_modify_time = last_modify_time;
	}
}


