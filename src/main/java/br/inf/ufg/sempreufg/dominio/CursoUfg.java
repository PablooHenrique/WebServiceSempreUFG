package br.inf.ufg.sempreufg.dominio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import br.inf.ufg.sempreufg.dominio.enuns.Nivel;
import br.inf.ufg.sempreufg.dominio.enuns.TipoResolucao;
import br.inf.ufg.sempreufg.dominio.enuns.Turno;

@Entity(name="CursoUfg")
public class CursoUfg {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String codigo;
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
	
	@Enumerated(EnumType.STRING)
	private TipoResolucao tipoResolucao;
	
	private int numeroResolucao;
	
	@Type(type="true_false")
	private boolean ePresencial;
	
	@Enumerated(EnumType.STRING)
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
