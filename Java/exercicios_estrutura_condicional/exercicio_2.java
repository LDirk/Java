package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero");
		numero = sc.nextInt();
		
		if (numero%2==0) {
			System.out.println("� par");
		}
		else {
			System.out.println("� impar");
		}
		
		sc.close();
		
	}
}
