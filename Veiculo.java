package modelo;

public class Veiculo {
	
	private String modelo;
	private Integer velocidadeMax;
	private String cor;
	
	//String dados = "Esse veiculo" + this.modelo + " de cor ";
	//dados += this.getCor() + " Comporta " + this.getQtdPassageiros() + " passageiros ";
	//dados += " e possui uma velocidade maxima de " + this.getVelocidadeMax();
	
	public String getDados(){
	String dados = "Esse veiculo " + this.modelo + " de cor ";
	dados += this.getCor();
	dados += " possui uma velocidade maxima de " + this.getVelocidadeMax();
	return dados;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the velocidadeMax
	 */
	public Integer getVelocidadeMax() {
		return velocidadeMax;
	}

	/**
	 * @param velocidadeMax the velocidadeMax to set
	 */
	public void setVelocidadeMax(Integer velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	
}
