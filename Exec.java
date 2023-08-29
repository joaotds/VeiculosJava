package execucao;

import modelo.CarroPasseio;
import modelo.Veiculo;

public class Exec {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		carro.setCor("azul");
		carro.setModelo("corsa");
		carro.setVelocidadeMax(500);
		
		CarroPasseio carrinho = new CarroPasseio();
		carrinho.setCor("verde");
		carrinho.setModelo("gol");
		carrinho.setQtdPassageiros(4);
		carrinho.setVelocidadeMax(200);
		System.out.println(carro.getDados());
	}

}
