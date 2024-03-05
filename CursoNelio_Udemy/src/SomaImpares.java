import java.util.Scanner;

public class SomaImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x < y) {
			int troca = x;
			x = y;
			y = troca;
		}
		
		int soma = 0;

		for(int i = y + 1; i < x; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		sc.close();
	}
}