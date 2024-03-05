import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US); // Sets the '.' as default separator for float numbers instead of ','
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String name = sc.nextLine();
		
		System.out.print("Digite um número: ");
		double x = sc.nextDouble(); 
		System.out.printf("Boa Tarde, %s!%n", name);
		System.out.printf("%.2f\n", x);
		System.out.printf("Tchau! %s, %f...%n", name, x);
		sc.close();	
	}

}
