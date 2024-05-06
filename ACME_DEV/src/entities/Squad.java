package entities;

import java.util.ArrayList;
import java.util.List;

public class Squad {
	private String nome;
	private List<Desenvolvedor> membros = new ArrayList<>();
	private List<Projeto> projetos = new ArrayList<>();

	public Squad() {

	}

	public Squad(String nome) {
		this.nome = nome;
	}

	public List<Desenvolvedor> getMembros() {
		return membros;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addMembro(Desenvolvedor membro) {
		membro.setEsquadrao(this);
		membros.add(membro);
	}

	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}

	public void removeMembro(Desenvolvedor membro) {
		membro.setEsquadrao(null);
		membros.remove(membro);
	}

	public void removeProjeto(Projeto projeto) {
		projeto.setEsquadrao(null);
		projetos.remove(projeto);
	}

	public void listarProjetos() {
		for (Projeto projeto : projetos) {
			System.out.println(projeto.getTitulo());
		}
	}

	public void listarMembros() {
		for (Desenvolvedor dev : membros) {
			System.out.println(dev.toString());
		}
	}

}
