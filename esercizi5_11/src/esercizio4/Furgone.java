package esercizio4;

public class Furgone extends VeicoloAMotore{
	private int capacitaCarico;
	
	public Furgone(int capacitaCarico,int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata) {
		super(annoImmatricolazione,marca,tipoAlimentazione,cilindrata);
		this.capacitaCarico=capacitaCarico;
	}
	/*
	public Furgone() {
		super();
		this.capacitaCarico=0;
	}*/

	public int getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	public String toString() {
		return "Furgone da "+capacitaCarico+" di capienza \nCilindrata: " +super.getCilindrata()+"\nTipo alimentazione: "+super.getTipoAlimentazione()+"\nMarca: "+super.getMarca()+"\nAnno immatricolazione: "+super.getAnnoimmatricolazione();
	}
}
