package application;

import entities.Produto;

public class Loja {

	public static void main(String[] args) {
		Produto caboC = new Produto("Cabo tipo C", 25.00);
		Produto suporteCelo = new Produto("Suporte top", 50.00, 67);
	
		caboC.reporEstoque(100);
		System.out.println(caboC.exibirDetalhes());
		System.out.println(suporteCelo.exibirDetalhes());
	}

}
