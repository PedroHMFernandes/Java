import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[8];

		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("%dº Número: ", i + 1);
			vetor[i] = sc.nextInt();
		}
		
		int x;
		int y;
		do {
			System.out.print("Digite os valores de x e y (0 - 7): ");
			x = sc.nextInt();
			y = sc.nextInt();
		} while (((x < 0) || (x > 7)) && ((y < 0) || (y > 0)));

		int soma = vetor[x] + vetor[y];

		System.out.println("Soma = " + soma);

		sc.close();
	}
}