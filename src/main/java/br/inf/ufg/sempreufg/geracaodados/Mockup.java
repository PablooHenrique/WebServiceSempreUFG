package br.inf.ufg.sempreufg.geracaodados;

import java.io.File;

public class Mockup {
	protected String obterCaminhoAbsolutoAplicacao(){
		return new File(".").getAbsolutePath();
	}
	
	protected File carregarArquivoCursosGraducao(String diretorio){
		return new File(obterCaminhoAbsolutoAplicacao()+diretorio);
	}
}
