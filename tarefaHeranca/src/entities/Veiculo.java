package entities;

public class Veiculo {
	protected String fabricante;
	protected String modelo;
	protected String cor;
	protected Motor motor;
	
	public Veiculo() {
	}

	public Veiculo(String fabricante, String modelo, String cor, Motor motor) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
}
