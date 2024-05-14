package entities;

import java.util.List;
import java.util.ArrayList;

public class Viagem {
	private Integer quantidadeDeLugares;
	private Local pontoDePartida;
	private Local destino;
	private Motorista motorista;
	private Boolean progresso = false;
	private List<Local> trajeto = new ArrayList<Local>();
	private List<Passageiro> passageiros = new ArrayList<Passageiro>();
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	public Viagem() {
	}

	public Viagem(Integer quantidadeDeLugares, Local pontoDePartida, Local destino, Motorista motorista) {
		this.quantidadeDeLugares = quantidadeDeLugares;
		this.pontoDePartida = pontoDePartida;
		this.destino = destino;
		this.motorista = motorista;
		motorista.addViagem(this);
	}

	public Integer getQuantidadeDeLugares() {
		return quantidadeDeLugares;
	}

	public void setQuantidadeDeLugares(Integer quantidadeDeLugares) {
		this.quantidadeDeLugares = quantidadeDeLugares;
	}

	public Local getPontoDePartida() {
		return pontoDePartida;
	}

	public void setPontoDePartida(Local pontoDePartida) {
		this.pontoDePartida = pontoDePartida;
	}

	public Local getDestino() {
		return destino;
	}

	public void setDestino(Local destino) {
		this.destino = destino;
	}

	public List<Local> getTrajeto() {
		return trajeto;
	}

	public void addLocal(Local local) {
		trajeto.add(local);
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
		motorista.addViagem(this);
	}

	public boolean getProgresso() {
		return progresso;
	}
	
	public void exibirProgresso() {
		if (progresso) {
			System.out.println(", Progresso: concluído");
		} else {
			System.out.println(", Progresso: a fazer");
		}
	}
	
	public void concluirViagem() {
		progresso = true;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void addPassageiros(Passageiro passageiro) {
		passageiros.add(passageiro);
	}
	
	public void exibirPassageiros() {
		if (passageiros.size() > 0) {
			for (Passageiro pass : passageiros) {
				System.out.println("  - " + pass.getNome());
			}
		} else {
			System.out.println("  - Sem passageiros ainda...");
		}
	}
	
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void addAvaliacao(Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
	}
	
	public String resumoViagem() {
		return pontoDePartida.getDescricao() + " --> " + destino.getDescricao();
	}

}
