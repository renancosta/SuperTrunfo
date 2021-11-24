package domain;

import java.sql.Date;

public class Jogador {
	private String nome;
	private String email;
	private Date dataNascimento;
	private int numVitorias;
	private int numDerrotas;
	private int qtsHorasJogadas;
	
	public Jogador() {
		
	}
	
	public Jogador(String nome, String email, Date dataNascimento, int numVitorias, int numDerrotas,
			int qtsHorasJogadas) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.numVitorias = numVitorias;
		this.numDerrotas = numDerrotas;
		this.qtsHorasJogadas = qtsHorasJogadas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getNumVitorias() {
		return numVitorias;
	}
	public void setNumVitorias(int numVitorias) {
		this.numVitorias = numVitorias;
	}
	public int getNumDerrotas() {
		return numDerrotas;
	}
	public void setNumDerrotas(int numDerrotas) {
		this.numDerrotas = numDerrotas;
	}
	public int getQtsHorasJogadas() {
		return qtsHorasJogadas;
	}
	public void setQtsHorasJogadas(int qtsHorasJogadas) {
		this.qtsHorasJogadas = qtsHorasJogadas;
	}
}
