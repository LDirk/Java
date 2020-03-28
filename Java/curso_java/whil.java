package curso_java;
import java.util.Scanner;
public class whil {

	public static void main(String[] args) {
		// while(condição){
		// comando1
		// comando2
		//}
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int soma = 0;
			while (x != 0) {
				soma = soma + x;
				x = sc.nextInt();				
			}	
			System.out.println(soma);
			sc.close();
	}
}
