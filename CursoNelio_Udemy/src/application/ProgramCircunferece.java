package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramCircunferece {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Radius: ");
		double radius = sc.nextDouble();

		double circ = Calculator.circunference(radius);
		double vol = Calculator.volume(radius);

		System.out.printf("Circunference: %.2f\n", circ);
		System.out.printf("Volume: %.2f\n", vol);

		sc.close();
	}
}
