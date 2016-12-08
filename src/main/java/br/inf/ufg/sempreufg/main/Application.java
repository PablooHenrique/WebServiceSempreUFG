package br.inf.ufg.sempreufg.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
	
	private static Application applicationInstance;
	private SessionFactory sessionFactory;
	
	public Application() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static Application getInstance(){
		if (applicationInstance == null) {
            applicationInstance = new Application();
        }

        return applicationInstance;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
