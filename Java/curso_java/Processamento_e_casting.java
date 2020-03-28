package curso_java;

public class Processamento_e_casting {

	public static void main(String[] args) {
		int a,b ;
		double resultado;
		
		a = 5; 
		b = 2; 
		// Se não declarar o resultado como double, 
		// ele vai gerar a parte inteira de a/b
		resultado = (double) a/b;
		System.out.println(resultado);

	}

}
