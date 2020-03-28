package exercicios_estruturas_sequenciais;

import java.util.Scanner;

public class exercicio_4 {
	public static void main(String[] args) {
		double numero ,horas_trab,valor_hora,salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero do funcionário: ");
		numero = sc.nextDouble();		
		
		System.out.println("Horas trabalhadas:");
		horas_trab = sc.nextDouble();
		
		System.out.println("Valor da hora trabalhada");
		valor_hora = sc.nextDouble();
		
		
		salario = horas_trab*valor_hora;	
		System.out.println(numero);
		System.out.printf("O salário do funcionário é: %.2f",salario);
		
		
		sc.close();
		
		
		
		
		
	}
}
