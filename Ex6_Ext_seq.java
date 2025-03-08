package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Ex6_Ext_seq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A,B,C,AreaT,AreaC,AreaTp,AreaQ,AreaR;
		A= sc.nextDouble();
		B= sc.nextDouble();
		C= sc.nextDouble();
		
		AreaT= A*C/2.0;
		AreaC= 3.14159*Math.pow(C,2);
		AreaTp= (A+B)*C/2.0;
		AreaQ= Math.pow(B,2);
		AreaR= A*B;
		
		System.out.println("TRIANGULO: "+ AreaT);
		System.out.println("CIRCULO: "+ AreaC);
		System.out.println("TRAPEZIO: "+ AreaTp);
		System.out.println("QUADRADO: "+ AreaQ);
		System.out.println("RETANGULO: "+ AreaR);
		
sc.close();
	}

}
