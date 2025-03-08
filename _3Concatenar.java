//package curso_java;

//public class Concatenar {

	//public static void main(String[] args) {
		//double x1 = 12.3224;
		//double x2 = 35.2433;
		//double z = (x1 + x2);
		//System.out.println ("total = "+ z + " reais");
	// para concatenar varios elementos podemos usar o '%f' para marcarmos aonde ficarão os resultados no print:
		
		//System.out.printf(" o primeiro valor é %.2f %n O segundo valor é %.2f %n o total é %.2f", x1, x2, z);
		// %.2f= numero de casas decimais; %n pula a linha.
		
		
//}
//	}

// o '+', é usado como um simbolo para concatenar valores das variáveis com os textos.

package curso_java;

public class _3Concatenar {

	public static void main(String[] args) {
		String nome= "Lucas";
		int idade= 25;
		double renda= 7500.00;
		System.out.printf(" Seu nome é %s %n Ele tem %d anos %n Sua renda é de R$%.2f",nome,idade,renda);
		



}
}