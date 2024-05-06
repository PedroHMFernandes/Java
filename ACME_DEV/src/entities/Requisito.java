package entities;

import java.time.LocalDate;

public class Requisito {
	private String descricao;
	private Projeto projeto;
	private LocalDate dataPrevista;
	private Desenvolvedor responsavel;
	private String status = "em andamento";

	public Requisito(String descricao, Projeto projeto) {
		this.descricao = descricao;
		this.projeto = projeto;
		projeto.adicionarRequisito(this); // adiciona o requisito ao projeto
	}

	public Requisito(String descricao, Projeto projeto, LocalDate dataPrevista) {
		this(descricao, projeto);
		this.dataPrevista = dataPrevista;
	}

	public Requisito(String descricao, Projeto projeto, LocalDate dataPrevista, Desenvolvedor responsavel) {
		this(descricao, projeto, dataPrevista);
		this.responsavel = responsavel;
		responsavel.addTarefa(this); // adiciona a tarefa ao responsável
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataPrevista() {
		return dataPrevista;
	}

	public void dataPrevista(LocalDate tempo) {
		this.dataPrevista = tempo;
	}

	public Desenvolvedor getResponsavel() {
		return responsavel;
	}
	
	public void concluir() {
		status = "concluído";
	}
	
	public void setResponsavel(Desenvolvedor responsavel) {
		if(this.responsavel != null) {
			this.responsavel.removerTarefa(this);
		}
		this.responsavel = responsavel;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	@Override
	public String toString() {
		return "Requisito: " + descricao + ", data prevista: " + dataPrevista + ", " + "projeto: " + projeto.getTitulo()
				+ ", responsável: " + responsavel.getNome()+ ", status: " + status;
	}
}
