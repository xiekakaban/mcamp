package com.turnright.mcamp.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	// private static SessionFactory sessionFactory;
	// private HibernateUtils(){
	//
	// }
	// public static SessionFactory getSessionFactory(){
	// if(sessionFactory == null){
	// Configuration configuration = new Configuration().configure();
	// ServiceRegistry serviceRegistry = new
	// ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	// sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	// return sessionFactory;
	// }
	// else{
	// return sessionFactory;
	// }
	// }
	private static SessionFactory sessionFactory;

	static {
		try {
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}
	public static void closeSession(Session session) {
		if (session != null) {
			if (session.isOpen()) {
				session.close();
			}
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
