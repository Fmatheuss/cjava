package curso_java;
import java.util.Scanner;
public class _10_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a= sc.nextInt();
		sc.close();
	
		while (a<10) {
			a=a+1;
			System.out.println(a);
		}
	} 

	}


