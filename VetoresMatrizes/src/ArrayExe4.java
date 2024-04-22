import java.util.Locale;
import java.util.Scanner;

public class ArrayExe4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] pesos = new double[10];
		double[] alturas = new double[10];
		double[] IMCs = new double[10];
		
		for(int i = 0; i < pesos.length; i++) {
			System.out.printf("%dº Peso e Altura: ", i + 1);
			pesos[i] = sc.nextDouble();
			alturas[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < pesos.length; i++) {
			IMCs[i] = pesos[i] / Math.pow(alturas[i], 2);
		}
		
		for(int i = 0; i < IMCs.length; i++) {
			System.out.printf("%dº IMC = %.2f\n", i + 1, IMCs[i]);
		}
	}
}
