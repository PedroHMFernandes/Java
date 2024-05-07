package entities;

import java.util.List;
import java.util.ArrayList;

public class Viagem {
	private Integer quantidadeDeLugares;
	private Local pontoDePartida;
	private Local destino;
	private List<Local> trajeto = new ArrayList<Local>();
	private Motorista motorista;
	private List<Passageiro> passageiros = new ArrayList<Passageiro>();
	
	public Viagem() {
	}

	public Viagem(Integer quantidadeDeLugares, Local pontoDePartida, Local destino, List<Local> trajeto,
			Motorista motorista) {
		this.quantidadeDeLugares = quantidadeDeLugares;
		this.pontoDePartida = pontoDePartida;
		this.destino = destino;
		this.trajeto = trajeto;
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

	public void setTrajeto(List<Local> trajeto) {
		this.trajeto = trajeto;
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

	
	
	
	
	
	
}
