import java.util.Scanner;

public class MatrizDiagonal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] matriz = new int[N][N];
		int contador = 0;
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				if(i == j) {
					System.out.print(matriz[i][j] + " ");
				}
				
				if(matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("\nQuantidade de negativos = " + contador);
		sc.close();
	}
	
}
