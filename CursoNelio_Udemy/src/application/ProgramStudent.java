package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class ProgramStudent {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stdnt = new Student();
		stdnt.name = sc.nextLine();
		stdnt.grade1 = sc.nextDouble();
		stdnt.grade2 = sc.nextDouble();
		stdnt.grade3 = sc.nextDouble();

		System.out.printf("Final grade = %.2f\n", stdnt.finalGrade());
		System.out.println(stdnt.wasApproved());

		sc.close();
	}
}
