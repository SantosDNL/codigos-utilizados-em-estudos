package polimorfismo;

public class ClasseFilha1 extends ClasseMae{						

	@Override
	void metodo1 () {												//aqui onde o método 1 da classe mãe é sobrescrito para o método 1 Classe Filha 1, utilizando @Override
		
		System.out.println("Método 1 da Classe Filha 1!");
		
	}
	
}
