import java.util.Scanner;

public class ArrayExe1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[6];
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.printf("%dº Número: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			if((i == 0) || (i == 1)|| (i == 5)) {
				soma += vetor[i];
			}
		}
		System.out.println("Soma do 1º, 2ª e 6ª = " + soma);
		
		vetor[3] = 100;
		
		for(int numero: vetor) {
			System.out.print(numero + ", ");
		}
		
		
		sc.close();
	}
}
