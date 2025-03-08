package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Ex5_ext_seq {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int c1,n1,c2,n2;
		double p1, p2, vp;
	
	
	c1= sc.nextInt();
	n1= sc.nextInt();	
	p1= sc.nextDouble();	
	
	c2= sc.nextInt();
	n2= sc.nextInt();	
	p2= sc.nextDouble();	
	
	vp= n1*p1+n2*p2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f ",vp);
	sc.close();
	}

}
