package br.com.marketplace.model;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private boolean logado;
	
	
	public Usuario(int id, String nome, String email, boolean logado) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.logado = logado;
	}

	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	
	
	
}
