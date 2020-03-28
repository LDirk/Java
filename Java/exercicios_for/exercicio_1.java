package exercicios_for;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um inteiro entre 1 a 100");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i = i + 2 ) {
			System.out.println(i);
		}
		
		
		sc.close();

	}

}
