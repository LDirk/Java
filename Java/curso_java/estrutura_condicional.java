package curso_java;

import java.util.Scanner;

public class estrutura_condicional {
	public static void main(String[] args) {
		// simples 
		// if (condição){
		// 	<comando1>
		// 	<comando2>
	    //    }
		
		Scanner sc = new Scanner(System.in);		
		int hora;
		
		System.out.println("Que horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
		
			System.out.println("Bom dia");
		}
		else if (hora<18) {
			System.out.println("Boa tarde");
		}				
		else {
			System.out.println("Boa noite");
			}
				
		sc.close();
		
		// composta
		// if(condição){
		//    <comando1>
		//	  <comando2>
		// }
		// else {
		//   <comando3>
		// }		
	}
}
