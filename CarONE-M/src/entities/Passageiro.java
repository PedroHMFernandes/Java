package entities;

import java.util.ArrayList;
import java.util.List;

public class Passageiro extends Usuario {
	private List<Viagem> viagens = new ArrayList<Viagem>();
	
	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String endereco, String email, String telefone, String senha) {
		super(nome, endereco, email, telefone, senha);
	}
	
	
	
}
