package curso_java;
import java.util.Scanner;
public class _5_1entdedados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String x;
		x = sc.nextLine();
		sc.close();
		System.out.printf("A frase é %n%s", x);
	}

}
//se voce usa um comando diferente do NextLine,e da uma quebra de linha ela vai ficar penente na entrada padrão.
//ou seja, se vc der NextLine ela vaai receber a quebra de linha pendente.
//como resolver adicione um nextline antes da resposta que vc deseja, ara absover a quebra pendente = limpar buffer de leitura