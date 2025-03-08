package Exercicios;
import java.util.Scanner;
public class Ex_7_ext_Cond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Digite um número");
		a= sc.nextInt();
		sc.close();
		if(a < 0) {
			System.out.println("Negativo");
			}
			else {System.out.println("Não negativo");
				
		}
	}

}
