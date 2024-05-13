package application;

import entities.Caminhao;
import entities.Carro;
import entities.Motor;
import entities.Veiculo;

public class TestaVeiculo {

	public static void exibir(Veiculo veiculo) {
		String texto;
		texto = "Fabricante: " + veiculo.getFabricante();
		texto += "\nModelo: " + veiculo.getModelo();
		texto += "\nCor: " + veiculo.getCor();
		texto += "\nMotor: " + veiculo.getMotor();

		if (veiculo instanceof Carro) {
			Carro carro = (Carro) veiculo;
			texto += "\nNumero de portas: " + carro.getNumPortas();
			texto += "\nCâmbio: " + carro.getCambio() + " marchas";
			texto += "\nÉ automático: " + carro.getAutomatico();
		} else if (veiculo instanceof Caminhao) {
			Caminhao caminhao = (Caminhao) veiculo;
			texto += "\nCapacidade de carga: " + caminhao.getCapacidadeCarga() + "T";
			texto += "\nQuantidade de eixos: " + caminhao.getQtdeEixos();
		}
		System.out.println(texto);
	}

	public static void main(String[] args) {
		Motor motorRoma = new Motor(8, 3588, "gasolina", 620, true);
		Carro ferrari = new Carro("Ferrari", "Roma Spider", "vermelho", motorRoma, 2, 7, true);
		exibir(ferrari);

		System.out.println();
		
		Motor motorScania = new Motor(8, 16000, "Diesel/Biodiesel", 770, false);
		Caminhao scania = new Caminhao("Scania AB", "EURO 6", "verde", motorScania, 90.0 , 9);
		exibir(scania);

	}
}
