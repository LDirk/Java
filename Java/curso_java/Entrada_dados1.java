
package curso_java;
import java.util.Scanner;
public class Entrada_dados1 {

	public static void main(String[] args) {
		// Scanner ( tipo especial para entrada de dados)
			Scanner sc = new Scanner(System.in);
			
			char  c;
			double k;
			int y;
			String x;
			
			x = sc.next();
			
			// Para atribuir inteiros
			y = sc.nextInt();
						
			// Para atribuir pontos flutuantes:
			
			k= sc.nextDouble();
						
			// Vai pegar somente a primeira letra 
			c = sc.next().charAt(0);
			
			// ler o mesmo dados na mesma linha
			System.out.println("Dados digitados");
			System.out.println(x);
			System.out.println(y);
			System.out.println(k);
			System.out.println(c);
						
			sc.close(); // encerra o recurso Scanner de entrada de dados
	}
}
