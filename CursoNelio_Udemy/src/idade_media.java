import java.util.Scanner;
public class idade_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		int idade1, idade2;
		float media_idades;
		
		System.out.print("Digite o 1°nome e a 1ªidade: ");
		nome1 = sc.next();
		idade1= sc.nextInt();
		
		System.out.print("Digite o 2°nome e a 2ªidade: ");
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		media_idades = (float)(idade1 + idade2)/2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos\n", nome1, nome2, media_idades);
	
	}

}
