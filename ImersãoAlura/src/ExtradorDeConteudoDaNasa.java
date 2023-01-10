import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtradorDeConteudoDaNasa implements ExtratorDeConteudo {
	
	public List <Conteudo> extraiConteudos (String json){
		// extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);
        
        List <Conteudo> conteudos = new ArrayList <> ();
        
        for (Map<String, String> atributos : listaDeAtributos) {
        	String titulo = atributos.get("title").replace(":", " -");
        	String urlImagem = atributos.get("url");	
			var conteudo = new Conteudo(titulo, urlImagem);
			
			conteudos.add (conteudo);
			
		}
        
        
        return conteudos;
        
	}

}
