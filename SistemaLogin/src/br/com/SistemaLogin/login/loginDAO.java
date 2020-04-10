package br.com.SistemaLogin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class loginDAO {

	private Connection con;

	public loginDAO(Connection con) {
		this.con = con;
	}

	public void adicionar(loginBD l) throws SQLException {

		String sql = "insert into login(usuario, senha) values(?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, l.getUsuario());
			stmt.setString(2, l.getSenha());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}
