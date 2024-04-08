import java.util.Scanner;
import java.util.Locale;

public class Lab2_1valorPagamento {
	
	 static double valorPagamento(double valorCompra, int diasAtraso) {
		if (diasAtraso == 0) return valorCompra;
		
		double valorComMulta = valorCompra * 1.03 + valorCompra * diasAtraso * 0.01;
		return valorComMulta;
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da compra e os dias de atras:");
		double valorCompra = sc.nextDouble();
		int diasAtraso = sc.nextInt();
		
		double resultado = valorPagamento(valorCompra, diasAtraso);
		
		System.out.printf("Valor total: $ %.2f\n", resultado);
		sc.close();
	}
}
