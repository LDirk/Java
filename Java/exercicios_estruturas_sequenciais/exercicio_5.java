package exercicios_estruturas_sequenciais;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String[] args) {
		
		String codigo1, codigo2;
		int npe�a1, npe�a2;
		double valoruni1, valoruni2,pre�o;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo da pe�a 1 e 2 ");
		codigo1 = sc.next();
		codigo2 = sc.next();
		
		System.out.println("Digite a quantidade das pe�as 1 e 2 ");
		npe�a1 = sc.nextInt();
		npe�a2 = sc.nextInt();		
		
		System.out.println("Digite o valor unitario da pe�a 1 e pe�a 2");
		valoruni1 = sc.nextDouble();
		valoruni2 = sc.nextDouble();
		
		pre�o = valoruni1*npe�a1 + valoruni2*npe�a2;
		
		System.out.printf("O valor total a pagar � %.2f",pre�o);		
		
		sc.close();
		
		
		
		
	}
}
