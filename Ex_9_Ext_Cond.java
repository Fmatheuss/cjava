package Exercicios;
import java.util.Scanner;
public class Ex_9_Ext_Cond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	if(a % b == 0 || b % a == 0){
		System.out.println("São Multiplos");
	}
	else {System.out.println("Não são Multiplos");}
	
	}

}
