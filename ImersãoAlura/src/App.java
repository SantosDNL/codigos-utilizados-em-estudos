import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP e buscar os top 250 filmes
        // String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        //String url = "https://api.mocki.io/v2/549a5d8b/Top250Movies";
    	//String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
    	
    	String url = "http://localhost:8090/linguagens";
    	
    	
    	var http = new ClienteHttp();
    	String json = http.buscaDados(url);
    	

        var geradora = new GeradorDeFigurinhas();
        
        // exibir e manipular os dados
        //ExtradorDeConteudoDaNasa extrator = new ExtradorDeConteudoDaNasa();
        ExtradorDeConteudoDoIMBD extrator =  new ExtradorDeConteudoDoIMBD();
        List <Conteudo> conteudos = extrator.extraiConteudos(json);
        
        
        for (int i = 0; i < 3; i++) {
        	Conteudo conteudo = conteudos.get(i);
     
        	InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
        	String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";
        	
        	/*String urlImagem = conteudo.get("image");
        	String titulo = conteudo.get("title");
        	InputStream inputStream = new URL(urlImagem).openStream();
        	String NomeArquivo = "saida/" + titulo + ".png";*/
        	
        	
        	geradora.cria(inputStream, nomeArquivo);        	
        	
            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}