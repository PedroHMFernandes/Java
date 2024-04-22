package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect1 = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rect1.width = sc.nextDouble();
		rect1.height = sc.nextDouble();

		System.out.printf("AREA = %.2f\n", rect1.Area());
		System.out.printf("PERIMETER = %.2f\n", rect1.Perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rect1.Diagonal());

		sc.close();
	}
}
