package Exercicios;
import java.util.Scanner;
public class Ex1_ext_seq {


	public static void main(String[] args) {
		int a,b,SOMA;
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Digite um valor inteiro");	
		a=sc.nextInt();
	System.out.println("Digite outro valor inteiro");	
		b=sc.nextInt();
		SOMA= a+b;
	System.out.println("A soma desses valores é igual a " + SOMA);
		
		sc.close();
	}

}
