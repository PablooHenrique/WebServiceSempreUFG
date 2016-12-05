package br.inf.ufg.sempreufg.repository;

import org.hibernate.Session;

import br.inf.ufg.sempreufg.dominio.CursoUfg;

public class CursoUfgRepository extends AbstractRepository<CursoUfg>{

	public CursoUfgRepository(Session session) {
		super(session);
	}
}
