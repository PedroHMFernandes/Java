package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramEmployee {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp1 = new Employee();

		System.out.print("Name: ");
		emp1.name = sc.nextLine();

		System.out.print("Gross salary: ");
		emp1.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		emp1.tax = sc.nextDouble();

		System.out.println();
		System.out.println(emp1.toString());
		System.out.println();

		System.out.print("Which percentage to increase salary (0 - 100)? ");
		double increasePercentage = sc.nextDouble();
		emp1.increaseSalary(increasePercentage);

		System.out.println("\nUpdated data" + emp1.toString());

		sc.close();
	}
}
