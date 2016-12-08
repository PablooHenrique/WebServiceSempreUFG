package br.inf.ufg.sempreufg.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import br.inf.ufg.sempreufg.dominio.Egresso;
import br.inf.ufg.sempreufg.main.Application;
import br.inf.ufg.sempreufg.service.EgressoService;

public class EgressoController {
	
	private SessionFactory sessionFactory;
	
	public EgressoController() {
		this.setSessionFactory(Application.getInstance().getSessionFactory());
	}

	public List<Egresso> listarPorMatricula(String matriculas) {
		EgressoService service = new EgressoService(getSessionFactory());
		List<String> list = new ArrayList<String>();
		String[] mat = matriculas.split(",");
		
		for (int i = 0; i < mat.length; i++) {
			list.add(mat[i]);
		}
		
		List<Egresso> egressos = service.listarPorMatricula(list);
		
		return egressos;
	}
	
	public List<Egresso> listarPorIdentificadorCurso(String codigoCurso) {
		EgressoService service = new EgressoService(getSessionFactory());
		List<String> list = new ArrayList<String>();
		
		String[] codigos = codigoCurso.split(",");
		
		for (int i = 0; i < codigos.length; i++) {
			list.add(codigos[i]);
		}
		
		List<Egresso> egressos = service.listarPorCursos(list);
		
		return egressos;
	}
	
	public List<Egresso> listar() {
		EgressoService service = new EgressoService(getSessionFactory());
		List<Egresso> egressos = service.listar();
		return egressos;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
