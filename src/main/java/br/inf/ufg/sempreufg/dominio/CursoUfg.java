package br.inf.ufg.sempreufg.dominio;

import br.inf.ufg.sempreufg.dominio.enuns.Nivel;
import br.inf.ufg.sempreufg.dominio.enuns.TipoResolucao;
import br.inf.ufg.sempreufg.dominio.enuns.Turno;

public class CursoUfg {
	
	private int id;
	private String codigo;
	private String nome;
	private Nivel nivel;
	private TipoResolucao tipoResolucao;
	private int numeroResolucao;
	private boolean ePresencial;
	private Turno turno;
	
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public TipoResolucao getTipoResolucao() {
		return tipoResolucao;
	}
	public void setTipoResolucao(TipoResolucao tipoResolucao) {
		this.tipoResolucao = tipoResolucao;
	}
	public int getNumeroResolucao() {
		return numeroResolucao;
	}
	public void setNumeroResolucao(int numeroResolucao) {
		this.numeroResolucao = numeroResolucao;
	}
	public boolean isePresencial() {
		return ePresencial;
	}
	public void setePresencial(boolean ePresencial) {
		this.ePresencial = ePresencial;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}