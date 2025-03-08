package curso_java;

public class _6_Funcoes_mat_java {

	public static void main(String[] args) {
		double x=4;
		double y=3;
		double z=-5;
		double A,B,C;
		 A = Math.sqrt(x);  //- Raiz de x
		 B = Math.pow(x,y); //- potencia da base X elevada a Y
		 C = Math.abs(z);   //- valor absoluto de x (valor sem o negativo, modulo)
		System.out.println("Raiz de "+ x + " = " + A);
		System.out.println("Potência de "+ x + " elevada a " + y + "=" + B);
		System.out.println("Valor absoluto de"+ z + " = " + C);
		//java.lang.math -- lista de funções.
	}

}
