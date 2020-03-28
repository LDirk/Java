package exercicios_while;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		int senha; 
		
		Scanner sc = new Scanner(System.in);
		senha = sc.nextInt();
		
		while (senha!=2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		if (senha == 2002) {
			System.out.println("Acesso permitido");
		}
		
		
		
		
		
		
		sc.close();
		

	}

}
