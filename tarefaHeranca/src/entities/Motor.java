package entities;

public class Motor {
	private Integer numCilindros;
	private Integer cilindradas;
	private String combustivel;
	private Integer potencia;
	private Boolean turbo;

	public Motor() {
	}

	public Motor(Integer numCilindros, Integer cilindradas, String combustivel, Integer potencia, Boolean turbo) {
		this.numCilindros = numCilindros;
		this.cilindradas = cilindradas;
		this.combustivel = combustivel;
		this.potencia = potencia;
		this.turbo = turbo;
	}

	public Integer getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(Integer numCilindros) {
		this.numCilindros = numCilindros;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Boolean getTurbo() {
		return turbo;
	}

	public void setTurbo(Boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		String texto;
		texto = this.numCilindros + " cilindros, " + this.cilindradas + "cc, " + 
		this.combustivel + ", " + this.potencia + " cavalos, " + "turbo: " + this.turbo;
		return texto;
	}
	
}
