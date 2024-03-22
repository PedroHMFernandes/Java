package entities;

import java.util.Scanner;

public class Materia {

	public String nome;
	public int numAlunos;
	public double mediaSala;


	public void calcMedia() {
		Scanner sc = new Scanner(System.in);
		double nota;
		double[] arreyNotas = new double[numAlunos];
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.print("Nota " + i+1 + ": " );
			nota = sc.nextDouble();
			while( nota <0 || nota > 10) {
				System.out.println("Nota inválida, entre com um valor válido:");
				nota = sc.nextDouble();
			}
			arreyNotas[i] = nota;
		}
		sc.close();
		
		double media = 0;
		for (int i = 0; i < numAlunos; i++) {
			nota = sc.nextDouble();
			media += arreyNotas[i];
		}
			media /= numAlunos;
			mediaSala = media;
	}
	
	public void mostrarMedia(){
		System.out.println(mediaSala);
	}
}
