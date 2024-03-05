import java.util.Locale;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double[] notas; // Declara uma vari�vel do tipo vetor de "doubles"
		notas = new double[20]; // Aloca mem�ria para 20 elementos no vetor
		
//		int[] pesos = {40, 20 , 30, 10}; - Declara e inicializa um vetor de quatro posi��es
	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("%dª nota: ", i+1);
			notas[i] = sc.nextDouble();
		}
		
		for(double nota: notas) { // Associa uma vari�vel a cata um dos elementos do array
			System.out.printf("%.1f\n", nota);  
		} // N�o permite que o contendo do array seja modificado
	
	sc.close();
	}
}
