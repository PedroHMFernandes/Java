import java.util.Scanner;
public class HorasMinSec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_segundos, horas, minutos, segundos;
		
		System.out.print("Digite um número inteiro: ");
		input_segundos = sc.nextInt();
		
		segundos = input_segundos;
		
		horas = input_segundos / 3600;
		segundos -= 3600 * horas;
		
		minutos = segundos / 60;
		segundos -= 60 * minutos;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		sc.close();
	}

}
