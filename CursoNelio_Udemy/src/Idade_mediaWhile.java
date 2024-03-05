import java.util.Scanner;
public class Idade_mediaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		
		if(idade > 0) {
			int soma = 0, contador = 0;
			
			while(idade > 0) {
				soma += idade;
				contador++;
				idade = sc.nextInt();
			}
			double media = (double)soma / contador;
			System.out.printf("%.2f\n", media);
		}
		else {
			System.out.println("Impossível calcular.");
		}
		
		sc.close();
	}
}
