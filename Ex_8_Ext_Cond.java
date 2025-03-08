package Exercicios;
import java.util.Scanner;
public class Ex_8_Ext_Cond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		
		System.out.println("Digite um número");
		a=sc.nextInt();
		sc.close();

		if (a % 2 == 0) { 
			System.out.println("Par");
		} else {
			System.out.println("Impar");}
	};

}
