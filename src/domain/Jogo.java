package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
	private List<Carta> baralho = new ArrayList<Carta>();
	private List<Jogador> sala = new ArrayList<Jogador>();
	Jogador turnoJogador = new Jogador();
	private List<Carta> maoCartas1 = new ArrayList<Carta>();
	private List<Carta> maoCartas2 = new ArrayList<Carta>();
	private List<Carta> cartasEmpatadas = new ArrayList<Carta>();
	
	public void embaralharCartas() {
		Collections.shuffle(baralho);
	}

	public void distribuirCartas(int opcao) {
		switch (opcao) {
		case 1:
			maoCartas1 = baralho.subList(0, 15);
			maoCartas2 = baralho.subList(15, 31);
			break;
		case 2:
			maoCartas2 = baralho.subList(0, 15);
			maoCartas1 = baralho.subList(15, 31);
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
			System.out.println("Cartas m�o 1: ");
			for(Carta c:maoCartas1) {
				System.out.println(c.getNome());
			}
		} else if(mao==2) {
			System.out.println("Cartas m�o 2: ");
			for(Carta c:maoCartas2) {
				System.out.println(c.getNome());
			}
		} else if (mao==3) {
			System.out.println("Cartas Empatadas: ");
			for(Carta c:cartasEmpatadas) {
				System.out.println(c.getNome());
			}
		} else {
			System.out.println("M�o inexistente!");
		}
	}
	
	public void jogar() {
		if(maoCartas1.get(0).getAtributo4()>maoCartas2.get(0).getAtributo4()) {
			System.out.println("Jogador 1 venceu");
			Carta cartaGanhou = maoCartas1.get(0);
			Carta cartaPerdeu = maoCartas2.get(0);
			maoCartas1.remove(0);
			maoCartas1.add(cartaGanhou);
			maoCartas1.add(cartaPerdeu);
			maoCartas2.remove(0);
			if(!cartasEmpatadas.isEmpty()) {
				maoCartas1.addAll(cartasEmpatadas);
				cartasEmpatadas.removeAll(cartasEmpatadas);
			}
		} else if (maoCartas1.get(0).getAtributo4()<maoCartas2.get(0).getAtributo4()) {
			System.out.println("Jogador 2 venceu");
			Carta cartaGanhou = maoCartas2.get(0);
			Carta cartaPerdeu = maoCartas1.get(0);
			maoCartas2.remove(0);
			maoCartas2.add(cartaGanhou);
			maoCartas2.add(cartaPerdeu);
			maoCartas1.remove(0);
			if(!cartasEmpatadas.isEmpty()) {
				maoCartas2.addAll(cartasEmpatadas);
				cartasEmpatadas.removeAll(cartasEmpatadas);
			}
		} else {
			System.out.println("Empatado");
			cartasEmpatadas.add(maoCartas1.get(0));
			cartasEmpatadas.add(maoCartas2.get(0));
			maoCartas1.remove(0);
			maoCartas2.remove(0);
		}
		System.out.println(maoCartas1.size());
		System.out.println(maoCartas2.size());
	}
	
}