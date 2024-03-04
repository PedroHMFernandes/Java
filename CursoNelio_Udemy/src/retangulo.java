import java.util.Locale;
import java.util.Scanner;
public class retangulo {

	public static void main(String[] args) {
		double area, perimetro, diagonal, base , altura;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base e da altura: ");
		base = sc.nextInt();
		altura = sc.nextInt();

		area = base * altura;
		perimetro = base * 2 + altura * 2;
		diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
		
		System.out.printf("Area: %.4f\n", area);
		System.out.printf("Perímetro: %.4f\n", perimetro);
		System.out.printf("Diagonal: %.4f\n", diagonal);
		
		sc.close();
	}

}
