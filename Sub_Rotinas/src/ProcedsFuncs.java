import java.util.Scanner;

// Não podemos definir um método diretamente em outro método.

// Procedimentos não retornam nada ao sistema.
// Funções sempre retornam algo, mesmo que algo nulo.

public class ProcedsFuncs {
	
	public void sayHi(String name) {
	    System.out.println("Hi, " + name + "!");
	}
	
	public static int soma(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	}
}
