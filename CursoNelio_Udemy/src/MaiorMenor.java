import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		int n1, n2, n3, menor, maior;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite três números inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
			if (n2 >= n3) {
				menor = n3;
			}
			else{
				menor = n2;
			}
		}
		
		else if (n2 >= n3) {
			maior = n2;
			if (n1 >= n3) {
				menor = n3;
			}
			else{
				menor = n1;
			}
		}
		
		else {
			maior = n3;
			if (n2 >= n1) {
				menor = n1;
			}
			else{
				menor = n2;
			}
		}
		
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		
		sc.close();
	}
}
