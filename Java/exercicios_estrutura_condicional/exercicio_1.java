package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		if (numero >0) {
			System.out.println("É positivo");			
		}
		else {
			System.out.println("É negativo");
		}
			
		sc.close();
		
	}

}
