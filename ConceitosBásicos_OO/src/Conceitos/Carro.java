import java.util.Scanner;

class Carro {					//aqui onde se inicia a classe
	String cor;
	String modelo;				//aqui foram declarados e criados os atributos
	int tanque;	
	
	public Carro(String cor, String modelo, int tanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.tanque = tanque;
	}
	
	

	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setTanque(int tanque) {
		this.tanque = tanque;
	}
	
	public int getTanque() {
		return tanque;
	}
	
	double totalValorTanque (double valorCombustivel) {					//aqui onde se cria o método da classe
		Scanner ler = new Scanner(System.in) ;
		System.out.printf ("Insira o valor do combustível: ");
		valorCombustivel = ler.nextDouble();
		return tanque * valorCombustivel;
	}
	
}								//aqui onde se finaliza a classe
