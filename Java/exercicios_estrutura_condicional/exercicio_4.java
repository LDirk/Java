package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo,
		// sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas

		int hora0, horaf, dur, dur2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo e a hora final ");
		hora0 = sc.nextInt();
		horaf = sc.nextInt();		
		dur = hora0 - horaf;
		
		if (dur==0) {
			System.out.println("O jogo durou 24h");
		}
		else if (dur<0){
			;
			System.out.printf("O jogo durou %d horas %n",Math.abs(dur));				
		}
		
		else if (dur>24) {
			System.out.println("O jogo n�o pode durar mais de 24horas");
		}
	
		else {
			dur2 = (24-hora0) + horaf;
			System.out.printf("O jogo durou %d horas %n", dur2);
		}		
		
		sc.close();
		
	}

}
