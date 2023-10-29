import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
/**
 * Classe Main
 * @author System.out.print Inc.
 * 
 */
public class Main {
	

	public static void main(String[]args) throws IOException {
		
		try {
			String caminho = "Entrevistados.csv";
			BufferedReader br = Arquivo.buffer(caminho);
			String line = Arquivo.getLinhas(br);
			List<Entrevistado> lista = new ArrayList<>(EntrevistadoVetor.criarEntrevistado(line, br));
			Arquivo.criarRelatorio(lista);
			Arquivo.printConsole(lista);
			br.close();
		
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

/*
 * 1. Total de entrevistados
   2. Percentual de entrevistados do sexo feminino, do sexo masculino e que tenha se
      identificado como outro
   3. Número de entrevistados por faixa etária
   4. Percentual de entrevistados por grau de escolaridade
   5. Número de entrevistados com pelo menos o ensino superior completo
   6. A faixa etária que mais utiliza smartphone
   7. A tecnologia menos utilizada pelos entrevistados com idade até 15 anos
   8. Número de entrevistados por área prioritária
 */