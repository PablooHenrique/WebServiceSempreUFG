package br.inf.ufg.sempreufg.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import br.inf.ufg.sempreufg.dominio.Egresso;

public class EgressoRepository extends AbstractRepository<Egresso>{

	public EgressoRepository(Session session) {
		super(session);
	}

	public List<Egresso> listarPorMatricula(List<String> matriculas) {
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("select e from egresso e where numeroMatricula in (");
		
		for (int i = 0; i < matriculas.size(); i++) {
			jpql.append(":matricula"+i);
			if (i < (matriculas.size() - 1)) {
				jpql.append(",");
			}
		}
		
		jpql.append(")");
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		for (int i = 0; i < matriculas.size(); i++) {
			parametros.put("matricula"+i, matriculas.get(i));
		}
		
		return select(jpql.toString(), parametros);
	}

	public List<Egresso> listarPorCurso(List<String> identificadorCursos) {
		StringBuilder jpql = new StringBuilder();
		jpql.append("select e from egresso e inner join e.cursosUfg c where c.codigo in (");
		
		for (int i = 0; i < identificadorCursos.size(); i++) {
			jpql.append(":codigo"+i);
			if (i < (identificadorCursos.size() - 1)) {
				jpql.append(",");
			}
		}
		
		jpql.append(")");
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		
		for (int i = 0; i < identificadorCursos.size(); i++) {
			parametros.put("codigo"+i, identificadorCursos.get(i));
		}
		
		return select(jpql.toString(), parametros);
	}
}
