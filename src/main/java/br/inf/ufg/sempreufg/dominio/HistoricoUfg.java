package br.inf.ufg.sempreufg.dominio;

public class HistoricoUfg {
	
	private int id;
	private int numeroMatriculaCurso;
	private int mesInicio;
	private int anoInicio;
	private int mesFinal;
	private int anoFinal;
	private String tituloTrabalhoFinal;
	
	public int getNumeroMatriculaCurso() {
		return numeroMatriculaCurso;
	}
	public void setNumeroMatriculaCurso(int numeroMatriculaCurso) {
		this.numeroMatriculaCurso = numeroMatriculaCurso;
	}
	public int getMesInicio() {
		return mesInicio;
	}
	public void setMesInicio(int mesInicio) {
		this.mesInicio = mesInicio;
	}
	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}
	public int getMesFinal() {
		return mesFinal;
	}
	public void setMesFinal(int mesFinal) {
		this.mesFinal = mesFinal;
	}
	public int getAnoFinal() {
		return anoFinal;
	}
	public void setAnoFinal(int anoFinal) {
		this.anoFinal = anoFinal;
	}
	public String getTituloTrabalhoFinal() {
		return tituloTrabalhoFinal;
	}
	public void setTituloTrabalhoFinal(String tituloTrabalhoFinal) {
		this.tituloTrabalhoFinal = tituloTrabalhoFinal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
