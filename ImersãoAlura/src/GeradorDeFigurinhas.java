import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;


public class GeradorDeFigurinhas {

	public void cria (InputStream inputStream, String nomeArquivo) throws Exception {
		
		//ler a imagem
		//InputStream inputStream = new FileInputStream ( new File ("entrada/filme.jpg"));
		//InputStream inputStream = new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg").openStream();
		
		BufferedImage imagemOriginal = ImageIO.read(inputStream);
				
		//criar nova imagem com transparência e novo tamanho
		
		int largura =  imagemOriginal.getWidth();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
		
		//copiar a imagem original pra nova imagem (em memória)
		
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics(); 
		graphics.drawImage(imagemOriginal, 0, 0, null);
		
		//configurar fonte
		
		var fonte = new Font(Font.SANS_SERIF, Font.ITALIC, 70);
		graphics.setFont (fonte);
		graphics.setColor (Color.red);
		
		//escrever uma frase na nova imagem
		
		graphics.drawString("TOPZERA", 250 , novaAltura - 100);
		
		//escrever a nova imagem em um arquivo
		
		ImageIO.write(novaImagem, "png", new File (nomeArquivo));
		
	}
	
	/*public static void main(String[] args) throws Exception {
		
		var geradora =  new GeradorDeFigurinhas();
		geradora.cria();
		
	}*/
	
}
