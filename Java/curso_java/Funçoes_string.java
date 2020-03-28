package curso_java;

public class Funçoes_string {

	public static void main(String[] args) {
		// toLowerCase() -> transforma em minusculo
		// ToUpperCase() -> transforma em maiusculo
		// trim() -> remover espaços nos cantos da string
		
			String original = "abcde FGHIJ ABC abc DEFG  ";
			String s01 = original.toLowerCase();
			String s02 = original.toUpperCase();
			String s04 = original.substring(2); // a string começa a partir da 2 string
			String s05 = original.substring(2,9); // recortar a string a partir do2 e vai ate o 9
			String s06 = original.replace("a", "x"); // vai trocar a pelo x
			String s07 = original.replace("abc", "xy");
			int i = original.indexOf("bc"); // VAi dizer a primeira ocorrencia do bc
			int j = original.lastIndexOf("bc"); // vai dizer a ultima ocorrencia do bc
			
			// split serve para recortar a string
			
			String s = "potato aplle lemon";
			
			String [] vect = s.split(" ");
			
			
						
			
			System.out.println(s01);
			System.out.println(s02);
			System.out.println(s04);
			System.out.println(s05);
			System.out.println(s06);
			System.out.println(s07);
			System.out.println(vect[0]);
			
			
	}

}
