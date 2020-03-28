package exercicios_estruturas_sequenciais;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		int numero1, numero2, soma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os números que deseja somar: ");
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		soma = numero1+numero2;
		System.out.printf("Soma: %d ",soma);
		
		
		sc.close();
	}
}
