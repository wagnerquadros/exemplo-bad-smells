import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que realiza os filtros, pesquisas e cálculos para elaboração do relatório.
 * @author System.out.print Inc.
 *
 */

public class EntrevistadoVetor {

	public static List<Entrevistado> criarEntrevistado (String line, BufferedReader br) throws IOException {
		
		List<Entrevistado> lista = new ArrayList<Entrevistado>();
		
		while (line != null){
			String[] vetor = line.split(";");
			String genero = vetor[0];
			String idade = vetor[1];
			String escolaridade = vetor[2];
			String regiao = vetor[3];
			String tecnologia = vetor [4];
			String area = vetor [5];
	
			Entrevistado entrevistado = new Entrevistado (genero, idade, escolaridade, regiao, tecnologia,area);
			lista.add(entrevistado);
					
			line = br.readLine();		
		}
		
		return lista;
	}
	
	//Calcula Percentual====================================
	public static String getPercent(double valor, int qtd) {
		float percent = (float) (valor*100/qtd);
		String percentFormat = String.format("%.2f", percent);
		return percentFormat;
	}
	
	
	
	//Estatisticas====================================================
		
	//Sexo============================================================
	public static double qtdMasculino(List<Entrevistado> lista) {
		double qtdMasculino = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getGenero().equalsIgnoreCase("m")) {
				qtdMasculino++;
			}
		}	
		return qtdMasculino;
	}
	
	public static double qtdFeminino(List<Entrevistado> lista) {
		double qtdFeminino = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getGenero().equalsIgnoreCase("f")) {
				qtdFeminino++;
			}
		}	
		return qtdFeminino;
	}
	
	public static double qtdOutros(List<Entrevistado> lista) {
		double qtdOutros = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getGenero().equalsIgnoreCase("o")) {
				qtdOutros++;
			}
		}	
		return qtdOutros;
	}
	
	//Idade=============================================================================
	public static int qtdAte15(List<Entrevistado> lista) {
		int qtdAte15 = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getIdade().equalsIgnoreCase(" Até 15 anos")) {
				qtdAte15++;
			}
		}	
		return qtdAte15;
	}
	
	public static int qtd16a29(List<Entrevistado> lista) {
		int qtd16a29 = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getIdade().equalsIgnoreCase(" De 16 a 29 anos")) {
				qtd16a29++;
			}
		}	
		return qtd16a29;
	}
	
	public static int qtd30a59(List<Entrevistado> lista) {
		int qtd30a59 = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getIdade().equalsIgnoreCase(" De 30 a 59 anos")) {
				qtd30a59++;
			}
		}	
		return qtd30a59;
	}
	
	public static int qtdAcima60(List<Entrevistado> lista) {
		int qtdAcima60 = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getIdade().equalsIgnoreCase(" Acima de 60 anos")) {
				qtdAcima60++;
			}
		}	
		return qtdAcima60;
	}
	
	//Escolaridade========================================================================================
	public static int qtdEFIncompleto(List<Entrevistado> lista) {
		int qtdEFIncompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino fundamental incompleto")) {
				qtdEFIncompleto++;
			}
		}	
		return qtdEFIncompleto;
	}
	
	public static int qtdEFCompleto(List<Entrevistado> lista) {
		int qtdEFCompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino fundamental completo")) {
				qtdEFCompleto++;
			}
		}	
		return qtdEFCompleto;
	}
	
	public static int qtdMedioIncompleto(List<Entrevistado> lista) {
		int qtdMedioIncompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino médio incompleto")) {
				qtdMedioIncompleto++;
				
			}
		}	
		return qtdMedioIncompleto;
	}
	
	public static int qtdMedioCompleto(List<Entrevistado> lista) {
		int qtdMedioCompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino médio completo")) {
				qtdMedioCompleto++;
			}
		}	
		return qtdMedioCompleto;
	}
	
	public static int qtdSupIncompleto(List<Entrevistado> lista) {
		int qtdSupIncompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino superior incompleto")) {
				qtdSupIncompleto++;
			}
		}	
		return qtdSupIncompleto;
	}
	
	public static int qtdSupCompleto(List<Entrevistado> lista) {
		int qtdSupCompleto = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getEscolaridade().equalsIgnoreCase(" Ensino superior completo")) {
				qtdSupCompleto++;
			}
		}	
		return qtdSupCompleto;
	}
	
	//Região========================================================================================
	public static int qtdCidadeAlta(List<Entrevistado> lista) {
		int qtdCidadeAlta = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Cidade Alta/Aguateiros")) {
				qtdCidadeAlta++;
			}
		}	
		return qtdCidadeAlta;
	}
	
	public static int qtdExtremoLeste(List<Entrevistado> lista) {
		int qtdExtremoLeste = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Extremo Leste")) {
				qtdExtremoLeste++;
			}
		}	
		return qtdExtremoLeste;
	}
	
	public static int qtdExtremoOeste(List<Entrevistado> lista) {
		int qtdExtremoOeste = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Extremo Oeste")) {
				qtdExtremoOeste++;
			}
		}	
		return qtdExtremoOeste;
	}
	
	public static int qtdLeste(List<Entrevistado> lista) {
		int qtdLeste = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Leste/Ibirapuitã")) {
				qtdLeste++;
			}
		}	
		return qtdLeste;
	}
	
	public static int qtdNorte(List<Entrevistado> lista) {
		int qtdNorte = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Norte")) {
				qtdNorte++;
			}
		}	
		return qtdNorte;
	}
	
	public static int qtdOeste(List<Entrevistado> lista) {
		int qtdOeste = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Oeste/Regalado")) {
				qtdOeste++;
			}
		}	
		return qtdOeste;
	}
	
	public static int qtdSul(List<Entrevistado> lista) {
		int qtdSul = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getRegiao().equalsIgnoreCase(" Região Sul")) {
				qtdSul++;
			}
		}	
		return qtdSul;
	}
	
	//Tecnologia=============================================================================
	public static int qtdCpuPessoal(List<Entrevistado> lista) {
		int qtdCpuPessoal = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Computador Pessoal")) {
				qtdCpuPessoal++;
			}
		}	
		return qtdCpuPessoal;
	}
	
	public static int qtdNotebook(List<Entrevistado> lista) {
		int qtdNotebook = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Notebook ou Netbook")) {
				qtdNotebook++;
			}
		}	
		return qtdNotebook;
	}
	
	public static int qtdSmartphone(List<Entrevistado> lista) {
		int qtdSmartphone = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Smartphone")) {
				qtdSmartphone++;
			}
		}	
		return qtdSmartphone;
	}
	
	public static int qtdTablet(List<Entrevistado> lista) {
		int qtdTablet = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Tablet")) {
				qtdTablet++;
			}
		}	
		return qtdTablet;
	}
	
	public static int qtdNenhuma(List<Entrevistado> lista) {
		int qtdNenhuma = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equals(" Nenhuma")) {
				qtdNenhuma++;
			}
		}	
		return qtdNenhuma;
	}
	
	//Area========================================================================
	public static int qtdAlimentacao(List<Entrevistado> lista) {
		int qtdAlimentacao = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Alimentação")) {
				qtdAlimentacao++;
			}
		}	
		return qtdAlimentacao;
	}
	
	public static int qtdCultura(List<Entrevistado> lista) {
		int qtdCultura = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Cultura")) {
				qtdCultura++;
			}
		}	
		return qtdCultura;
	}
	
	public static int qtdEducacao(List<Entrevistado> lista) {
		int qtdEducacao = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Educação")) {
				qtdEducacao++;
			}
		}	
		return qtdEducacao;
	}
	
	public static int qtdEmprego(List<Entrevistado> lista) {
		int qtdEmprego = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Emprego")) {
				qtdEmprego++;
			}
		}	
		return qtdEmprego;
	}
	
	public static int qtdLazer(List<Entrevistado> lista) {
		int qtdLazer = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Lazer")) {
				qtdLazer++;
			}
		}	
		return qtdLazer;
	}
	
	public static int qtdSaude(List<Entrevistado> lista) {
		int qtdSaude = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Saúde")) {
				qtdSaude++;
			}
		}	
		return qtdSaude;
	}
	
	public static int qtdSeguranca(List<Entrevistado> lista) {
		int qtdSeguranca = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Segurança")) {
				qtdSeguranca++;
			}
		}	
		return qtdSeguranca;
	}
	
	public static int qtdTransporte(List<Entrevistado> lista) {
		int qtdTransporte = 0;
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getArea().equalsIgnoreCase(" Transporte")) {
				qtdTransporte++;
			}
		}	
		return qtdTransporte;
	}
	
	//Faixa etária do Smartphone==================================================================
	public static String smartphoneIdade(List<Entrevistado> lista) {
		
		int qtd15 = 0;
		int qtd16 = 0;
		int qtd30 = 0;
		int qtd60 = 0;
	
		String faixaSmartphone15 = "";
		String faixaSmartphone16 = "";
		String faixaSmartphone30 = "";
		String faixaSmartphone60 = "";
		
		for(int i=0; i < lista.size(); i++) {
			if(((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Smartphone")) {
				if((((Entrevistado) lista.get(i)).getIdade().equalsIgnoreCase(" Até 15 anos"))) {
					qtd15++;
				} else if((((Entrevistado)lista.get(i)).getIdade().equalsIgnoreCase(" De 16 a 29 anos"))) {
					qtd16++;
				} else if((((Entrevistado)lista.get(i)).getIdade().equalsIgnoreCase(" De 30 a 59 anos"))) {
					qtd30++;
				} else if((((Entrevistado)lista.get(i)).getIdade().equalsIgnoreCase(" Acima de 60 anos"))) {
					qtd60++;
				}
				
			}
		}

		if(qtd15>=qtd16 && qtd15>=qtd30 && qtd15>=qtd60) {
					faixaSmartphone15 = "Até 15 anos";
		}

		if(qtd16>=qtd15 && qtd16>=qtd30 && qtd16>=qtd60) {
					faixaSmartphone16 ="De 16 a 29 anos";
		}

		if(qtd30>=qtd15 && qtd30>=qtd16 && qtd30>=qtd60) {
					faixaSmartphone30 = "De 30 a 59 anos";
		}
		
		if(qtd60>=qtd15 && qtd60>=qtd16 && qtd60>=qtd30) {
					faixaSmartphone60 = "Acima de 60 anos";
		}

		return faixaSmartphone15 +" "+ faixaSmartphone16 +" "+ faixaSmartphone30 +" "+ faixaSmartphone60;
	}
	
	
	//Tecnologia Faixa até 15 anos================================================================
	public static String ate15Tecnologia(List<?> lista) {
		int pc = 0;
		int note = 0;
		int smart = 0;
		int tablet = 0;

		String tecJovensPc = "";
		String tecJovensNote = "";
		String tecJovensTab = "";
		String tecJovensSmart = "";
		
		for(int i=0; i < lista.size(); i++) {
			if((((Entrevistado) lista.get(i)).getIdade().equals(" Até 15 anos"))) {
				if((((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Computador Pessoal"))) {
					pc++;
				}
				if((((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Notebook ou Netbook"))) {
					note++;
				}
				if((((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Smartphone"))) {
					smart++;
				}
				if((((Entrevistado) lista.get(i)).getTecnologia().equalsIgnoreCase(" Tablet"))) {
					tablet++;
				}
			}

		}
		
		if(pc<=note && pc<=smart && pc<=tablet) {
			tecJovensPc = "Computardor Pessoal";
		} 
		if(note<=pc && note<=smart && note<=tablet) {
			tecJovensNote = "Notebook ou Netbook";
		}
		if(smart<=pc && smart<=note && smart<=tablet) {
			tecJovensSmart = "Smartphone";
		}
		if(tablet<=pc && tablet<=note && tablet<=smart) {
			tecJovensTab = "Tablet";
		}
		return tecJovensPc  + tecJovensNote + tecJovensSmart + tecJovensTab;
		
	}
	
}
