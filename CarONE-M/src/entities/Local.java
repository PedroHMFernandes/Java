package entities;

public class Local {
	private String descricao;
	private Integer x;
	private Integer y;
	
	public Local() {
	}
	
	public Local(String descricao, Integer km) {
		this.descricao = descricao;
		this.km = km;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getKm() {
		return km;
	}
	public void setKm(Integer km) {
		this.km = km;
	}

	
	
}
