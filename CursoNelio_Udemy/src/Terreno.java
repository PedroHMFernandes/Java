import java.util.Scanner;
import java.util.Locale;
public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double largura, comprimento, preco_m2, valor_area, preco_total;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Largura (m): ");
		largura = sc.nextDouble();
		
		System.out.print("Comprimento (m): ");
		comprimento = sc.nextDouble();
		
		System.out.print("Valor do m²: R$");
		preco_m2 = sc.nextDouble();
		
		valor_area = largura * comprimento;
		preco_total = valor_area * preco_m2;
		
		System.out.printf("AREA = %.2f\n", valor_area);
		System.out.printf("PREÇO = R$%.2f\n", preco_total);
	
		sc.close();
	}

}

