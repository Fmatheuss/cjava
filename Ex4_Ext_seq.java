package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Ex4_Ext_seq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int N,H;
		double SALARY,SHORA;
		
		
		N = sc.nextInt();
		H = sc.nextInt();
		SHORA = sc.nextDouble();
		
		SALARY = H*SHORA;
		
		System.out.println("NUMBER = "+ N);
		System.out.printf("SALARY = U$ %.2f%n",SALARY);
	sc.close();
	}

}
