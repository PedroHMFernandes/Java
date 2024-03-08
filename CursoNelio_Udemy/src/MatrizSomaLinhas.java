import java.util.Locale;
import java.util.Scanner;

public class MatrizSomaLinhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		double[][] matriz = new double[M][N];
		double[] vetor = new double[M];

		// cria matriz
		for (int i = 0; i < M; i++) { 
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}

		// cria vetor
		for (int i = 0; i < M; i++) {
			double soma_linha = 0;
			for (int j = 0; j < N; j++) {
				soma_linha += matriz[i][j];
			}
			vetor[i] = soma_linha;
		}
		
		// mostra o vetor
		for (double valor : vetor) {
			System.out.println(valor);
		}

		sc.close();
	}
}
