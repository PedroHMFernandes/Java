import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		double a , b, c, delta, x1, x2;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite os valores para a, b ,c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a != 0) {
			delta = b*b - 4*a*c;
			if (delta >= 0) {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.printf("x1 = %.5f\n", x1);
				System.out.printf("x1 = %.5f\n", x2);
			}
			else {
				System.out.println("Impossível calcular");
			}
		}
		else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();
	}
}
