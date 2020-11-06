package esercizio4;

public class VeicoloAMotore {
	private int annoimmatricolazione;
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	public VeicoloAMotore() {
		this.annoimmatricolazione=0;
		this.marca="";
		this.tipoAlimentazione="";
		this.cilindrata=0;
	}
	
	public VeicoloAMotore(int annoimmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super();
		this.annoimmatricolazione = annoimmatricolazione;
		this.marca = marca;
		this.tipoAlimentazione = tipoAlimentazione;
		this.cilindrata = cilindrata;
	}
	public int getAnnoimmatricolazione() {
		return annoimmatricolazione;
	}
	public void setAnnoimmatricolazione(int annoimmatricolazione) {
		this.annoimmatricolazione = annoimmatricolazione;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
}
