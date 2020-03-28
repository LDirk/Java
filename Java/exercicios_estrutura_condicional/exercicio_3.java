package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_3 {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a e b , em sequencia:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>=b) {
			if (a%b==0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}			
		}
		
		else {
			if(b%a==0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}
						
		}
				
		sc.close();	
		
	}
}
