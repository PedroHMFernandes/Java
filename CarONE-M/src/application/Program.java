package application;

import java.util.Scanner;

public class Program {
	public static void mostrarMenu() {
		System.out.println("** CarONE-M **");
		System.out.println("1) Cadastrar um novo usuário");
		System.out.println("2) Cadastrar uma viagem");
		System.out.println("3) Buscar por carona");
		System.out.println("4) Avaliar uma viagem");
		System.out.println("5) Sair");
		System.out.print("Selecione uma opção: ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		mostrarMenu();
		
		
		
	}
}


