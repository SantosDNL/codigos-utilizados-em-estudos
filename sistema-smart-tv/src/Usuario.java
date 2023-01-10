
public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();

		System.out.println("A TV esta ligada? " + smartTv.ligada);
		
//		  System.out.println("Canal: " + smartTv.canal);
//		  System.out.println("Volume: " + smartTv.volume);
		 

		smartTv.ligar();

		System.out.println("\nNovo status -> A TV esta ligada? " + smartTv.ligada);

		System.out.println("\nCanal: " + smartTv.canal);

		
//		 smartTv.subirCanal();
//		 smartTv.subirCanal();
//		 smartTv.subirCanal();
//		 smartTv.subirCanal();
		 
		
		smartTv.mudarCanal(7);

		System.out.println("\nCanal: " + smartTv.canal + "\n");

		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();

//		System.out.println("\nVolume: " + smartTv.volume);

		smartTv.desligar();

		System.out.println("\nNovo status -> A TV esta ligada? " + smartTv.ligada);

	}

}
