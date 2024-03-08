import java.util.Scanner;
import java.util.Locale;

public class AlturaIdade {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanho_vetor = sc.nextInt();
		String[] vetor_nome = new String[tamanho_vetor];
		int[] vetor_idade = new int[tamanho_vetor];
		double[] vetor_altura = new double[tamanho_vetor];

		for (int i = 0; i < tamanho_vetor; i++) {
			vetor_nome[i] = sc.next();
			vetor_idade[i] = sc.nextInt();
			vetor_altura[i] = sc.nextDouble();
		}

		double soma_altura = 0.0;
		for (double altura : vetor_altura) {
			soma_altura += altura;
		}

		double qtd_menor_de_16 = 0.0;
		for (int idade : vetor_idade) {
			if (idade < 16) {
				qtd_menor_de_16++;
			}
		}

		double altura_media = soma_altura / tamanho_vetor;
		double porcentagem_menor_de_16 = (qtd_menor_de_16 / tamanho_vetor) * 100;

		System.out.printf("Altura média: %.2f\n", altura_media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem_menor_de_16);

		for (int i = 0; i < tamanho_vetor; i++) {
			if (vetor_idade[i] < 16) {
				System.out.print(vetor_nome[i] + ", ");
			}
		}

		sc.close();
		System.exit(0);
	}

}
