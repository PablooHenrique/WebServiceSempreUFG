package br.inf.ufg.sempreufg.dominio;

import br.inf.ufg.sempreufg.dominio.enuns.TipoInstituicao;

public class InstituicaoEnsinoMedio {
	
	private String nome;
	private TipoInstituicao tipoInstituicao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoInstituicao getTipoInstituicao() {
		return tipoInstituicao;
	}
	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}
	
	
}
