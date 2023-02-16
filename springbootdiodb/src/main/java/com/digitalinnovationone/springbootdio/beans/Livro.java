package com.digitalinnovationone.springbootdio.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
	private String nome;
	private String código;
	
	@Autowired
	AutorLivro autorLivro;
	
	
	public AutorLivro getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(AutorLivro autorLivro) {
		this.autorLivro = autorLivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCódigo() {
		return código;
	}
	public void setCódigo(String código) {
		this.código = código;
	}

	
	public void exibir() {
		System.out.println(this.nome + " - Cod.: " + this.código);
	}


}
