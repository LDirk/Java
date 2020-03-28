package curso_java;

public class condicional_ternaria {

	public static void main(String[] args) {
		// (condição)? valor se verdade : valor se falso
		
		double preço = 35;
		double desconto = (preço <20) ? preço*0.1 : preço *0.05;
		
		System.out.println(desconto);
	}

}
