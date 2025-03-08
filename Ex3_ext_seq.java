package Exercicios;
import java.util.Scanner;
public class Ex3_ext_seq {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A,B,C,D,DIFERENCA;
		System.out.println("A=");
		A = sc.nextInt();
		System.out.println("B=");
		B = sc.nextInt();
		System.out.println("C=");
		C = sc.nextInt();
		System.out.println("D=");	
		D = sc.nextInt();
		DIFERENCA = (A*B-C*D);
		System.out.println("DIFERENÇA = "+DIFERENCA);
		sc.close();
	}

}
