package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaBD {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = Conexao.criarConexao();
		
		String sql = "SELECT nome,tipo,imagem FROM carta WHERE nome is not null";
		PreparedStatement ps = conn.prepareStatement(sql);

		//Executa o comando de consulta aonde guarda os dados retornados dentro do ResultSet.
		//Pelo fato de gerar uma lista de valores, é necessário percorrer os dados através do laço while
		ResultSet rs = ps.executeQuery();
		//Faz a verificação de enquanto conter registros, percorre e resgata os valores
		while(rs.next()){
			//Recupera o índice do campo referente ao campo nome
			String nome = rs.getString(1);
			String tipo = rs.getString("tipo");
			String imagem = rs.getString("imagem");

			System.out.println(nome+" - "+tipo+" - "+imagem);
		}
	}

}
