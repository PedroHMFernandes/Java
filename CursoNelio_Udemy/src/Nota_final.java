import java.util.Locale;
import java.util.Scanner;

public class Nota_final {
	
	public static void main(String[] args) {
		double nota1, nota2, nota_final;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira e a segunda nota: ");
		nota1 = sc.nextDouble();	
		nota2 = sc.nextDouble();
		
		nota_final = nota1 + nota2;
		
		if (nota_final < 60.00) {
			System.out.println("NOTA FINAL = " + nota_final);
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("NOTA FINAL = " + nota_final);
		}
		
		sc.close();
		
	}
	
}
