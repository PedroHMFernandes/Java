package entities;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends Usuario {
	public Motorista() {
		super();
	}

	public Motorista(String nome, String endereco, String email, String telefone, String senha) {
		super(nome, endereco, email, telefone, senha);
	}
	
	public List<Passageiro> consultarPassageiros(Viagem viagem) {
		if(getViagens().contains(viagem)) {
			return viagem.getPassageiros();
		}
		return null;
	}
	
	public double getMediaDeAvaliacoes() {
		double soma = 0.0;
		int qtdAvaliacoes = 0;
		for(Avaliacao avaliacao: getAvaliacoes()) {
			soma += avaliacao.getNota();
			qtdAvaliacoes += 1;
		}
		double media = soma / qtdAvaliacoes;
		return media;
	}
	
	public List<String> getComentarios() {
		List<String> comentarios = new ArrayList<String>();
		for(Avaliacao avaliacao: getAvaliacoes()) {
			comentarios.add(avaliacao.getComentario());
		}
		return comentarios;
	}
}
