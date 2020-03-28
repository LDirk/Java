package curso_java;
import java.util.Locale;
import java.util.Scanner;

public class while_do {

	public static void main(String[] args) {		
		// do {
		// comando1
		// comando2
		// } while (condição);		 
// exemplo : levar temperatura em celsius e mostrar o 
// equivalente em Fah, caso o usuario digite s, repete o programa
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite a temperatura em celsius:");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 +32.0;
			System.out.printf("Equivalente em Fah: %.2f%n ",F);
		
			System.out.print("Dseja repetir (S/N)? ");
		    resp = sc.next().charAt(0);
		} while (resp != 'n' );
		
		sc.close();

	}

}
