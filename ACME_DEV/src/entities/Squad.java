package entities;
import java.util.ArrayList;
import java.util.List;


public class Squad {
	private List<Desenvolvedor> membros = new ArrayList<>();
	private List<Projeto> projetos = new ArrayList<>();
	
	public Squad(List<Desenvolvedor> membros, List<Projeto> projetos) {
		this.membros = membros;
		this.projetos = projetos;
	}

	public List<Desenvolvedor> getMebros() {
		return membros;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	public void addMembro(Desenvolvedor membro) {
		membros.add(membro);
	}
	
	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public void removeMembro(Desenvolvedor membro) {
		membros.remove(membro);
	}
	
	public void removeProjeto(Projeto projeto) {
		projetos.remove(projeto);
	}
}
