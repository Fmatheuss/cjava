package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Ex_10_Ext_Cond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		int a,b;
		Double c,xs,xb,t,r;
		System.out.println("Codigo");
		a = sc.nextInt();
		System.out.println("Quantidade");
		b = sc.nextInt();
		sc.close();
		c=4.00;
		xs=4.50;
		xb=5.00;
		t=2.00;
		r=1.50;
		
		if(a==1) {
			System.out.printf("Total: R$%.2f", c*b);}
		if(a==2) {
			System.out.printf("Total: R$%.2f", xs*b);}
		if(a==3) {
				System.out.printf("Total: R$%.2f", xb*b);}
		if(a==4) {
					System.out.printf("Total: R$%.2f", t*b);
		}	
		if(a==5) {
			System.out.printf("Total: R$%.2f", r*b);
}	
		}  
	}


