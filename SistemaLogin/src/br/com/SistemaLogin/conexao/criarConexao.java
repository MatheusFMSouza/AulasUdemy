package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class criarConexao {

	public static Connection getConexao() throws SQLException {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Conectado");

			return DriverManager.getConnection("jdbc:mysql://localhost/sistemalogin?useTimezone=true&serverTimezone=UTC", "root", "123456");

		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());

		} catch (SQLException ew) {
			throw new SQLException(ew.getMessage());

		}
	}

}
