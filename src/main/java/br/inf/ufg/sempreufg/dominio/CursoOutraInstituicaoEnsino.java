package br.inf.ufg.sempreufg.dominio;

import br.inf.ufg.sempreufg.dominio.enuns.Nivel;
import br.inf.ufg.sempreufg.dominio.enuns.TipoInstituicao;

public class CursoOutraInstituicaoEnsino {
	
	private int id;
	private String nome;
	private Nivel nivel;
	private String nomeUnidadeAcademica;
	private String IesDoCurso;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
