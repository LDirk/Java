package curso_java;
import java.util.Scanner;

public class fun�oes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		showResult(higher);
		
			
		sc.close();

	}
	public static int max (int x, int y, int z) {
		int aux; 
		if (x> y && x > z ) {
			aux = x;
		}
		else if (y>z) {
			aux = y;
		}
		else {
			aux = z;			
		}	
		return aux;
	}
	// quando uma a��o faz uma a��o sem retornar um valor reaproveitalvel
	// usa o void
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
