package curso_java;

public class condicional_ternaria {

	public static void main(String[] args) {
		// (condi��o)? valor se verdade : valor se falso
		
		double pre�o = 35;
		double desconto = (pre�o <20) ? pre�o*0.1 : pre�o *0.05;
		
		System.out.println(desconto);
	}

}
