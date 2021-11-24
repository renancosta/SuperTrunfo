package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bd.Conexao;
import domain.Baralho;

public class BaralhoDao {
	public static Baralho consultaBaralho(int idBaralho) throws SQLException {
		Connection conexao = Conexao.criarConexao();
		Baralho baralho = null;

		String sql = "SELECT * FROM baralho WHERE idbaralho=" + idBaralho;
		PreparedStatement ps = conexao.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			baralho = new Baralho(rs.getInt("idbaralho"), rs.getString("tipo"));
		}

		return baralho;
	}
}
