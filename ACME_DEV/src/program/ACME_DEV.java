package program;

import entities.Desenvolvedor;
import entities.Projeto;
import entities.Requisito;
import entities.Squad;
import entities.enums.DevArea;

public class ACME_DEV {
	public static void main(String[] args) {

		Desenvolvedor dev1 = new Desenvolvedor("Pedro", DevArea.valueOf("BACK_END"));
		Desenvolvedor dev2 = new Desenvolvedor("Felipe", DevArea.valueOf("FRONT_END"));
		Desenvolvedor dev3 = new Desenvolvedor("Ronaldo", DevArea.valueOf("UX_UI"));
		
	}
}
