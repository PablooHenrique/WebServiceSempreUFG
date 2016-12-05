package br.inf.ufg.sempreufg.geracaodados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.SessionFactory;

import br.inf.ufg.sempreufg.dominio.CursoUfg;
import br.inf.ufg.sempreufg.dominio.Egresso;
import br.inf.ufg.sempreufg.dominio.enuns.Sexo;
import br.inf.ufg.sempreufg.dominio.enuns.VisibilidadeDados;
import br.inf.ufg.sempreufg.main.Application;
import br.inf.ufg.sempreufg.service.CursoUfgService;
import br.inf.ufg.sempreufg.service.EgressoService;

public class MockupEgresso extends Mockup{
	
	public void gerarEgresos(String diretorio){
		List<String> dadosArquivo = extrairDadosArquivo(diretorio);
		SessionFactory sessionFactory = Application.getInstance().getSessionFactory();
		Sexo sexo;
		LocalDate dataNascimento;
		for (String dados : dadosArquivo) {
			String[] infoEgresso = dados.split(";");
			
			if (infoEgresso[2].equals("F")) {
				sexo = Sexo.FEMININO;
			}else{
				sexo = Sexo.MASCULINO;
			}
			
			String[] infoDataNascimento = infoEgresso[1].split("/");
			dataNascimento = LocalDate.of(Integer.valueOf(infoDataNascimento[2]), Integer.valueOf(infoDataNascimento[1]), Integer.valueOf(infoDataNascimento[0]));
			
			Egresso egresso = criarEgresso(criarListaCursoUfg(), infoEgresso[0], infoEgresso[3], dataNascimento, sexo);
			new EgressoService(sessionFactory).salvar(egresso);
		}
	}
	
	private List<CursoUfg> criarListaCursoUfg() {
		List<CursoUfg> cursos = new ArrayList<CursoUfg>();
		
		SessionFactory sessionFactory = Application.getInstance().getSessionFactory();
		List<CursoUfg> cursosService = new CursoUfgService(sessionFactory).listar();
		if (cursosService != null) {
			int size = cursosService.size();
			int posicao = new Random().nextInt(size);
			if (posicao == 0) {
				posicao = 1;
			}
			cursos.add(cursosService.get(posicao));
		}
		return cursos;
	}

	private String gerarMatricula(){
		String matricula;
		
		matricula = String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		matricula = matricula + String.valueOf(new Random().nextInt(10));
		
		return matricula;
	}
	
	private List<String> extrairDadosArquivo(String diretorio) {
		File arquivoEgresso = carregarArquivo(diretorio);
		BufferedReader br;
		List<String> egressos = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(arquivoEgresso));
			while (br.ready()) {

				String linha = br.readLine();
				egressos.add(linha);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return egressos;
	}
	
	private Egresso criarEgresso(List<CursoUfg> cursosUfg, String nome, String nomeMae, LocalDate dataNascimento, Sexo sexo){
		Egresso egresso = new Egresso();
		egresso.setNumeroMatricula(gerarMatricula());
		egresso.setCursosUfg(cursosUfg);
		egresso.setDataNascimento(dataNascimento);
		egresso.setEmail("ufg@email.com");
//		egresso.setHistoricoEnsinoMedio(new HistoricoEnsinoMedio());
//		egresso.setHistoricoUfg(new ArrayList<HistoricoUfg>());
//		egresso.setCursosDeOutraInstituicaoEnsino(new ArrayList<CursoOutraInstituicaoEnsino>());
//		egresso.setInstituicaoEnsinoMedio(new InstituicaoEnsinoMedio());
		egresso.setNome(nome);
		egresso.setNomeMae(nomeMae);
//		egresso.setResidencia(new Residencia());
		egresso.setSexo(sexo);
		egresso.setVisibilidadeDeDados(VisibilidadeDados.PUBLICO);
		
		return egresso;
	}
}
