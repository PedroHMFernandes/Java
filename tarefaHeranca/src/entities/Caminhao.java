package entities;

public class Caminhao extends Veiculo {
	protected Double capacidadeCarga;
	protected Integer qtdeEixos;


	public Caminhao() {
		super();
	}


	public Caminhao(String fabricante, String modelo, String cor, Motor motor, Double capacidadeCarga,
			Integer qtdeEixos) {
		super(fabricante, modelo, cor, motor);
		this.capacidadeCarga = capacidadeCarga;
		this.qtdeEixos = qtdeEixos;
	}


	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}


	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}


	public Integer getQtdeEixos() {
		return qtdeEixos;
	}


	public void setQtdeEixos(Integer qtdeEixos) {
		this.qtdeEixos = qtdeEixos;
	}

}
