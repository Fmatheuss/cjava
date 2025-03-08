package curso_java;

public class _12_conceitos {
	public static void main (String[] args) {
	String teste = "juvenal";
	
	//String s1 = teste.toUpperCase();
	String s2 = teste.substring(2,7);
	String s4 = teste.replace('a','e');
	
	
	System.out.printf("%s\n", s4);
	System.out.printf("%s", s2);
	}
}
//Funções interessantes para String
//Formatar: toLowerCase() ; toUpperCase(), trim() {remove espaços em branco}
//Recortar: substring (inicio), substring(inicio,fim)
//substituir: Replace (tipo, tipo) char ou string



//