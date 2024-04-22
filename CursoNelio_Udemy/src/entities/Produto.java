package entities;

public class Produto {
	String descricao;
	int quantidade;
	double preco;
	
	public Produto(String descricao, double preco, int quantidade) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public void reporEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public double calcPrecoPagar(double percentual) {
		return preco * (1 - percentual / 100.0);
	}
	
	public String exibirDetalhes() {
		return descricao + ", quantidade: " + quantidade + ", preco: $" + String.format("%.2f", preco);
	}
}
