import java.util.Scanner;
import java.util.Locale;

public class Lab2_2numeroReais {

	static double soma(double x, double y) {
		return x + y;
	}

	static double subtrai(double x, double y) {
		return x - y;
	}

	static double multiplica(double x, double y) {
		return x * y;
	}

	static void divide(double x, double y) {
		if (y == 0) System.out.println("Impossível dividir por zero.");
		else System.out.printf("%f / %f = %.2f\n", x, y, x / y);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números reais:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("Soma = " + soma(x, y));
		System.out.println("Subtração = " + subtrai(x, y));
		System.out.println("Multiplica = " + multiplica(x, y));
		divide(x, y);
		
		sc.close();
	}
}
