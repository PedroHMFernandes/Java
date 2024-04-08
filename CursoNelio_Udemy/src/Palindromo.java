
public class Palindromo {
	public static void main(String[] args) {

		String[] arrayDeTexto = { "orava o avaro", "Ana", "Renner", "Roma é amor", "Ronaldo", "Shrek Terceiro",
				"Acuda cadela da Leda caduca" };

		for (String texto : arrayDeTexto) {
			texto = texto.toLowerCase();
			int contador = 0;
			Boolean bool = true;
			
			for (int i = texto.length() - 1; i >= 0; i--) {

				char letraInvertida = texto.charAt(i);
				char letra = texto.charAt(contador);
				contador++;

				if (letraInvertida != letra) {
					bool = false;
					break;
				}
			}
			System.out.printf("'%s'", texto);
			System.out.println(bool ? "é um palíndromo" : "NÃO é um palíndromo");
			System.out.println();
		}
	}
}
