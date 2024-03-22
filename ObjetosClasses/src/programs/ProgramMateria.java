package programs;
import entities.Materia;

public class ProgramMateria {
	public static void main(String[] args) {
		
	  Materia materia1 = new Materia();
	  materia1.nome = "Programação de Sistemas";
	  
	  materia1.calcMedia();
	  materia1.mostrarMedia();
	}
}
