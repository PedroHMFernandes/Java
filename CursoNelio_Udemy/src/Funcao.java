
public class Funcao {

	public static int higher(int x, int y, int z) {
		if(x > y && x > z) return x;
		else if (y > z)  return y;
		else return z;
	}
	
	public static void showResult(int x) {
		System.out.printf("The result is %d.\n", x);
	}
	
	public static void main(String[] args) {
		
		showResult(higher(1,7,5));
		
	}

}
