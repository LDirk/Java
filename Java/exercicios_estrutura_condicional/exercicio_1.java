package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. 
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero");
		numero = sc.nextInt();
		
		if (numero >0) {
			System.out.println("� positivo");			
		}
		else {
			System.out.println("� negativo");
		}
			
		sc.close();
		
	}

}
