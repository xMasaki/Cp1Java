package br.com.marketplace.model;

public class CartaoDeCredito {

	private int id;
	private String numero;
	private int cvv;
	private Usuario usuario;
	
	
	public CartaoDeCredito(int id, String numero, int cvv, Usuario usuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.cvv = cvv;
		this.usuario = usuario;
	}
	

	public int getId() {
		return id;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
