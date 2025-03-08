package curso_java;

import java.util.Scanner;

public class _8_exp_condicional_ternaria {

	public static void main(String[] args) {
		//(condição)? valor_se_verdade : valor_se_mentira
		Scanner sc= new Scanner (System.in);
		double preco;
		preco = sc.nextDouble();
		String valor = (preco > 35) ? "caro" : "barato"; //essa função me faz evitar a escrita de um if elss simples
		sc.close();
		System.out.println(valor);
	}

}
