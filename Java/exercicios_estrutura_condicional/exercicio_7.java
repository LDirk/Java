package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.println("Digite os pontos sobre o cartesiano");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
	
		
		if (x == 0 && y ==0) {
			System.out.println("Origem");
		}
		
		else if (x>0 && y>0) {
			System.out.println("Q1");
		}
		
		else if (x<0 && y>0) {
			System.out.println("Q2");
		}
		
		else if (x<0 && y<0) {
			System.out.println("Q3");
		}
		
		else if (x>0 && y<0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Eixo sobre a origem");
		}
		
		sc.close();
	}

}
