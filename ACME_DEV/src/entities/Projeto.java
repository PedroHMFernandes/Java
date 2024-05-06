package entities;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private String titulo;
	private String status = "em andamento";
	private Squad esquadrao;
	private List<Requisito> requisitos = new ArrayList<>();

	public Projeto(String titulo) {
		this.titulo = titulo;
	}

	public Projeto(String titulo, Squad esquadrao) {
		this.titulo = titulo;
		this.esquadrao = esquadrao;
		esquadrao.addProjeto(this);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public void adicionarRequisito(Requisito requisito) {
		requisitos.add(requisito);
	}

	public Squad getEsquadrao() {
		return esquadrao;
	}

	public void setEsquadrao(Squad esquadrao) {
		this.esquadrao = esquadrao;
	}

	public void removerRequisito(Requisito requisito) {
		requisitos.remove(requisito);
	}

	public void concluir() {
		status = "concluído";
	}

	public String toString() {
		String squad = "nenhum esquadrão associado";
		if (esquadrao != null) {
			 squad = esquadrao.getNome();
		}

		String string = titulo + "\nSquad: " + squad + "\n";
		for (Requisito requisito : requisitos) {
			string += requisito + "\n";
		}
		string += "Status: " + status;
		return string;
	}
}
