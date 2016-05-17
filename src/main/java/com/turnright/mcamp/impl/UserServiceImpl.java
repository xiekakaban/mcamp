package com.turnright.mcamp.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.turnright.mcamp.db.HibernateUtils;
import com.turnright.mcamp.entity.User;
import com.turnright.mcamp.service.UserService;
import com.turnright.mcamp.util.MD5Convert;

public class UserServiceImpl implements UserService{

	public boolean login(User user) {
		Transaction tx = null;
		String hql = "from User where username=? and pwd=?";
		Session session = null;
		try{
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter(0, user.getUsername());
			query.setParameter(1,MD5Convert.StringToMd5_32(user.getPwd()));
			List result = query.list();
			tx.commit();
			if(result.size()>0){
				return true;
			}else{
				return false;
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
			tx.rollback();
			return false;
		}
		finally{
			if(tx != null){
				tx = null;
			}
			HibernateUtils.closeSession(session);
		}
	}

	public boolean register(User user) {
		
		Transaction tx = null;
		Session session = null;
		try{
			user.setPwd(MD5Convert.StringToMd5_32(user.getPwd()));
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			tx.rollback();
			return false;
		}
		finally{
			if(tx != null){
				tx = null;
			}
			HibernateUtils.closeSession(session);
		}
	}

	

}
