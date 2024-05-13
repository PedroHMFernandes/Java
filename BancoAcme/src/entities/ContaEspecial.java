package entities;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial() {
		super();
		this.limite = 100;
	}

	public ContaEspecial(int agencia, String titular, double depositoInicial, double limite) {
		super(agencia, titular, depositoInicial);
		this.limite = limite;
	}

	@Override
	public boolean saque(double valor) {
		if ((valor > 0) && (valor <= getSaldo() + limite)) {
			setSaldo(getSaldo() - valor);
			addHistorico("\nSaque no valor de $" + valor);
			return true;
		}
		return false;
	}

	@Override
	public String extrato() {
		String msg = super.extrato();
		msg += "\nLimite: " + String.format("%.2f", limite);
		return msg;
	}
}
