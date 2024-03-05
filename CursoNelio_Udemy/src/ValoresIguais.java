import java.util.Scanner;

public class ValoresIguais {

	public static void main(String[] args) {
		int x , y;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > y){
				System.out.println("Decrescente");
			}
			else if (x < y) {
				System.out.println("Crescente");
			}
		} while(x != y);
	
		sc.close();
	}
}
