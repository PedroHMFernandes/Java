package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramEmployeeList {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();

		List<EmployeeList> listOfEmployees = new ArrayList<>();

		// Setting employees
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.printf("Employee #%d:\n", i + 1);

			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(listOfEmployees, id)){
				System.out.print("Id alredy taken. Try again: ");
				id = sc.nextInt();
			}
			
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			listOfEmployees.add(new EmployeeList(id, name, salary));
			System.out.println();
		}

		// Increasing salary
		System.out.println("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();

		EmployeeList emp = listOfEmployees.stream().filter(e -> e.getId() == idToIncrease).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage(0 - 100): ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		// Showing employees
		System.out.println("\nList of employees");
		for (EmployeeList employee : listOfEmployees) {
			System.out.println(employee.toString());
		}

		sc.close();
	}
	
	public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
