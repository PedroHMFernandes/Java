package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Alturas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will you input: ");
		int n = sc.nextInt();

		Pessoa[] arrayOfPeople = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + "º " + "person data:");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age(years): ");
			int age = sc.nextInt();

			System.out.print("Height(m): ");
			double height = sc.nextDouble();

			arrayOfPeople[i] = new Pessoa(name, age, height);
		}

		double heightSum = 0.0;
		for (Pessoa person : arrayOfPeople) {
			heightSum += person.getHeight();
		}
		double averageHeight = heightSum / arrayOfPeople.length;

		System.out.printf("\nAverage height: %.2f\n", averageHeight);

		int sumUnder16 = 0;
		for (Pessoa person : arrayOfPeople) {
			if (person.getAge() < 16) {
				sumUnder16++;
			}
		}

		double percentageUnder16 = sumUnder16 * 100 / arrayOfPeople.length;

		System.out.printf("Percentage of people under 16: %.2f%%\n", percentageUnder16);

		System.out.println("People under 16: ");
		for (Pessoa person : arrayOfPeople) {
			if (person.getAge() < 16) {
				System.out.println(person.getName());
			}
			sc.close();
		}
	}
}
