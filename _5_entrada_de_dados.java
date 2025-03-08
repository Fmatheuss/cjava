package curso_java;
import java.util.Locale;
import java.util.Scanner;
public class _5_entrada_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // ativado o padrao US os  numeros devem ser escrito com ponto decimal "."
			System.out.println("Digite um valor para X"); //inicio da entrada de dados
		Scanner sc= new Scanner (System.in);
		char x; //p/ captar caracter
		double y;
		String z;
		x= sc.next().charAt(0);
			System.out.println("digite um valor numerico para Y");
			
		y=sc.nextDouble(); //fim da entrada de dados (cso eu de um tipo primitivo a variavel que vai ser lida, teno que informar no next int
			
			System.out.println("digite uma frase");
			sc.nextLine(); //absorve a quebra pendente para eu receber a resposta de Z
			z=sc.nextLine();	
		sc.close(); 
			
			System.out.println("Você digitou");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
//para ler uma linha inteira, usar o sc.nextLine()
	//se voce usa um comando diferente do NextLine,e da uma quebra de linha ela vai ficar penente na entrada padrão.
	//ou seja, se vc der NextLine ela vaai receber a quebra de linha pendente.	
	
	}

}
