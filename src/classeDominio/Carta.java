package classeDominio;

public class Carta {
	private int caracteristica1;
	private int caracteristica2;
	private int caracteristica3;
	private int caracteristica4;
	private int caracteristica5;
	private String imagem;
	private String nome;
	private String marca;
	private boolean ehSuperTrunfo;
	
	public Carta() {
		
	}
	
	public Carta(int caracteristica1, int caracteristica2, int caracteristica3, int caracteristica4,
			int caracteristica5, String imagem, String nome, String marca, boolean ehSuperTrunfo) {
		super();
		this.caracteristica1 = caracteristica1;
		this.caracteristica2 = caracteristica2;
		this.caracteristica3 = caracteristica3;
		this.caracteristica4 = caracteristica4;
		this.caracteristica5 = caracteristica5;
		this.imagem = imagem;
		this.nome = nome;
		this.marca = marca;
		this.ehSuperTrunfo = ehSuperTrunfo;
	}
	
	public int getCaracteristica1() {
		return caracteristica1;
	}
	public void setCaracteristica1(int caracteristica1) {
		this.caracteristica1 = caracteristica1;
	}
	public int getCaracteristica2() {
		return caracteristica2;
	}
	public void setCaracteristica2(int caracteristica2) {
		this.caracteristica2 = caracteristica2;
	}
	public int getCaracteristica3() {
		return caracteristica3;
	}
	public void setCaracteristica3(int caracteristica3) {
		this.caracteristica3 = caracteristica3;
	}
	public int getCaracteristica4() {
		return caracteristica4;
	}
	public void setCaracteristica4(int caracteristica4) {
		this.caracteristica4 = caracteristica4;
	}
	public int getCaracteristica5() {
		return caracteristica5;
	}
	public void setCaracteristica5(int caracteristica5) {
		this.caracteristica5 = caracteristica5;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isEhSuperTrunfo() {
		return ehSuperTrunfo;
	}
	public void setEhSuperTrunfo(boolean ehSuperTrunfo) {
		this.ehSuperTrunfo = ehSuperTrunfo;
	}
	
}
