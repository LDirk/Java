package exercicios_while;

import java.util.Scanner;

public class exercicio_2 {
	public static void main(String[] args) {
		double x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as coodernadas");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while ((x != 0 || y != 0) && (x !=0 && y!=0)) {
						
			
			System.out.println("Digite as coodernadas");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
