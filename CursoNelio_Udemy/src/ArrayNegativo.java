import java.util.Scanner;

public class ArrayNegativo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int[] vetor = new int[x];
		
		for(int i = 0; i < x; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for(int numero: vetor) {
			if(numero < 0) {
				System.out.println(numero);
			}
		}
		
		sc.close();
		System.exit(0);
	}

}
