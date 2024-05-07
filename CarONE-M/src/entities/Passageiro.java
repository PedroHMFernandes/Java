package entities;

import java.util.ArrayList;
import java.util.List;

public class Passageiro extends Usuario {
	private List<Viagem> viagens = new ArrayList<Viagem>();
	
	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String endereco, String email, String telefone, String senha, List<Viagem> viagens) {
		super(nome, endereco, email, telefone, senha);
		this.viagens = viagens;
	}
	
	
	
}
