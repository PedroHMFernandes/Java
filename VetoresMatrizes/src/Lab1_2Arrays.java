import java.util.Scanner;

public class Lab1_2Arrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de elemtnos do conjunto: ");
		int tamanhoArray = sc.nextInt();
		int[] array = new int[tamanhoArray];

		// Criando o Array
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe o %dº elemento: ", i + 1);
			array[i] = sc.nextInt();
		}

		// Mostrar dados na ordem original
		System.out.print("\nDados na ordem original: ");
		for (int num : array) {
			System.out.print(num + ", ");
		}

		// Reorganizar Array
		int nextNonZeroIndex = 0; // Índice onde os elementos não nulos vão ser movidos
		int swapper; // Variável para fazer a troca de valores dos índices do Array
		for (int i = 0; i < tamanhoArray; i++) {
			if (array[i] != 0) {
				swapper = array[i];
				array[i] = array[nextNonZeroIndex];
				array[nextNonZeroIndex] = swapper;
				nextNonZeroIndex++;
			}
		}

		// Mostrar novo Array
		System.out.print("\nDados reorganizados....: ");
		for (int num : array) {
			System.out.print(num + ", ");
		}

		sc.close();
	}
}
