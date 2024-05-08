package entities;

import java.util.List;
import java.util.ArrayList;

public class Viagem {
	private Integer quantidadeDeLugares;
	private Local pontoDePartida;
	private Local destino;
	private Boolean progresso = false;
	private Motorista motorista;
	private List<Local> trajeto = new ArrayList<Local>();
	private List<Passageiro> passageiros = new ArrayList<Passageiro>();

	public Viagem() {
	}

	public Viagem(Integer quantidadeDeLugares, Local pontoDePartida, Local destino, Motorista motorista) {
		this.quantidadeDeLugares = quantidadeDeLugares;
		this.pontoDePartida = pontoDePartida;
		this.destino = destino;
		this.motorista = motorista;
	}

	public Viagem(Integer quantidadeDeLugares, Local pontoDePartida, Local destino, List<Local> trajeto,
			Motorista motorista, List<Passageiro> passageiros) {
		this.quantidadeDeLugares = quantidadeDeLugares;
		this.pontoDePartida = pontoDePartida;
		this.destino = destino;
		this.trajeto = trajeto;
		this.motorista = motorista;
		this.passageiros = passageiros;
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
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public String getProgresso() {
		if (progresso) {
			return "concluída";
		}
		return "a fazer";
	}

	public void concluirViagem() {
		this.progresso = true;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

}
