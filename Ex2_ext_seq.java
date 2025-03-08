package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Ex2_ext_seq {

	public static void main(String[] args) {
	double raio,area;
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculador de área do Circulo ");
	System.out.println("Digite o valor do Raio");
	raio = sc.nextDouble();
	area=3.14159*Math.pow(raio,2);
	System.out.println("A área do circulo é igual a "+area);
	sc.close();
	}

}
