package entities;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private String titulo;
	private List<Requisito> requisitos = new ArrayList<>();

	public Projeto(String titulo) {
		this.titulo = titulo;
	}

	public Projeto(String titulo, List<Requisito> requisitos) {
		this.titulo = titulo;
		this.requisitos = requisitos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<Requisito> requisitos) {
		this.requisitos = requisitos;
	}
}
