package curso_java;
import java.util.Scanner;
public class forjava {

	public static void main(String[] args) {
		//for(inicio;condição;incremento){
		// comando1
		// comando2
		//}
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		for (int i =0; i<N; i ++) {
			int x = sc.nextInt();
			soma = soma + x; 			
		}
		System.out.println(soma);
		
		sc.close();
		
		// contagem regressiva:
		
		for (int j=4; j>=0; j--) {
			System.out.println("Valor de j: " + j);
		}

	}

}
