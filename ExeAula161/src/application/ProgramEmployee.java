package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int employeesNumber = sc.nextInt();

		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < employeesNumber; i++) {
			System.out.printf("Employee #%d data:\n", i + 1);
			System.out.print("Outsourced(y/n): ");
			char isOutsourced = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else if (isOutsourced == 'n') {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}

		System.out.println("\nPayments: ");
		for (Employee emp: list) {
			System.out.printf("%s - $ %.2f\n", emp.getName(), emp.payment());
		}

		sc.close();
	}
}
