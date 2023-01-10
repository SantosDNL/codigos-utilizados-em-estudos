
public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
	public void subirCanal() {
		canal++;
	}
	
	public void descerCanal() {
		canal--;
	}
	
	public void	 mudarCanal(int novoCanal){
		canal = novoCanal;
		System.out.println("\nMudando de canal...");
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Volume: " + volume);
	}
	
	public void ligar() {
		ligada = true;
		System.out.println("\nLigando TV...");
	}

	public void desligar() {
		ligada = false;
		System.out.println("\nDesligando TV...");
	}
	
	
}
