
public class Prova {
	
	public static int menor(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		int[] vet = { 1, 2, 3, 4, 5 };
		for (int i = 1; i < vet.length; i++) {
			vet[i - 1] = vet[i];
			vet[i] = vet[i - 1];

		}
		for(int numero: vet) {
			System.out.println(numero);
		}
		
		System.out.println(menor(2));
	}
}
