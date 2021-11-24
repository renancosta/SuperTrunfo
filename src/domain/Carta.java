package domain;

public class Carta {
	private Integer idcarta;
	private Baralho baralho;
	private String nome;
	private String tipo;
	private String imagem;
	private int atributo1;
	private int atributo2;
	private int atributo3;
	private int atributo4;
	private int atributo5;
	
	public Carta() {
		
	}
	
	public Carta(Integer idcarta, Baralho baralho, String nome, String tipo, String imagem, int atributo1,
			int atributo2, int atributo3, int atributo4, int atributo5) {
		super();
		this.idcarta = idcarta;
		this.baralho = baralho;
		this.nome = nome;
		this.tipo = tipo;
		this.imagem = imagem;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
		this.atributo5 = atributo5;
	}
	
	public Integer getIdcarta() {
		return idcarta;
	}

	public void setIdcarta(Integer idcarta) {
		this.idcarta = idcarta;
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	public int getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}

	public int getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(int atributo4) {
		this.atributo4 = atributo4;
	}

	public int getAtributo5() {
		return atributo5;
	}

	public void setAtributo5(int atributo5) {
		this.atributo5 = atributo5;
	}

	public boolean ehSuperTrunfo() {
		if(tipo.equals("1B")) {
			return true;
		} else {
			return false;
		}
	}
	
}
