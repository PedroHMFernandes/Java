import java.util.Locale;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("%dª nota: ", i+1);
			notas[i] = sc.nextDouble();
		}
		
			System.out.printf("%.1f\n", nota);  
	
	sc.close();
	}
}
