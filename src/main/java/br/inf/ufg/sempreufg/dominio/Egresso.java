package br.inf.ufg.sempreufg.dominio;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.inf.ufg.sempreufg.dominio.enuns.Sexo;
import br.inf.ufg.sempreufg.dominio.enuns.VisibilidadeDados;


@Entity(name="egresso")
public class Egresso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String numeroMatricula;
	private String nome;
	private String nomeMae;
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	private String email;
	
	//Servico não vai exportar imagens
	private String fotoPrincipal;
	private String fotosAdicionais;
	
	@Enumerated(EnumType.STRING)
	private VisibilidadeDados visibilidadeDeDados;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "residencia")
	private Residencia residencia;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instituicaoEnsinoMedio")
	private InstituicaoEnsinoMedio instituicaoEnsinoMedio;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "historicoEnsinoMedio")	
	private HistoricoEnsinoMedio historicoEnsinoMedio;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="egresso_curso_outra_instituicao_ensino", joinColumns={@JoinColumn(name="egresso")}, inverseJoinColumns={@JoinColumn(name="cursos_outra_instituicao_ensino")})
	private List<CursoOutraInstituicaoEnsino> cursosDeOutraInstituicaoEnsino;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="egresso_historico_ufg", joinColumns={@JoinColumn(name="egresso")}, inverseJoinColumns={@JoinColumn(name="historico_ufg")})
	private List<HistoricoUfg> historicoUfg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getFotoPrincipal() {
		return fotoPrincipal;
	}

	public void setFotoPrincipal(String fotoPrincipal) {
		this.fotoPrincipal = fotoPrincipal;
	}

	public String getFotosAdicionais() {
		return fotosAdicionais;
	}

	public void setFotosAdicionais(String fotosAdicionais) {
		this.fotosAdicionais = fotosAdicionais;
	}

	public VisibilidadeDados getVisibilidadeDeDados() {
		return visibilidadeDeDados;
	}

	public void setVisibilidadeDeDados(VisibilidadeDados visibilidadeDeDados) {
		this.visibilidadeDeDados = visibilidadeDeDados;
	}

	public Residencia getResidencia() {
		return residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
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

	public List<HistoricoUfg> getHistoricoUfg() {
		return historicoUfg;
	}

	public void setHistoricoUfg(List<HistoricoUfg> historicoUfg) {
		this.historicoUfg = historicoUfg;
	} 
}
