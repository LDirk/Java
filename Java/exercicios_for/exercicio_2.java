package exercicios_for;

import java.util.Scanner;

public class exercicio_2 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite X");
	int x = sc.nextInt();
	int in = 0;
	int out = 0;
	
	
	for (int i = 1; i<= x; i++ ) {
		int k = sc.nextInt();
		
		
		
		if (k>=10 && k<=20) {
			in = in + 1;
		}
		
		else {
			out = out + 1;
		}		
	
	}
	
	System.out.println(in + "in");
	System.out.println(out + "out");
	
	sc.close();
	
	}
	
}
