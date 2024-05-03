package entities;

public class Requisito {
	private String descricao;
	private int tempo;
	private String responsavel;
	
	public Requisito(String descricao) {
		this.descricao = descricao;
	}
	
	public Requisito(String descricao, int tempo) {
		this.descricao = descricao;
		this.tempo = tempo;
	}
	
	public Requisito(String descricao, int tempo, String responsavel) {
		this.descricao = descricao;
		this.tempo = tempo;
		this.responsavel = responsavel;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
}
