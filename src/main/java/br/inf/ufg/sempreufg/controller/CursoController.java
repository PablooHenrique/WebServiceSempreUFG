package br.inf.ufg.sempreufg.controller;

import java.util.List;

import org.hibernate.SessionFactory;

import br.inf.ufg.sempreufg.dominio.CursoUfg;
import br.inf.ufg.sempreufg.main.Application;
import br.inf.ufg.sempreufg.service.CursoUfgService;

public class CursoController {
	
	private SessionFactory sessionFactory;
	
	public CursoController() {
		super();
		this.sessionFactory = Application.getInstance().getSessionFactory();
	}

	public List<CursoUfg> listarCursosGraduacao() {
		
		return null;
	}

	public List<CursoUfg> listarCursosPosGraduacao() {
		return null;
	}

	public List<CursoUfg> listarTodos() {
		CursoUfgService cursoUfgService = new CursoUfgService(sessionFactory);
		List<CursoUfg> cursos = cursoUfgService.listar();
		return cursos;
	}
}
