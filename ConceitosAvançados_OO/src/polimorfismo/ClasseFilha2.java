package polimorfismo;

public class ClasseFilha2 extends ClasseMae{
	
	
	@Override
	void metodo1 () {													//aqui onde o método 1 da Classe Mãe é sobrescrito para o método 1 Classe Filha 2, utilizando @Override
		
		System.out.println("Método 1 da Classe Filha 2!");
		
	}
	
	@Override
	void metodo2 () {													//aqui onde o método 2 da Classe Mãe, também é sobrescrito para o método 2 Classe Filha 2, novamente utilizando @Override
		
		System.out.println("Método 2 da Classe Filha 2!");				//nesse print é onde saem os resultados para verificar se o polimorfismo deu certo
		
	}
	
	
	
	
	
	

}
