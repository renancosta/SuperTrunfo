package domain;

import java.util.List;

public class Tema {
	private String nome;
	private List<Carta> cartas;
	
	public Tema() {
		
	}
	
	public Tema(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
