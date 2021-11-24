package domain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CartasDao;

public class Principal {

	public static void main(String[] args) throws SQLException {
		List<Carta> cartas = CartasDao.carregaCartas();
		
		Jogo jogo = new Jogo();
		
		System.out.println(cartas.size());
		jogo.setBaralho(cartas);
		jogo.embaralharCartas();
		jogo.distribuirCartas(3);
		
		jogo.imprimeMao(1);
		jogo.imprimeMao(2);
		
		
		if(jogo.getMaoCartas1().get(0).getAtributo4()>jogo.getMaoCartas2().get(0).getAtributo4()) {
			System.out.println("Jogador 1 venceu");
			Carta cartaGanhou = jogo.getMaoCartas1().get(0);
			Carta cartaPerdeu = jogo.getMaoCartas2().get(0);
			jogo.getMaoCartas1().remove(0);
			jogo.getMaoCartas1().add(cartaGanhou);
			jogo.getMaoCartas1().add(cartaPerdeu);
			jogo.getMaoCartas2().remove(0);
		} else if (jogo.getMaoCartas1().get(0).getAtributo4()<jogo.getMaoCartas2().get(0).getAtributo4()) {
			System.out.println("Jogador 2 venceu");
			Carta cartaGanhou = jogo.getMaoCartas2().get(0);
			Carta cartaPerdeu = jogo.getMaoCartas1().get(0);
			jogo.getMaoCartas2().remove(0);
			jogo.getMaoCartas2().add(cartaGanhou);
			jogo.getMaoCartas2().add(cartaPerdeu);
			jogo.getMaoCartas1().remove(0);
		} else {
			System.out.println("Empate");
		}
		
		jogo.imprimeMao(1);
		jogo.imprimeMao(2);

	}

}
