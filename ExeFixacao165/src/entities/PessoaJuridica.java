package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double impostoAnual() {
		if (numeroDeFuncionarios > 10) {
			return this.getRendaAnual() * 0.14;
		}
		return this.getRendaAnual() * 0.16;
	}

}
