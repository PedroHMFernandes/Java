package programs;
import entities.Aluno;

public class ProgramAluno {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Pedro";
		aluno1.notaFinal = 9.7;
		aluno1.disciplina = "Programação de Sistemas";
		
		aluno1.mostrarAluno();
		aluno1.mostrarSituacao();
	}
}
