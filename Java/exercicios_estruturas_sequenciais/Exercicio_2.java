package exercicios_estruturas_sequenciais;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Double raio, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do raio");
		
		raio = sc.nextDouble();
		area = 3.14159*(Math.pow(raio, 2));
		
		System.out.printf("Area: %f ",area);		
		
		sc.close();
		
	}

}
