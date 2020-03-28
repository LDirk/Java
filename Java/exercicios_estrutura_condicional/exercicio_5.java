package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		int codigo;
		double valor,quantidade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade");
		quantidade = sc.nextInt();		
		
		if (codigo == 1) {
			valor = quantidade*4;
			System.out.printf("O valor a ser pago é %.2f %n",valor);						
		}
		
		else if (codigo == 2 ) {
			valor = quantidade*4.50;
			System.out.printf("O valor a ser pago é %.2f %n",valor);
		}
		
		else if (codigo == 3 ) {
			valor = quantidade*5;
			System.out.printf("O valor a ser pago é %.2f %n",valor);
		}
		
		else if (codigo == 4 ) {
			valor = quantidade*2;
			System.out.printf("O valor a ser pago é %.2f %n",valor);
		}
		
		else if (codigo == 5 ) {
			valor = quantidade*1.50;
			System.out.printf("O valor a ser pago é %.2f %n",valor);
		}
		
		else {
			System.out.println("Codigo inválido");
		}
		
		
		sc.close();
				
	}
	

}
