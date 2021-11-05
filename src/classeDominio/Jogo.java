package classeDominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
	private List<Carta> baralho = new ArrayList<Carta>();
	private List<Jogador> sala = new ArrayList<Jogador>();
	Jogador turnoJogador = new Jogador();
	private List<Carta> maoCartas1 = new ArrayList<Carta>();
	private List<Carta> maoCartas2 = new ArrayList<Carta>();

	public void embaralharCartas() {
		
	}

	public void distribuirCartas(int opcao) {
		switch (opcao) {
		case 1:
			maoCartas1 = baralho.subList(0, 15);
			maoCartas2 = baralho.subList(16, 31);
			break;
		case 2:
			maoCartas2 = baralho.subList(0, 15);
			maoCartas1 = baralho.subList(16, 31);
			break;
		case 3:
			for (int i = 0; i < baralho.size(); i++) {
				if (i % 2 == 0) {
					maoCartas1.add(baralho.get(i));
				} else {
					maoCartas2.add(baralho.get(i));
				}
			}
			break;
		}
	}

	public List<Carta> getBaralho() {
		return baralho;
	}

	public void setBaralho(List<Carta> baralho) {
		this.baralho = baralho;
	}

	public List<Jogador> getSala() {
		return sala;
	}

	public void setSala(List<Jogador> sala) {
		this.sala = sala;
	}

	public Jogador getTurnoJogador() {
		return turnoJogador;
	}

	public void setTurnoJogador(Jogador turnoJogador) {
		this.turnoJogador = turnoJogador;
	}

	public List<Carta> getMaoCartas1() {
		return maoCartas1;
	}

	public void setMaoCartas1(List<Carta> maoCartas1) {
		this.maoCartas1 = maoCartas1;
	}

	public List<Carta> getMaoCartas2() {
		return maoCartas2;
	}

	public void setMaoCartas2(List<Carta> maoCartas2) {
		this.maoCartas2 = maoCartas2;
	}
	
	public void imprimeMao(int mao) {
		if(mao==1) {
			System.out.println("Cartas mão 1: ");
			for(Carta c:maoCartas1) {
				System.out.println(c.getNome());
			}
		} else if(mao==2) {
			System.out.println("Cartas mão 2: ");
			for(Carta c:maoCartas2) {
				System.out.println(c.getNome());
			}
		} else {
			System.out.println("Mão inexistente!");
		}
	}
	
}
