import java.util.Scanner;

public class Lab3_3qtdeVogais {

	static int qtdeVogais(String texto) {
		char[] charArray = texto.toCharArray();
		int contaVogal = 0;

		for (char letra : charArray) {
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contaVogal++;
			}
		}
		return contaVogal;
	}

	static int qtdeDigitos(String texto) {
		char[] charArray = texto.toCharArray();
		int contaDigito = 0;

		for (char digito : charArray) {
			if (digito == '0' || digito == '1' || digito == '2' || digito == '3' ||
					digito == '4' ||digito == '5' || digito == '6' || digito == '7' 
					||digito == '8' || digito == '9') {
				contaDigito++;
			}
		}
		return contaDigito;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();

		System.out.println(qtdeVogais(frase));
		System.out.println(qtdeDigitos(frase));
		sc.close();
	}
}
