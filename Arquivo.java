import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;

/**
 * Classe para que permite acessar e manipular dados de Arquivo.csv e salvar aqruivo .txt
 * @author System.out.print Inc.
 *
 */
public class Arquivo {
	

	public static BufferedReader buffer (String caminho) throws IOException {		

		InputStream fis = new FileInputStream(caminho);	
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		return br;
		
	}

	public static String getLinhas(BufferedReader br) throws IOException {
		
		String line1 = br.readLine(); //Descarte da Primeira linha
		String line = br.readLine(); //Leitura da segunda linha 
		return line;
	}
	
	public static void criarRelatorio (List<Entrevistado> lista) {
		try {
			FileWriter fw = new FileWriter("Relatório.txt");
			PrintWriter pw = new PrintWriter (fw);

			pw.println("Relatório:");
			pw.println("==========");
			pw.println("01 - Total de entrevistados: "+ lista.size());
			pw.println("");
			pw.println("02 - Percentual de entrevistados do sexo feminino, do sexo masculino e que tenha se identificado como outro:");
			pw.println("Masculino: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMasculino(lista), lista.size())+" %");
			pw.println("Feminino: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdFeminino(lista), lista.size())+" %");
			pw.println("Outros: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdOutros(lista), lista.size())+" %");
			pw.println("");
			pw.println("03 - Número de entrevistados por faixa etária:");
			pw.println("Até 15 anos: "+ EntrevistadoVetor.qtdAte15(lista));
			pw.println("De 16 a 29 anos: " + EntrevistadoVetor.qtd16a29(lista));
			pw.println("De 30 a 59 anos: " + EntrevistadoVetor.qtd30a59(lista));
			pw.println("Acima de 60 anos: " + EntrevistadoVetor.qtdAcima60(lista));
			pw.println("");
			pw.println("04 - Percentual de entrevistados por grau de escolaridade");
			pw.println("Ensino Fundamental Incompleto: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdEFIncompleto(lista), lista.size())+" %");
			pw.println("Ensino Fundamental Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdEFCompleto(lista), lista.size())+" %");
			pw.println("Ensino Médio Incompleto: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMedioIncompleto(lista),lista.size())+" %");
			pw.println("Ensino Médio Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMedioCompleto(lista), lista.size())+" %");
			pw.println("Ensino Superior Incompleto: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdSupIncompleto(lista), lista.size())+" %");
			pw.println("Ensino Superior Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdSupCompleto(lista), lista.size())+" %");
			pw.println("");
			pw.println("05 - Número de entrevistados com pelo menos o ensino superior completo:");
			pw.println("Entrevistados com Ensino Superior: " + EntrevistadoVetor.qtdSupCompleto(lista));
			pw.println("");
			pw.println("06 - A faixa etária que mais utiliza smartphone: " + EntrevistadoVetor.smartphoneIdade(lista));
			pw.println("");
			pw.println("07 - A tecnologia menos utilizada pelos entrevistados com idade até 15 anos: "+EntrevistadoVetor.ate15Tecnologia(lista));
			pw.println("");
			pw.println("08 - Número de entrevistados por área prioritária:");
			pw.println("Area de Alimentação: "+ EntrevistadoVetor.qtdAlimentacao(lista));
			pw.println("Area de Cultura: " + EntrevistadoVetor.qtdCultura(lista));
			pw.println("Area de Educacao: " + EntrevistadoVetor.qtdEducacao(lista));
			pw.println("Area de Emprego: " + EntrevistadoVetor.qtdEmprego(lista));
			pw.println("Area de Transporte: " + EntrevistadoVetor.qtdTransporte(lista));
			pw.println("Area de Lazer: " + EntrevistadoVetor.qtdLazer(lista));
			pw.println("Area de Saúde: " + EntrevistadoVetor.qtdSaude(lista));
			pw.println("Area de Segurança: " + EntrevistadoVetor.qtdSeguranca(lista));
						
			pw.flush();
			pw.close();
			fw.close();
			
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());

		}
	}

	public static void printConsole(List<Entrevistado> lista) {
		System.out.println("Relatório:");
		System.out.println("==========");
		System.out.println("01 - Total de entrevistados: "+ lista.size());
		System.out.println();
		System.out.println("02 - Percentual de entrevistados do sexo feminino, do sexo masculino e que tenha se identificado como outro:");
		System.out.println("Masculino: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMasculino(lista), lista.size())+" %");
		System.out.println("Feminino: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdFeminino(lista), lista.size())+" %");
		System.out.println("Outros: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdOutros(lista), lista.size())+" %");
		System.out.println();
		System.out.println("03 - Número de entrevistados por faixa etária:");
		System.out.println("Até 15 anos: "+ EntrevistadoVetor.qtdAte15(lista));
		System.out.println("De 16 a 29 anos: " + EntrevistadoVetor.qtd16a29(lista));
		System.out.println("De 30 a 59 anos: " + EntrevistadoVetor.qtd30a59(lista));
		System.out.println("Acima de 60 anos: " + EntrevistadoVetor.qtdAcima60(lista));
		System.out.println();
		System.out.println("04 - Percentual de entrevistados por grau de escolaridade");
		System.out.println("Ensino Fundamental Incompleto: "+ EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdEFIncompleto(lista), lista.size())+" %");
		System.out.println("Ensino Fundamental Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdEFCompleto(lista), lista.size())+" %");
		System.out.println("Ensino Médio Incompleto: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMedioIncompleto(lista),lista.size())+" %");
		System.out.println("Ensino Médio Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdMedioCompleto(lista), lista.size())+" %");
		System.out.println("Ensino Superior Incompleto: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdSupIncompleto(lista), lista.size())+" %");
		System.out.println("Ensino Superior Completo: " + EntrevistadoVetor.getPercent(EntrevistadoVetor.qtdSupCompleto(lista), lista.size())+" %");
		System.out.println();
		System.out.println("05 - Número de entrevistados com pelo menos o ensino superior completo:");
		System.out.println("Entrevistados com Ensino Superior: " + EntrevistadoVetor.qtdSupCompleto(lista));
		System.out.println();
		System.out.println("06 - A faixa etária que mais utiliza smartphone: " + EntrevistadoVetor.smartphoneIdade(lista));
		System.out.println();
		System.out.println("07 - A tecnologia menos utilizada pelos entrevistados com idade até 15 anos: "+EntrevistadoVetor.ate15Tecnologia(lista));
		System.out.println();
		System.out.println("08 - Número de entrevistados por área prioritária:");
		System.out.println("Area de Alimentação: "+ EntrevistadoVetor.qtdAlimentacao(lista));
		System.out.println("Area de Cultura: " + EntrevistadoVetor.qtdCultura(lista));
		System.out.println("Area de Educacao: " + EntrevistadoVetor.qtdEducacao(lista));
		System.out.println("Area de Emprego: " + EntrevistadoVetor.qtdEmprego(lista));
		System.out.println("Area de Transporte: " + EntrevistadoVetor.qtdTransporte(lista));
		System.out.println("Area de Lazer: " + EntrevistadoVetor.qtdLazer(lista));
		System.out.println("Area de Saúde: " + EntrevistadoVetor.qtdSaude(lista));
		System.out.println("Area de Segurança: " + EntrevistadoVetor.qtdSeguranca(lista));
		System.out.println();
	}
}

	
