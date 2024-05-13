package entities;

public class Carro extends Veiculo {
	protected Integer numPortas;
	protected Integer cambio;
	protected Boolean automatico;

	public Carro() {
		super();
	}

	public Carro(String fabricante, String modelo, String cor, Motor motor, Integer numPortas, Integer cambio,
			Boolean automatico) {
		super(fabricante, modelo, cor, motor);
		this.numPortas = numPortas;
		this.cambio = cambio;
		this.automatico = automatico;
	}

	public Integer getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(Integer numPortas) {
		this.numPortas = numPortas;
	}

	public Integer getCambio() {
		return cambio;
	}

	public void setCambio(Integer cambio) {
		this.cambio = cambio;
	}

	public Boolean getAutomatico() {
		return automatico;
	}

	public void setAutomatico(Boolean automatico) {
		this.automatico = automatico;
	}
	
	
}
