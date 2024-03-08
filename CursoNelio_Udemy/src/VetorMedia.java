import java.util.Locale;
import java.util.Scanner;
 
public class VetorMedia {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		double[] vetor = new double[x];

		for (int i = 0; i < x; i++) {
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (double numero : vetor) {
			System.out.print(numero + " ");
			soma += numero;
		}
		System.out.println();
		
		double media = soma / vetor.length;
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);
		
		sc.close();
		System.exit(0);
	}

}