import java.util.Scanner;

public class ArrayExe {

	public static void main(String[] args) {
		int[] vetor = new int[8];
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com 8 valores inteiros");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%dº valor: ", i + 1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Valores pares:");
		
		for(int valor: vetor) {
			if(valor % 2 == 0) {
				System.out.print(valor + ", ");
			}
		}
		sc.close();
		System.exit(0);
	}
}
