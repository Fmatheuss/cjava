package curso_java;
import java.util.Scanner;
public class _7_sintaxe_opicional {

	public static void main(String[] args) {
		//a +=b; => a=a+b. para outras funções matematicas, substitua pelo operador desejado
// switch case: switch troca o valor digitado por uma resposta desejada
		Scanner sc= new Scanner(System.in);
		int x;
		String dia;
		x= sc.nextInt();
		sc.close();
		switch (x) {
		case 1: //nesse caso foi condicionado o caso em que se digita "1"
			dia = "domingo"; //a resposta que é esperada
			break; // para o caso 1
		case 2: // mesma coisa, porem pra quando se digita "2"
			dia = "segunda";
			break;
		default: //caso não esteja no intervalo de casos, a maquina ira responder a seguinte coisa:
			dia = "invalido";
			break;
		
		}
		System.out.println("Dia da semana " + dia);
	}

}

//Switch-case
//Switch (expressao){
//case: valor1:
//comando 1;
//comaando2;  (pode ser montado um bloco com mais de um comando que corresponda aquele valor do caso
//brake;
//}
