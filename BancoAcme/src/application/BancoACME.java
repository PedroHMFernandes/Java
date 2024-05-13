package application;

import entities.ContaEspecial;

public class BancoACME {

	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial(12, "Ronaldo Fenômeno", 100, 150 );
		ce.deposito(30);
		ce.saque(280);
		System.out.println(ce.extrato());
	}

}
