
public class AppCarro {

	public static void main(String[] args) {
				
				Carro carro = new Carro("azul", "Civic", 30);
				
				System.out.println("O valor total para encher o tanque do " + carro.getModelo() + " " + carro.getCor() + " é: " + carro.totalValorTanque(0));

	}

}
