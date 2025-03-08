package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class EX_11_Ext_Cond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Double a;
		a = sc.nextDouble();
		sc.close();
		
		if (a>=0 && a<=25) {
			System.out.println("Intervalo [0,25]");
		}
			else if (a>25 && a<=50) {
			System.out.println("Intervalo (0,25]");
		}
			else if (a>50 && a<=75) {
				System.out.println("Intervalo (50,75]");
			}
			else if (a>50 && a<=75) {
				System.out.println("Intervalo (50,75]");
			}
			else {
				System.out.println("Fora de intervalo");
			}
	}

}
