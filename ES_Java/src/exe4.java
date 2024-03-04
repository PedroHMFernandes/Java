import java.util.Scanner;
public class exe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R, G, B;
		
		System.out.print("Valores respectivos de 0 a 255 para R G B: ");
		R = sc.nextInt();
		G = sc.nextInt();
		B = sc.nextInt();
	
		System.out.printf("A cor RGB(%d %d %d) corresponde a 0x%x%x%x\n ", R, G, B, R, G, B);
		sc.close();
	}
}
