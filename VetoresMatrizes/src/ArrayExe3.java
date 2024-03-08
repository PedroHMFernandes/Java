import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número inteiro(0 - 255): ");
		int numeroInteiro = sc.nextInt();
		while(numeroInteiro < 0 || numeroInteiro > 255) {
			System.out.print("(0 - 255): ");
			numeroInteiro = sc.nextInt();
		}
		
		int vetor[] = new int[8];

		String binario = Integer.toString(numeroInteiro, 2);
		System.out.printf("0b%s\n", binario);
		
		
		int cont = 0;
		do {
			int resto = numeroInteiro % 2;
			vetor[cont] = resto;
			numeroInteiro /= (int) 2;
			cont++;
		} while(cont < 8);
		
		System.out.print("0b");
		for(int i = vetor.length -1; i >= 0; i-- ) {
			System.out.print(vetor[i]);
		}
		
		
		
		
		
		
		sc.close();
	}
}
