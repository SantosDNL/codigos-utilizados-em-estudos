package polimorfismo;

public class ClasseFilha2 extends ClasseMae{
	
	
	@Override
	void metodo1 () {													//aqui onde o m�todo 1 da Classe M�e � sobrescrito para o m�todo 1 Classe Filha 2, utilizando @Override
		
		System.out.println("M�todo 1 da Classe Filha 2!");
		
	}
	
	@Override
	void metodo2 () {													//aqui onde o m�todo 2 da Classe M�e, tamb�m � sobrescrito para o m�todo 2 Classe Filha 2, novamente utilizando @Override
		
		System.out.println("M�todo 2 da Classe Filha 2!");				//nesse print � onde saem os resultados para verificar se o polimorfismo deu certo
		
	}
	
	
	
	
	
	

}
