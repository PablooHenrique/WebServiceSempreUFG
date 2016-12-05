package br.inf.ufg.sempreufg.dominio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.inf.ufg.sempreufg.dominio.enuns.TipoInstituicao;

@Entity(name="instituicaoensinomedio")
public class InstituicaoEnsinoMedio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	
	@Enumerated(EnumType.STRING)
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
