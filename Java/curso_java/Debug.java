package curso_java;
import java.util.Locale;
import java.util.Scanner;

public class Debug {
	public static void main(String[] args) {
		// para iniciar o debug:
		// botao direito na classe
		// debug as -> java application
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		// para selecionar um breakpoint
		// basta so marcar a linha e ir no run
		// e toggle breakpoint
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}
}