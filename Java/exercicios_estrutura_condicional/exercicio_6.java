package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		double valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor");
		valor = sc.nextDouble();
		
		if (valor>=0 && valor<=25) {
			System.out.println("Intervalo [0,25]");			
		}
		
		else if (valor>25 && valor<=50) {
			System.out.println("intervalo (25,50]");
		}
		
		else if (valor>50 && valor <=75) {
			System.out.println("Intervalo de (50,75]");
		}
		
		else if (valor>75 && valor<=100) {
			System.out.println("intervalo de (75,100]");
		}
		
		else {
			System.out.println("Fora do intervalo");
		}
		
		
		sc.close();
		
	}

}
