package tarefas;
import java.util.Scanner;

public class CPF {

	private String numeros;
	
    // Trata para receber apenas os números, removendo caracteres não numéricos
	public void setCPF(String textoCPF) {
		int tamanhoCPF = textoCPF.length();
		String numCPF = "";
		
		for (int i = 0; i < tamanhoCPF; i++) {
			char caractereCPF = textoCPF.charAt(i);
			if (Character.isDigit(caractereCPF)) {
				String stringCPF = Character.toString(caractereCPF);
				numCPF += stringCPF;
			}
		}
		this.numeros = numCPF;
	}
	
	public boolean validaCPF() {
		int somatorio = 0;
		int indice = 0;

		// calcular primeiro digito
		for (int i = 10; i >= 2; i--) {
			char charCPF = numeros.charAt(indice);
			int numeroCPF = Character.getNumericValue(charCPF);
			somatorio += numeroCPF * i;
			indice++;
		}

		int primerioVerificador = somatorio * 10 % 11;
		if (primerioVerificador == 10)
			primerioVerificador = 0;

		// calcular segundo digito
		somatorio = 0;
		indice = 0;
		for (int i = 11; i >= 2; i--) {
			char charCPF = numeros.charAt(indice);
			int numeroCPF = Character.getNumericValue(charCPF);
			somatorio += numeroCPF * i;
			indice++;
		}

		int segundoVerificador = somatorio * 10 % 11;
		if (segundoVerificador == 10)
			segundoVerificador = 0;

		// validar
		int primeiroDigito = Character.getNumericValue(numeros.charAt(9));
		int segundoDigito = Character.getNumericValue(numeros.charAt(10));

		if ((primerioVerificador == primeiroDigito) && ((segundoVerificador == segundoDigito))) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return String.format("%s.%s.%s-%s", 
				this.numeros.substring(0, 3), 
				this.numeros.substring(3, 6),
				this.numeros.substring(6, 9), 
				this.numeros.substring(9));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CPF meuCPF = new CPF();

		System.out.println("Digite um cpf no modelo XXX.XXX.XXX-XX");
		String cpf = sc.nextLine();

		meuCPF.setCPF(cpf);

		if (meuCPF.validaCPF()) {
			System.out.println(meuCPF.toString() + " é válido.");
		} else {
			System.out.println(meuCPF.toString() + " é inválido.");
		}
		sc.close();
	}
}
