package br.inf.ufg.sempreufg.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.inf.ufg.sempreufg.dominio.CursoUfg;
import br.inf.ufg.sempreufg.repository.CursoUfgRepository;

public class CursoUfgService {
	
	private SessionFactory sessionFactory;
	
	public CursoUfgService(SessionFactory sessionFactory) {
		super();
		this.setSessionFactory(sessionFactory);
	}

	public void salvar(CursoUfg curso){
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		new CursoUfgRepository(session).salvar(curso);
		
		transaction.commit();
		session.close();
	}
	
	public List<CursoUfg> listar(){
		Session session = getSessionFactory().openSession();
		List<CursoUfg> cursos = new CursoUfgRepository(session).listar();
		session.close();
		return cursos;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
