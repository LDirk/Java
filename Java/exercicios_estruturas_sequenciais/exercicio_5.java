package exercicios_estruturas_sequenciais;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String[] args) {
		
		String codigo1, codigo2;
		int npeça1, npeça2;
		double valoruni1, valoruni2,preço;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo da peça 1 e 2 ");
		codigo1 = sc.next();
		codigo2 = sc.next();
		
		System.out.println("Digite a quantidade das peças 1 e 2 ");
		npeça1 = sc.nextInt();
		npeça2 = sc.nextInt();		
		
		System.out.println("Digite o valor unitario da peça 1 e peça 2");
		valoruni1 = sc.nextDouble();
		valoruni2 = sc.nextDouble();
		
		preço = valoruni1*npeça1 + valoruni2*npeça2;
		
		System.out.printf("O valor total a pagar é %.2f",preço);		
		
		sc.close();
		
		
		
		
	}
}
