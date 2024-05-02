package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramWorker {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);
		// Worker data
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
		System.out.print("Base salary: ");
		Double workerBaseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker: ");
		Integer contractsNumber = sc.nextInt();
		Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, department);
		// Contracts data
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < contractsNumber; i++) {
			System.out.printf("Enter contract #%d data:\n", i);
			sc.nextLine();
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate contractDate = LocalDate.parse(sc.nextLine(), dateFormatter);
			System.out.print("Value per hour: ");
			Double contractValueHour = sc.nextDouble();
			System.out.print("Durations (hours): ");
			Integer contractDuration = sc.nextInt();
			HourContract contract = new HourContract(contractDate, contractValueHour, contractDuration);
			worker.addContract(contract);
		}

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sc.nextLine();
		String monthYearToCalc = sc.next();
		int month = Integer.parseInt(monthYearToCalc.substring(0, 2));
		int year = Integer.parseInt(monthYearToCalc.substring(3));
		Double monthYearIncome = worker.income(year, month);
		System.out.printf("Name: %s\n", worker.getName());
		System.out.printf("Department: %s\n", worker.getDepartment().getName());
		System.out.printf("Income for %d%d %.2f", month, year, monthYearIncome);

		sc.close();
	}
}
