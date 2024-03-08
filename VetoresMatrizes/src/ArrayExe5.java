import java.util.Locale;
import java.util.Scanner;

public class ArrayExe5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[10];

		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("%dº Loja , preço: ", i + 1);
			vetor[i] = sc.nextDouble();
		}

		double media = 0;
		for (double numero : vetor) {
			media += numero;
		}
		media = media / vetor.length;
		System.out.printf("Preço médio: R$%.2f", media);

		int qtdMaiorMedia = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				qtdMaiorMedia++;
			}
		}
		System.out.println("Lojas com preço mairo que a média: " + qtdMaiorMedia);

		sc.close();
	}
}
