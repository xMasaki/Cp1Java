package br.com.marketplace.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.marketplace.model.Compra;

public class CompraDAO {

	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = "rm553084";
	private String password = "191298";
	
	public CompraDAO() {
		super();
	}


	public void salvarCompraDAO(Compra compra) { 
		String insert = "INSERT INTO COMPRAS (ID_COMPRA, VALOR, ID_USUARIO, ID_CARTAO) VALUES(?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = conn.prepareStatement(insert)){
			preparedStatement.setInt(1, compra.getId());
			preparedStatement.setDouble(2, compra.getValor());
			preparedStatement.setInt(3, compra.getUsuario().getId());
			preparedStatement.setInt(4, compra.getCartao().getId());
			preparedStatement.executeUpdate();
			System.out.println("Compra efetuada com sucesso.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
