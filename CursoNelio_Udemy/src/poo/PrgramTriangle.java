package poo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class PrgramTriangle {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
	
		System.out.println("Enter the measures for triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures for triangle Y: ");
		y.a =  sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double areaX = x.areaHeronFormula();
		double areaY = y.areaHeronFormula();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) System.out.println("Larger area: X");
		else if (areaX < areaY) System.out.println("Larger area: Y");
		else System.out.println("Area X = Area Y");
		
		sc.close();
	}
}
