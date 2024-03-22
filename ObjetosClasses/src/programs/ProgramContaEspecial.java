package programs;
import entities.ContaEspecial;

public class ProgramContaEspecial {
	public static void main(String[] args) { 
		
		ContaEspecial contaCorrente = new ContaEspecial();
		
		contaCorrente.titular = "Pedro";
		
		contaCorrente.deposito(5000.00);
		contaCorrente.mostrarSaldo();
		contaCorrente.saque(560.00);
		contaCorrente.mostrarSaldo();
	}
}