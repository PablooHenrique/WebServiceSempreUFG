package br.inf.ufg.sempreufg.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.inf.ufg.sempreufg.dominio.Egresso;
import br.inf.ufg.sempreufg.repository.EgressoRepository;

public class EgressoService {
	private SessionFactory sessionFactory;
	
	public EgressoService(SessionFactory sessionFactory) {
		super();
		this.setSessionFactory(sessionFactory);
	}
	
	public void salvar(Egresso egresso){
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		new EgressoRepository(session).salvar(egresso);
		
		transaction.commit();
		session.close();
	}
	
	public List<Egresso> listarPorMatricula(List<String> matriculas){
		Session session = getSessionFactory().openSession();
		List<Egresso> egressos = new EgressoRepository(session).listarPorMatricula(matriculas);
		//TODO Tenho que pensar em uma forma de resolver isso aqui, o gson e hibernate estao conflitando
//		session.close();
		return egressos;
	}
	
	public List<Egresso> listarPorCursos(List<String> identificadorCursos){
		Session session = getSessionFactory().openSession();
		List<Egresso> egressos = new EgressoRepository(session).listarPorCurso(identificadorCursos);
		//TODO Tenho que pensar em uma forma de resolver isso aqui, o gson e hibernate estao conflitando
//		session.close();
		return egressos;
	}
	
	public List<Egresso> listar(){
		Session session = getSessionFactory().openSession();
		List<Egresso> egressos = new EgressoRepository(session).listar();
		return egressos;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
