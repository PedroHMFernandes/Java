package application;

import java.util.Scanner;
import entities.Rent;

public class ProgramPensionato {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rent[] guestRooms = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int roomsNum = sc.nextInt();
		
		for (int i = 0; i < roomsNum; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			guestRooms[roomNumber] = new Rent(name, email);
			System.out.println();
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < guestRooms.length; i++) {
			if (guestRooms[i] != null) {
				System.out.println(i + ": " + guestRooms[i].toString());
			}
		}
		sc.close();
	}
}
