package curso_java;
import java.util.Locale;
import java.util.Scanner;
public class atribuiçao_cumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os minutos usado");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos >100) {
			conta += (minutos-100)*2;
			
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
			
		sc.close();
		
		//  a += , a = a + b
		// 	a -= , a = a - b
		// a *= b, a = a*b
		// a /= b, a = a/b
		// a %= b; a = a%b;
		
	}

}
