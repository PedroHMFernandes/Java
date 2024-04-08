package util;

public class Calculator {
	public static final double PI = 3.14159;

	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return Math.pow(radius, 3) * 4.0 * PI / 3.0;
	}
}
