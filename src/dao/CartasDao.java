package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bd.Conexao;
import domain.Baralho;
import domain.Carta;

public class CartasDao {

	public static List<Carta> carregaCartas() throws SQLException {
		Connection conexao = Conexao.criarConexao();
		List<Carta> cartas = new ArrayList<Carta>();
		Baralho baralho = BaralhoDao.consultaBaralho(2);

		String sql = "SELECT * FROM carta WHERE baralho_idbaralho=" + baralho.getIdbaralho();
		PreparedStatement ps = conexao.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			cartas.add(new Carta(rs.getInt("idcarta"), baralho, rs.getString("nome"), rs.getString("tipo"),
					rs.getString("imagem"), rs.getInt("atributo1"), rs.getInt("atributo2"), rs.getInt("atributo3"),
					rs.getInt("atributo4"), rs.getInt("atributo5")));
		}

		conexao.close();

		return cartas;
	}
}
