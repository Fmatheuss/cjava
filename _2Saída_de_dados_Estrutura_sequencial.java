package curso_java;
import java.util.Locale;

public class _2Saída_de_dados_Estrutura_sequencial {

	public static void main(String[] args) {
		int x = 25;  //  armazenei "25" na variavel inteira 'x'
		double j = 31.3234;
		System.out.println(x); //saida do dado
	//Para numeros decimais :
		
		System.out.println(j);
		Locale.setDefault(Locale.US); //usando issso, posso declarar como o padrão USA de resposta, trocando a ',' por '.' para todos os prints abaixo.
		System.out.printf("%.2f%n", j); // a expressão "%.zf%n%", x) limita a z casas decimais após a virgula.  
		System.out.printf("%.4f%n", j);
		
	
	}

}
