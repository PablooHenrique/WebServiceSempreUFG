package br.inf.ufg.sempreufg.geracaodados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.SessionFactory;

import br.inf.ufg.sempreufg.dominio.CursoUfg;
import br.inf.ufg.sempreufg.dominio.enuns.Nivel;
import br.inf.ufg.sempreufg.dominio.enuns.TipoResolucao;
import br.inf.ufg.sempreufg.dominio.enuns.Turno;
import br.inf.ufg.sempreufg.main.Application;
import br.inf.ufg.sempreufg.service.CursoUfgService;

public class MockupCursoUfg extends Mockup {

	private String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
								  "R", "S", "T", "U", "V", "X", "Y", "W", "Z" };

	public void gerarCursosUfg(String diretorio, Nivel nivel){
		List<String> nomes = extrairDadosArquivo(diretorio);
		SessionFactory sessionFactory = Application.getInstance().getSessionFactory();
		
		for (String nome : nomes) {
			CursoUfg curso = criarCurso(nome, nivel);
			new CursoUfgService(sessionFactory).salvar(curso);
		}
	}
	
	private String gerarCodigoCurso() {
		String codigo = alfabeto[(new Random().nextInt(26))];
		codigo = codigo + alfabeto[(new Random().nextInt(26))];
		codigo = codigo + alfabeto[(new Random().nextInt(26))];

		codigo = codigo + String.valueOf(new Random().nextInt(10));
		codigo = codigo + String.valueOf(new Random().nextInt(10));
		codigo = codigo + String.valueOf(new Random().nextInt(10));
		codigo = codigo + String.valueOf(new Random().nextInt(10));

		return codigo;
	}

	private List<String> extrairDadosArquivo(String diretorio) {
		File arquivoCursoGraduacao = carregarArquivo(diretorio);
		BufferedReader br;
		List<String> nomesDoCurso = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(arquivoCursoGraduacao));
			while (br.ready()) {

				String linha = br.readLine();
				nomesDoCurso.add(linha);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return nomesDoCurso;
	}
	
	private CursoUfg criarCurso(String nome, Nivel nivel){
		CursoUfg curso = new CursoUfg();
		
		curso.setCodigo(gerarCodigoCurso());
		curso.setePresencial(true);
		curso.setNome(nome);
		curso.setNivel(nivel);
		curso.setNumeroResolucao(123456);
		curso.setTipoResolucao(TipoResolucao.CONSUNI);
		curso.setTurno(Turno.NOTURNO);
		
		return curso;
	}
}
