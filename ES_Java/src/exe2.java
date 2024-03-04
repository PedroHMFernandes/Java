import java.util.Locale;
import java.util.Scanner;
public class exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double C, F;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor em °C: ");
		C = sc.nextDouble();
		
		F = (9 * C) / 5 + 32;
		
		System.out.printf("%.2f°C <-> %.2f°F\n", C, F);
		sc.close();
	}
}
