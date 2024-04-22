import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you input: ");
		int n = sc.nextInt();
		
		int[] arrayOfNumbers = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print(i+1 + "º "+ "Number: ");
			arrayOfNumbers[i] = sc.nextInt();
		}
		
		System.out.println("Negative numbers:");
		for(int number: arrayOfNumbers) {
			if(number < 0) {
				System.out.println(number);
			}
		}
	}
}
