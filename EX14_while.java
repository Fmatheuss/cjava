package Exercicios;
import java.util.Scanner;
public class EX14_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int gasolina=0;
		int alcool=0;
		int diesel=0;
		int cod= sc.nextInt();
		while (cod!=4) {
			if (cod==1) {
				gasolina = gasolina + 1;
				
			}
			else if(cod == 2) {
				alcool = alcool + 1;
				
			}
			else if(cod == 3) {
				diesel = diesel + 1;
				
			}
			cod=sc.nextInt();
		
			
		}
		System.out.println("Muito obrigado!");
		System.out.println("Gasolina:"+gasolina);
		System.out.println("alcool:"+alcool);
		System.out.println("Diesel:"+diesel);
		sc.close();	
	}

}
