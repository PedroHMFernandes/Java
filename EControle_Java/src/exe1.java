import java.util.Scanner;
public class exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma vogal: ");
		char letra = sc.next().toLowerCase().charAt(0);
		
     /* if (letra == 'a') {
			System.out.println("Abacaxi");
		}
		
		else if (letra == 'e') {
			System.out.println("Epaminondas");
		}
		
		else if (letra == 'i') {
			System.out.println("Instrução");
		}
		
		else if (letra == 'o') {
			System.out.println("Ovo");
		}
		
		else if (letra == 'u') {
			System.out.println("Urubu");
		}
		
		else {
			System.out.printf("%c NÃO é uma vogal", letra);
		} */
		
		switch(letra){
		case 'a':
			System.out.println("Abacaxi");
			break;
		case 'e':
			System.out.println("Epaminondas");
			break;
		case 'i':
			System.out.println("Instrução");
			break;
		case 'o':
			System.out.println("Ovo");
			break;
		case 'u':
			System.out.println("Urubu");
			break;
		default:
			System.out.printf("%c NÃO é uma vogal", letra);
		}
		
		sc.close();
	}
}
