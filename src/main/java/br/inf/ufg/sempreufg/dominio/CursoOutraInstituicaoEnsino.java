package br.inf.ufg.sempreufg.dominio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.inf.ufg.sempreufg.dominio.enuns.Nivel;
import br.inf.ufg.sempreufg.dominio.enuns.TipoInstituicao;

@Entity(name="cursooutrainstituicaoensino")
public class CursoOutraInstituicaoEnsino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
	
	private String nomeUnidadeAcademica;
	private String IesDoCurso;
	
	@Enumerated(EnumType.STRING)
	private TipoInstituicao tipoInstituicao;
	
	private String urlInstitucional;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public String getNomeUnidadeAcademica() {
		return nomeUnidadeAcademica;
	}
	public void setNomeUnidadeAcademica(String nomeUnidadeAcademica) {
		this.nomeUnidadeAcademica = nomeUnidadeAcademica;
	}
	public String getIesDoCurso() {
		return IesDoCurso;
	}
	public void setIesDoCurso(String iesDoCurso) {
		IesDoCurso = iesDoCurso;
	}
	public TipoInstituicao getTipoInstituicao() {
		return tipoInstituicao;
	}
	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}
	public String getUrlInstitucional() {
		return urlInstitucional;
	}
	public void setUrlInstitucional(String urlInstitucional) {
		this.urlInstitucional = urlInstitucional;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
