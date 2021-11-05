package classeDominio;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Carta carta = new Carta(1,5,7,9,4,"/imagem/carta1.png","Carro 1","1A",false);
		Carta carta2 = new Carta(1,10,5,8,5,"/imagem/carta2.png","Carro 2","1B",false);
		Carta carta3 = new Carta(7,2,2,1,9,"/imagem/carta3.png","Carro 3","1C",false);
		Carta carta4 = new Carta(8,9,8,2,6,"/imagem/carta4.png","Carro 4","1D",false);
		Carta carta5 = new Carta(3,3,9,6,2,"/imagem/carta5.png","Carro 5","2A",false);
		Carta carta6 = new Carta(2,8,4,10,7,"/imagem/carta6.png","Carro 6","2B",false);
		List<Carta> cartas = new ArrayList<Carta>();
		
		Jogo jogo = new Jogo();
		
		cartas.add(carta);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		cartas.add(carta6);
		
		jogo.setBaralho(cartas);
		jogo.embaralharCartas();
		jogo.distribuirCartas(3);
		
		jogo.imprimeMao(1);
		jogo.imprimeMao(2);
		
		
		if(jogo.getMaoCartas1().get(0).getCaracteristica4()>jogo.getMaoCartas2().get(0).getCaracteristica4()) {
			System.out.println("Jogador 1 venceu");
			Carta cartaGanhou = jogo.getMaoCartas1().get(0);
			Carta cartaPerdeu = jogo.getMaoCartas2().get(0);
			jogo.getMaoCartas1().remove(0);
			jogo.getMaoCartas1().add(cartaGanhou);
			jogo.getMaoCartas1().add(cartaPerdeu);
			jogo.getMaoCartas2().remove(0);
		} else if (jogo.getMaoCartas1().get(0).getCaracteristica4()<jogo.getMaoCartas2().get(0).getCaracteristica4()) {
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
