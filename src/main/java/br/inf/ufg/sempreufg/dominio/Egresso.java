package br.inf.ufg.sempreufg.dominio;

import java.time.LocalDate;
import java.util.BitSet;
import java.util.List;

import br.inf.ufg.sempreufg.dominio.enuns.Sexo;
import br.inf.ufg.sempreufg.dominio.enuns.VisibilidadeDados;

public class Egresso {
	
	private String numeroMatricula;
	private String nome;
	private String nomeMae;
	private LocalDate dataNascimento;
	private Sexo sexo;
	private String email;
	private BitSet fotoPrincipal;
	private BitSet fotosAdicionais;
	private VisibilidadeDados visibilidadeDeDados;
	private Residencia residencia;
	private InstituicaoEnsinoMedio instituicaoEnsinoMedio;
	private HistoricoEnsinoMedio historicoEnsinoMedio;
	private List<CursoOutraInstituicaoEnsino> cursosDeOutraInstituicaoEnsino;
	private List<CursoUfg> cursosUfg;
	private List<HistoricoUfg> historicoUfg; 
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BitSet getFotoPrincipal() {
		return fotoPrincipal;
	}
	public void setFotoPrincipal(BitSet fotoPrincipal) {
		this.fotoPrincipal = fotoPrincipal;
	}
	public BitSet getFotosAdicionais() {
		return fotosAdicionais;
	}
	public void setFotosAdicionais(BitSet fotosAdicionais) {
		this.fotosAdicionais = fotosAdicionais;
	}
	public VisibilidadeDados getVisibilidadeDeDados() {
		return visibilidadeDeDados;
	}
	public void setVisibilidadeDeDados(VisibilidadeDados visibilidadeDeDados) {
		this.visibilidadeDeDados = visibilidadeDeDados;
	}
	public InstituicaoEnsinoMedio getInstituicaoEnsinoMedio() {
		return instituicaoEnsinoMedio;
	}
	public void setInstituicaoEnsinoMedio(InstituicaoEnsinoMedio instituicaoEnsinoMedio) {
		this.instituicaoEnsinoMedio = instituicaoEnsinoMedio;
	}
	public HistoricoEnsinoMedio getHistoricoEnsinoMedio() {
		return historicoEnsinoMedio;
	}
	public void setHistoricoEnsinoMedio(HistoricoEnsinoMedio historicoEnsinoMedio) {
		this.historicoEnsinoMedio = historicoEnsinoMedio;
	}
	public List<CursoOutraInstituicaoEnsino> getCursosDeOutraInstituicaoEnsino() {
		return cursosDeOutraInstituicaoEnsino;
	}
	public void setCursosDeOutraInstituicaoEnsino(List<CursoOutraInstituicaoEnsino> cursosDeOutraInstituicaoEnsino) {
		this.cursosDeOutraInstituicaoEnsino = cursosDeOutraInstituicaoEnsino;
	}
	public List<CursoUfg> getCursosUfg() {
		return cursosUfg;
	}
	public void setCursosUfg(List<CursoUfg> cursosUfg) {
		this.cursosUfg = cursosUfg;
	}
	public Residencia getResidencia() {
		return residencia;
	}
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	public List<HistoricoUfg> getHistoricoUfg() {
		return historicoUfg;
	}
	public void setHistoricoUfg(List<HistoricoUfg> historicoUfg) {
		this.historicoUfg = historicoUfg;
	}
}
