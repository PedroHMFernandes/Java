package entities;

import entities.enums.DevArea;

public class Desenvolvedor {
	private String nome;
	private DevArea area;
	
	public Desenvolvedor(String nome) {
		this.nome = nome;
	}
	
	public Desenvolvedor(String nome, DevArea area) {
		this.nome = nome;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DevArea getArea() {
		return area;
	}
	public void setArea(DevArea area) {
		this.area = area;
	}
}
