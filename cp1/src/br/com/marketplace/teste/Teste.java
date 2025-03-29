package br.com.marketplace.teste;

import br.com.marketplace.exception.CompraException;
import br.com.marketplace.model.CartaoDeCredito;
import br.com.marketplace.model.Compra;
import br.com.marketplace.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(101, "Felipe", "felipe@fiap.com", true);
		Usuario usuario2 = new Usuario(102, "Lucas", "lucas@fiap.com", true);
		Usuario usuario3 = new Usuario(103, "Micael", "micael@fiap.com", false);
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(1001, "1111222233334444", 123, usuario1);
		CartaoDeCredito cartao2 = new CartaoDeCredito(1002, "2222333344445555", 234, usuario2);
		CartaoDeCredito cartao3 = new CartaoDeCredito(1003, "3333444455556666", 345, usuario3);
		
		
		Compra compra = new Compra(10010, 1000, usuario2, cartao2);
		
		try {
			compra.realizarCompra(usuario2, cartao2, 234, 1000);
		} catch (CompraException e) {
			System.out.println("Exceção capturada: " + e.getMessage());
		}
	}

}
