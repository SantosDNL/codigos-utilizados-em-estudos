package polimorfismo;

public class RodarApp {

	public static void main(String[] args) {

		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe : classes) {
			
			classe.metodo1();
			
		}
		
		System.out.println("");
	
		for (ClasseMae classe : classes) {
			
			classe.metodo2();
		
		}
	
		System.out.println("");
	
	
		ClasseFilha2 classefilha2 = new ClasseFilha2();
		classefilha2.metodo2();	
	
	}

}