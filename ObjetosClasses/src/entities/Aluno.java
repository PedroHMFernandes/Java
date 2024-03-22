package entities;

public class Aluno {
	public String nome;
	public double notaFinal;
	public String disciplina;
	
	public void mostrarAluno() {
		System.out.println("Nome: " + nome);
		System.out.printf("Nota final: %.2f%n", notaFinal);
		System.out.println("Disciplina: " +disciplina);
	}
	
	public void mostrarSituacao() {
		String situacao;
		if (notaFinal >= 7.5) {
			situacao = "Aprovado";
		}
		else if (notaFinal < 2) {
			situacao = "Reprovado";
		}
		
		else if (notaFinal > 10 || notaFinal < 0) {
			situacao = "Nota Final: " + notaFinal + ", é inválida";
		}
		
		else {
			situacao = "Exame";
		}
		System.out.println("Situação do aluno: " + situacao);
	}
}

