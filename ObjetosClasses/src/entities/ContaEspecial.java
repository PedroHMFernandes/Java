package entities;

public class ContaEspecial {
	
	public String titular;
	public int agencia;
	public int numero;
	public double saldo;
	
	public void mostrarSaldo() {
		System.out.println(saldo);
	}
	
	public void deposito(double valor) {
		 saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
}
