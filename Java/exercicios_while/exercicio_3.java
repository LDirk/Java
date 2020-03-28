package exercicios_while;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		int verificador; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Álcool ");
		System.out.println("2 - Gasolina ");
		System.out.println("3 - Diesel");
		System.out.println("4 - Para encerrar");
				
		System.out.println("Por favor, digite qual é a sua preferencia de combustivel: ");
		
		verificador = sc.nextInt();
		while (verificador != 4) {
			if (verificador == 1) {
				System.out.println("A preferencia é alcool");
				verificador = 4;
			}
			else if (verificador == 2) {
				System.out.println("A preferencia é gasolina");
				verificador = 4;
			}
			else if(verificador ==3) {
				System.out.println("A preferencia é Diesel");
				verificador = 4;
			}
			else {
				System.out.println("valor inválido, por favor, digite um válido");
				verificador = sc.nextInt();
			}
			
		System.out.println("MUITO OBRIGADO");	
						
		}
				
		sc.close();

	}

}
