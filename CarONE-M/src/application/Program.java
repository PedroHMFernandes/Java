package application;

import java.util.Scanner;

import entities.Local;
import entities.Motorista;
import entities.Passageiro;
import entities.Usuario;
import entities.Viagem;

public class Program {
	public static void mostrarMenuInicial() {
		System.out.println("** CarONE-M **");
		System.out.println("1) Fazer cadastro");
		System.out.println("2) Fazer login");
		System.out.println("3) Sair");
		System.out.print("Selecione uma opção: ");
	}

	public static void mostrarMenuMotorista() {
		System.out.println("** CarONE-M Motorista**");
		System.out.println("1) Cadastrar nova viagem");
		System.out.println("2) Consultar passageiros");
		System.out.println("3) Sair");
		System.out.print("Selecione uma opção: ");
	}

	public static void mostrarMenuPassageiro() {
		System.out.println("** CarONE-M Passageiro **");
		System.out.println("1) Buscar por carona");
		System.out.println("2) Avaliar uma viagem");
		System.out.println("3) Sair");
		System.out.print("Selecione uma opção: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Simulação de base de dados existente

		// Programa principal
		boolean cadastroRealizado = false; // variável que verifica se o cadastro ja foi realizado
		Usuario usuario = null;

		while (true) {
			mostrarMenuInicial();
			int opcao = sc.nextInt();
			// Realizar o cadastro
			if (opcao == 1) {
				if (!cadastroRealizado) {
					sc.nextLine();
					System.out.println("\nCADASTRO");
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					System.out.print("Endereço: ");
					String endereco = sc.nextLine();
					System.out.print("E-mail: ");
					String email = sc.nextLine();
					System.out.print("Telefone: ");
					String telefone = sc.nextLine();
					System.out.print("Senha: ");
					String senha = sc.nextLine();
					System.out.print("Passageiro(p) ou Motorista(m): ");

					char tipoConta = sc.next().toLowerCase().charAt(0);
					while (tipoConta != 'p' && tipoConta != 'm') {
						System.out.println("Tipo inválido. Tente novamente.");
						System.out.println("Passageiro(p) ou Motorista(m): ");
						tipoConta = sc.next().toLowerCase().charAt(0);
					}

					if (tipoConta == 'p') {
						usuario = new Passageiro(nome, endereco, email, telefone, senha);
					} else if (tipoConta == 'm') {
						usuario = new Motorista(nome, endereco, email, telefone, senha);
					}
					cadastroRealizado = true;
					System.out.println();
				} else {
					System.out.println("Cadastro já realizado.\n");
				}

				// Realizar o login
			} else if (opcao == 2) {
				if (cadastroRealizado) {
					sc.nextLine();
					System.out.println("\nLOGIN");
					System.out.print("E-mail: ");
					String emailLogin = sc.nextLine();
					System.out.print("Senha: ");
					String senhaLogin = sc.nextLine();
					System.out.println();
					if (usuario.getEmail().equals(emailLogin) && usuario.getSenha().equals(senhaLogin)) {
						// Menu para o usuário Passageiro
						if (usuario instanceof Passageiro) {
							while (true) {
								mostrarMenuPassageiro();
								int opcaoPassageiro = sc.nextInt();
								if (opcaoPassageiro == 1) {
									System.out.println("Buscar carona");
								} else if (opcaoPassageiro == 2) {
									System.out.println("Avaliar viagem");
								} else if (opcaoPassageiro == 3) {
									System.out.println("\nSessão encerrada.\n");
									break;
								}

							}
						}
						// Menu para o usuário Motorista
						else if (usuario instanceof Motorista) {
							while (true) {
								mostrarMenuMotorista();
								int opcaoMotorista = sc.nextInt();
								if (opcaoMotorista == 1) {
									System.out.println("\nCadastrar nova viagem");
									System.out.print("Quantidade de lugares: ");
									int qtdLugares = sc.nextInt();
									sc.nextLine();
									
									// Local: Ponto de partida
									System.out.println("Ponto de partida: ");
									System.out.print("Descricao: ");
									String descricaoPartida = sc.nextLine();
									System.out.print("Km: ");
									int kmPartida = sc.nextInt();
									sc.nextLine();
									Local partida = new Local(descricaoPartida, kmPartida);
									
									// Local: Destino
									System.out.println("Destino: ");
									System.out.print("Descricao: ");
									String descricaoDestino = sc.nextLine();
									System.out.print("Km: ");
									int kmDestino = sc.nextInt();
									sc.nextLine();
									Local destino = new Local(descricaoDestino, kmDestino);

									Viagem viagem = new Viagem(qtdLugares, partida, destino, (Motorista) usuario);
									// Adicionar parada no trajeto
									System.out.println("Adicionar parada (s/n): ");
									char addParada = sc.next().toLowerCase().charAt(0);
									if(addParada == 's') {
										System.out.println("Parada: ");
										System.out.print("Descricao: ");
										String descricaoParada = sc.nextLine();
										System.out.print("Km: ");
										int kmParada = sc.nextInt();
										Local parada = new Local(descricaoParada, kmParada);
										viagem.addLocal(parada);
									}

									Viagem novaViagem = new Viagem();
								} else if (opcaoMotorista == 2) {
									System.out.println("Consultar passageiros");
								} else if (opcaoMotorista == 3) {
									System.out.println("\nSessão encerrada.\n");
									break;
								}
							}
						}
					} else {
						System.out.println("Login incorreto. Tente novamente.\n");
					}

				} else {
					System.out.println("\nRealize o cadastro primeiro.\n");
				}
			}
			// Sair do sistema
			else if (opcao == 3) {
				System.out.println("Programa finalizado.");
				break;
			}

			else {
				System.out.println("\nOpção inválida. Tente novamente.\n");
			}
		}
		sc.close();
	}
}
