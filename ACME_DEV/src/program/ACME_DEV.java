package program;

import java.time.LocalDate;

import entities.Desenvolvedor;
import entities.Projeto;
import entities.Requisito;
import entities.Squad;
import entities.enums.DevArea;

public class ACME_DEV {
	public static void main(String[] args) {
		// Tenha você e mais dois amigos como desenvolvedores, compondo um squad
		// responsável por construir a solução do projeto final da disciplina;
		Desenvolvedor dev1 = new Desenvolvedor("Pedro", DevArea.valueOf("BACK_END"));
		Desenvolvedor dev2 = new Desenvolvedor("Felipe", DevArea.valueOf("FRONT_END"));
		Desenvolvedor dev3 = new Desenvolvedor("Ronaldo", DevArea.valueOf("UX_UI"));

		Projeto projFinal = new Projeto("Projeto Web");
		Projeto projFiona = new Projeto("FarFarAway");

		Squad squad1 = new Squad("Shrek");

		squad1.addMembro(dev1);
		squad1.addMembro(dev2);
		squad1.addMembro(dev3);
		squad1.addProjeto(projFinal);
		squad1.addProjeto(projFiona);
		projFinal.setEsquadrao(squad1);
		projFiona.setEsquadrao(squad1);

		System.out.println("Esquadrão membros: ");
		squad1.listarMembros();
		System.out.println("\nEsquadrão projetos: ");
		squad1.listarProjetos();
		LocalDate d01 = LocalDate.parse("2024-05-12");
		LocalDate d02 = LocalDate.parse("2024-05-15");
		LocalDate d03 = LocalDate.parse("2024-05-31");
		LocalDate d04 = LocalDate.parse("2024-06-10");
		LocalDate d05 = LocalDate.parse("2024-06-20");

		// No projeto há ao menos seis tarefas que precisam ser distribuidas entre os
		// membros da equipe;

		Requisito requisito1 = new Requisito("Criar design", projFinal, d01, dev3);
		Requisito requisito2 = new Requisito("Testar e avaliar usabilidade do software", projFinal, d04, dev3);
		Requisito requisito3 = new Requisito("Desenvolver interface do software", projFinal, d03, dev2);
		Requisito requisito4 = new Requisito("Trocar cor do botão", projFinal, d02, dev2);
		Requisito requisito5 = new Requisito("Desenvolver API", projFinal, d05, dev1);
		Requisito requisito6 = new Requisito("Implementar lógica de negócios", projFinal, d04, dev1);

		Requisito requisito100 = new Requisito("Design figma", projFiona, d01, dev3);
		Requisito requisito200 = new Requisito("Testar e avaliar usabilidade da ponte para o castelo", projFiona, d04, dev3);
		Requisito requisito300 = new Requisito("Desenvolver carro de cebola", projFiona, d03, dev2);
		Requisito requisito400 = new Requisito("Trocar corzinha", projFiona, d02, dev2);
		Requisito requisito500 = new Requisito("Desenvolver o motor do carro de cebola", projFiona, d05, dev1);
		Requisito requisito600 = new Requisito("Matar o dragão", projFiona, d04, dev3);

		dev1.addTarefa(requisito2);
		requisito600.setResponsavel(dev3);
		dev1.addTarefa(requisito600);
		dev3.removerTarefa(requisito200);
		requisito100.concluir();
		requisito1.concluir();

		// Apresentar a situação do projeto e de tudo que ele contém
		System.out.println("\nProjeto: " + projFinal);
		System.out.println("\nProjeto: " + projFiona);

		// Listar a agenda de cada desenvolvedor
		System.out.println("\nTarefas: " + dev1.getNome());
		dev1.listarTarefas();

		System.out.println("\nTarefas: " + dev2.getNome());
		dev2.listarTarefas();

		System.out.println("\nTarefas: " + dev3.getNome());
		dev3.listarTarefas();
	}
}
