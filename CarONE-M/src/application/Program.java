package application;

import java.util.Scanner;

import entities.Avaliacao;
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
		System.out.println("3) Verificar avaliações");
		System.out.println("4) Sair");
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

		boolean cadastroRealizado = false; // variável que verifica se o cadastro ja foi realizado
		Usuario usuario = null;
		Passageiro passageiro = null;
		Motorista motorista = null;
		Passageiro p1 = new Passageiro();
		p1.setNome("Robirso");
		// Programa principal
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
					usuario = new Usuario(nome, endereco, email, telefone, senha);
					passageiro = new Passageiro(nome, endereco, email, telefone, senha);
					motorista = new Motorista(nome, endereco, email, telefone, senha);
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
						while (true) {
							System.out.println("Passageiro(p) ou Motorista(m): ");
							char tipoConta = sc.next().toLowerCase().charAt(0);
							while (tipoConta != 'p' && tipoConta != 'm') {
								System.out.println("Tipo inválido. Tente novamente.");
								System.out.println("Passageiro(p) ou Motorista(m): ");
								tipoConta = sc.next().toLowerCase().charAt(0);
							}
							// Menu para o usuário Passageiro
							if (tipoConta == 'p') {
								if (passageiro instanceof Passageiro) {
									while (true) {
										mostrarMenuPassageiro();
										int opcaoPassageiro = sc.nextInt();
										if (opcaoPassageiro == 1) {
											System.out.println("Buscar carona");
										} else if (opcaoPassageiro == 2) {
											System.out.println("Avaliar viagem");
										} else if (opcaoPassageiro == 3) {
											System.out.println("\nSessão passageiro encerrada.\n");
											break;
										}
									}
								}
							}
							// Menu para o usuário Motorista
							else if (tipoConta == 'm') {
								if (motorista instanceof Motorista) {
									while (true) {
										mostrarMenuMotorista();
										int opcaoMotorista = sc.nextInt();
										if (opcaoMotorista == 1) {
											System.out.println("\nCadastrar nova viagem");
											System.out.print("Quantidade de lugares: ");
											int qtdLugares = sc.nextInt();
											sc.nextLine();

											// Local: Ponto de partida
											System.out.println("PONTO DE PARTIDA");
											System.out.print("Descricao: ");
											String descricaoPartida = sc.nextLine();
											System.out.print("Km: ");
											int kmPartida = sc.nextInt();
											sc.nextLine();
											Local partida = new Local(descricaoPartida, kmPartida);

											// Local: Destino
											System.out.println("DESTINO ");
											System.out.print("Descricao: ");
											String descricaoDestino = sc.nextLine();
											System.out.print("Km: ");
											int kmDestino = sc.nextInt();
											sc.nextLine();
											Local destino = new Local(descricaoDestino, kmDestino);
											Viagem viagem = new Viagem(qtdLugares, partida, destino, motorista);
											// Adicionar parada no trajeto
											char addParada;
											do {
												System.out.println("Adicionar parada (s/n): ");
												addParada = sc.next().toLowerCase().charAt(0);
												if (addParada == 's') {
													sc.nextLine();
													System.out.println("Parada: ");
													System.out.print("Descricao: ");
													String descricaoParada = sc.nextLine();
													System.out.print("Km: ");
													int kmParada = sc.nextInt();
													Local parada = new Local(descricaoParada, kmParada);
													viagem.addLocal(parada);
												}
											} while (addParada != 'n');

										} else if (opcaoMotorista == 2) {
											System.out.println("Consultar passageiros");
											for (Viagem viagem : motorista.getViagens()) {
												System.out.println(viagem.getPontoDePartida().getDescricao() + "--->"
														+ viagem.getDestino().getDescricao());
												for (Passageiro pass : viagem.getPassageiros()) {
													System.out.println("\t" + pass.getNome());
												}
											}
											System.out.println();
										} else if (opcaoMotorista == 3) {
											System.out.println("Verificar avaliações");
											for (Avaliacao avaliacao : motorista.getAvaliacoes()) {
												System.out.println(avaliacao.getUsuario() + ":" + avaliacao.getNota());
												if (avaliacao.getComentario() != null) {
													System.out.println("Comentário: " + avaliacao.getComentario());
												}
											}
											System.out.println("Nota geral: " + motorista.getMediaDeAvaliacoes());

										} else if (opcaoMotorista == 4) {
											System.out.println("\nSessão motorista encerrada.\n");
											break;
										}
									}
								}
							}
							System.out.println("Sair da conta (y)?");
							char sair = sc.next().toLowerCase().charAt(0);
							if (sair == 'y') {
								break;
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
