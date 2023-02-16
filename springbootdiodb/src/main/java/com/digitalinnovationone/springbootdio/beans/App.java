package com.digitalinnovationone.springbootdio.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Lord Of The Rings");
		livro.setCódigo("0001");
		livro.exibir();
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("J.R.R. Tolkien");
		autor.exibirAutor();
		
		((AbstractApplicationContext) factory).close();
		
	}

}
