import java.util.Locale;

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double[] notas; // Declara uma variável do tipo vetor de "doubles"
		notas = new double[20]; // Aloca memória para 20 elementos no vetor
		
//		int[] pesos = {40, 20 , 30, 10}; - Declara e inicializa um vetor de quatro posições
	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("%d� nota: ", i+1);
			notas[i] = sc.nextDouble();
		}
		
		for(double nota: notas) { // Associa uma variável a cata um dos elementos do array
			System.out.printf("%.1f\n", nota);  
		} // Não permite que o conteúdo do array seja modificado
	
	sc.close();
	}
}
