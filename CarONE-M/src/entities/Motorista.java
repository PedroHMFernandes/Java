package entities;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends Usuario {
	private List<Viagem> viagens = new ArrayList<Viagem>();
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	public Motorista() {
		super();
	}

	public Motorista(String nome, String endereco, String email, String telefone, String senha) {
		super(nome, endereco, email, telefone, senha);
	}

	public void cadastrarViagem(Viagem viagem) {
		viagens.add(viagem);
	}
	
	public List<Passageiro> consultarPassageiros(Viagem viagem) {
		if(viagens.contains(viagem)) {
			return viagem.getPassageiros();
		}
		return null;
	}
	
	public double getMediaDeAvaliacoes() {
		double soma = 0.0;
		int qtdAvaliacoes = 0;
		for(Avaliacao avaliacao: avaliacoes) {
			soma += avaliacao.getNota();
			qtdAvaliacoes += 1;
		}
		double media = soma / qtdAvaliacoes;
		return media;
	}
	
	public List<String> getComentarios() {
		List<String> comentarios = new ArrayList<String>();
		for(Avaliacao avaliacao: avaliacoes) {
			comentarios.add(avaliacao.getComentario());
		}
		return comentarios;
	}
}
