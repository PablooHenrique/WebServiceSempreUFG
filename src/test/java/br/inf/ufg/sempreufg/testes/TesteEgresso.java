package br.inf.ufg.sempreufg.testes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

import br.inf.ufg.sempreufg.dominio.Egresso;
import br.inf.ufg.sempreufg.main.Application;
import br.inf.ufg.sempreufg.service.EgressoService;

public class TesteEgresso {
	
	@Test
	public void testeListarPorMatricula(){
		List<String> matriculas = new ArrayList<String>();
		matriculas.add("977410894");
		matriculas.add("362765717");
		
		SessionFactory sessionFactory = Application.getInstance().getSessionFactory();
		EgressoService egressoService = new EgressoService(sessionFactory);
		List<Egresso> egressos = egressoService.listarPorMatricula(matriculas);
		
		Assert.assertTrue(!egressos.isEmpty());
	}
	
	@Test
	public void testeListarPorCurso(){
		List<String> codigoCurso = new ArrayList<String>();
		codigoCurso.add("CKL7474");
		codigoCurso.add("PNP5021");
		
		SessionFactory sessionFactory = Application.getInstance().getSessionFactory();
		EgressoService egressoService = new EgressoService(sessionFactory);
		List<Egresso> egressos = egressoService.listarPorCursos(codigoCurso);
		
		Assert.assertTrue(!egressos.isEmpty());
	}
}
