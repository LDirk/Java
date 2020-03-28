package curso_java;

public class Saida_de_dados {

	public static void main(String[] args) {
	// System.out.print("Oi"); sem quebra de linha
	// System.out.println("Oi"); sem quebra de linha
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Oi");
		System.out.println(y);
		System.out.println(x);
		// Para controlar as casas decimais
		System.out.printf("%.2f %n", x); // o %f arredonda as casas decimais, %n quebra a linha
		
		// concatenar elementos
		System.out.println("Resultado= " +x+ "Metros");
		
		// concatenando varios elementos em um mesmo comando
		System.out.printf("Resultado = %.2f metros%n ",x);
		
		System.out.printf("%s tem %d anos e ganha %.2f",nome, idade, renda);
		
		// %f marcador de float, %d marcador de inteiro, %s texto

	}
}
