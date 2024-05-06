package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.DevArea;

public class Desenvolvedor {
	private String nome;
	private DevArea area;
	private List<Requisito> listaTarefas = new ArrayList<>();
	private Squad esquadrao;

	public Desenvolvedor(String nome) {
		this.nome = nome;
	}

	public Desenvolvedor(String nome, DevArea area) {
		this.nome = nome;
		this.area = area;
	}
	

	public Desenvolvedor(String nome, DevArea area, Squad esquadrao) {
		this.nome = nome;
		this.area = area;
		this.esquadrao = esquadrao;
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

	public Squad getEsquadrao() {
		return esquadrao;
	}

	public void setEsquadrao(Squad esquadrao) {
		this.esquadrao = esquadrao;
	}

	public void setArea(DevArea area) {
		this.area = area;
	}
	
	public void addTarefa(Requisito requisito) {
		requisito.setResponsavel(this);
	    listaTarefas.add(requisito);
	}

	public void removerTarefa(Requisito requisito) {
		listaTarefas.remove(requisito);
	}

	public void listarTarefas() {
		for (Requisito tarefa : listaTarefas) {
			System.out.println(tarefa.toString());
		}
	}
	
	@Override
	public String toString() {
		return nome + ", área: " + area;
	}

}
