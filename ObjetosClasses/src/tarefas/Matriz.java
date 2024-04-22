package tarefas;

public class Matriz {
	private int i;
	private int j;
	private double[][] tabela;
	private String[] titulos;

	public Matriz(int i, int j) {
		this.i = i;
		this.j = j;
		this.tabela = new double[i][j];
		this.titulos = new String[j];
	}

	public double getCelula(int i, int j) {
		return tabela[i][j];
	}

	public void setCelula(double valor, int i, int j) {
		tabela[i][j] = valor;
	}

	public double[] getLinha(int i) {
		double[] linha = new double[this.j];
		for (int c = 0; c < this.j; c++) {
			linha[c] = tabela[i][c];
		}
		return linha;
	}

	public void setLinha(int i, double[] linha) {
		for (int c = 0; c < this.j; c++) {
			tabela[i][c] = linha[c];
		}
	}

	public double[] getTotalColunas() {
		double[] totalColunas = new double[this.j];
		for (int j = 0; j < this.j; j++) {
			double somatorio = 0;
			for (int i = 0; i < this.i; i++) {
				somatorio += tabela[i][j];
			}
			totalColunas[j] = somatorio;
		}
		return totalColunas;
	}

	public void setTitulo(String titulo, int j) {
		titulos[j] = titulo;
	}

	public void setTodosTitulo(String[] titulos) {
		for (int j = 0; j < this.j; j++) {
			this.titulos[j] = titulos[j];
		}
	}

	public void exibir() {
		System.out.print(" |");
		for (int j = 0; j < this.j; j++) {
			System.out.printf("%-10s|", titulos[j]);
		}
		System.out.println();
		for(int i = 0; i < this.i; i++) {
			System.out.print(i+1 +"|");
			for (int j = 0; j < this.j; j++) {
				System.out.printf("%10.2f|", tabela[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matriz minhaMatriz = new Matriz(5, 5);

		double[] linha1 = { 101, 123.78, 145.45, 169.81, 152.37 };
		double[] linha2 = { 202, 234.89, 253.42, 232.19, 247.41 };
		double[] linha3 = { 303,  67.32, 73.15, 81.02, 79.13 };
		double[] linha4 = { 404, 48.13, 49.78, 50.22, 48.97 };
		double[] linha5 = { 505, 7654.32, 6987.64,  7193.21,  6023.81 };
		
		String[] titulos = { "Filial", "Janeiro", "Fev", "Março" , "Abril"};
		minhaMatriz.setTodosTitulo(titulos);
		
		minhaMatriz.setLinha(0, linha1);
		minhaMatriz.setLinha(1, linha2);
		minhaMatriz.setLinha(2, linha3);
		minhaMatriz.setLinha(3, linha4);
		minhaMatriz.setLinha(4, linha5);
		
		minhaMatriz.setTitulo("Fevereiro", 2);
		minhaMatriz.setCelula(777.77, 2, 2);
		
		
		minhaMatriz.exibir();
		
		System.out.print("\nTerceira linha: ");
		for(int i = 0; i < linha2.length; i++) {
		System.out.print(minhaMatriz.getLinha(2)[i] + " | ");
		}
		
		System.out.print("\n\nTotal colunas: ");
		for(int i = 0; i < linha2.length; i++) {
			System.out.printf("%.2f | ", minhaMatriz.getTotalColunas()[i]);
			}
	}
}
