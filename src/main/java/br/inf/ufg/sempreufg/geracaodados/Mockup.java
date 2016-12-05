package br.inf.ufg.sempreufg.geracaodados;

import java.io.File;

public class Mockup{
	
	protected String obterCaminhoAbsolutoAplicacao(){
		return new File(".").getAbsolutePath();
	}
	
	protected File carregarArquivo(String diretorio){
		return new File(obterCaminhoAbsolutoAplicacao()+diretorio);
	}
}
