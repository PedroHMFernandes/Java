package entities;

public class Conta {
	private static int geradorNum = 12;

	private int agencia;
	private int numero;
	private String titular;
	private double saldo;
	private String historico;

	public Conta() {
		this(0, "<não informado>", 0);
	}

	public Conta(int agencia, String titular, double depositoInicial) {
		geradorNum += 14;
		numero = geradorNum;
		this.agencia = agencia;
		this.titular = titular;
		this.historico = "Abertura da conta número " + numero;
		deposito(depositoInicial);
	}

	public void deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			historico += "\nDepósito no valor de $" + valor;
		}
	}

	public boolean saque(double valor) {
		if ((valor > 0) && (valor <= saldo)){
			saldo -= valor;
			historico += "\nSaque no valor de $" + valor;
			return true;
		}
		return false;
	}
	
	public String extrato() {
		String msg;
		msg = "Banco ACME S.A.\n";
		msg += "Ag: %03d\tConta: %d\nTitular: %s\n" ;
		msg += "Operações:\n%s\n";
		msg += "Saldo: %.2f";
		msg = String.format(msg, agencia, numero, titular, historico, saldo );
		return msg;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void addHistorico(String adicionar) {
		this.historico += historico;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
