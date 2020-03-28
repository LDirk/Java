package exercicios_estruturas_sequenciais;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		double a,b,c ; 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o a,b e c");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("A aréa do triangulo que tem como base %.2f e altura %.2f é  %.2f %n",a,c,(a*c)/2);
		System.out.printf("Area do circulo com raio C é %.2f %n",3.14*Math.pow(c, 2));
		System.out.printf("A area do trapezio que tem A e B por bases , c altura é  %.2f%n",c*((a+b)/2));
		System.out.printf("A area do quadrado de lado b  %.2f%n",b*b);
		System.out.printf("A aréa do retangulo com lados a e b%n",a*b);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
