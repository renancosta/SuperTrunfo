package domain;

public class Baralho {
	private Integer idbaralho;
	private String tipo;
	
	public Baralho() {
		
	}
	
	public Baralho(Integer idbaralho, String tipo) {
		super();
		this.idbaralho = idbaralho;
		this.tipo = tipo;
	}



	public Integer getIdbaralho() {
		return idbaralho;
	}
	public void setIdbaralho(Integer idbaralho) {
		this.idbaralho = idbaralho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
