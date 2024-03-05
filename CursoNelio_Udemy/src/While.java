import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num != 0) {
			sum += num;
			num = sc.nextInt();
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
