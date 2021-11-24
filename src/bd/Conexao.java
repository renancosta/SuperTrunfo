package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection criarConexao() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/supertropa"; //Nome da base de dados
		String user = "root"; //nome do usuário do MySQL
		String password = "root"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
}
