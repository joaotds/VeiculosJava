package modelo;

public class CarroPasseio extends Veiculo {
	
	private Integer qtdPassageiros;
	 
	public String getDados() {
		String dadosCarro = " O carro de Passeio de modelo ";
		dadosCarro += this.getModelo() + " Comporta " + this.getQtdPassageiros() + " passageiros " ;
		dadosCarro += " possui uma velocidade maxima de " + this.getVelocidadeMax();
		return dadosCarro;		
	}

	/**
	 * @return the qtdPassageiros
	 */
	public Integer getQtdPassageiros() {
		return qtdPassageiros;
	}

	/**
	 * @param qtdPassageiros the qtdPassageiros to set
	 */
	public void setQtdPassageiros(Integer qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
}
