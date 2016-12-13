package br.inf.ufg.sempreufg.geracaodados;

import br.inf.ufg.sempreufg.dominio.enuns.Nivel;

public class GeraradorDados {
	
	public static void main(String[] args) {
		new GeraradorDados().gerarDadosGraduacao();
		new GeraradorDados().gerarDadosPosGraduacao();
		new GeraradorDados().gerarDadosEgresso();
	}
	
	public void gerarDadosGraduacao(){
		MockupCursoUfg mockupCursoUfg = new MockupCursoUfg();
		mockupCursoUfg.gerarCursosUfg("/cursosGraducao.txt", Nivel.BACHARELADO);
	}
	
	public void gerarDadosPosGraduacao(){
		MockupCursoUfg mockupCursoUfg = new MockupCursoUfg();
		mockupCursoUfg.gerarCursosUfg("/cursosPosGraduacao.txt", Nivel.ESPECIALIZACAO);
	}
	
	public void gerarDadosEgresso(){
		MockupEgresso mockupEgresso = new MockupEgresso();
		mockupEgresso.gerarEgresos("/DadosImportacao.txt");
	}
}
