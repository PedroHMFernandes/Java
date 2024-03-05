import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro de 1 - 7: ");
		dia = sc.nextInt();

		System.out.print("Dia da semana: ");
		switch (dia) {
		case 1: {
			System.out.println("domingo");
			break;
		}
		case 2: {
			System.out.println("segunda");
			break;
		}
		case 3: {
			System.out.println("terça");
			break;
		}
		case 4: {
			System.out.println("quarta");
			break;
		}
		case 5: {
			System.out.println("quinta");
			break;
		}
		case 6: {
			System.out.println("sexta");
			break;
		}
		case 7: {
			System.out.println("sábado");
			break;
		}

		default:
			System.out.println(dia + " não é um número de 1 a 7!");
			break;
		}
		
		sc.close();
	}

}
