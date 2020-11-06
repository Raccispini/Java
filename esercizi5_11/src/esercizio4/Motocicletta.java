package esercizio4;

public class Motocicletta extends VeicoloAMotore{
	private String tipologia;
	private int numTempiMotore;
	
	public Motocicletta(String tipologia,int numTempiMotore,int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata) {
		super(annoImmatricolazione,marca,tipoAlimentazione,cilindrata);
		this.tipologia=tipologia;
		this.numTempiMotore=numTempiMotore;
	}
	public Motocicletta() {
		super();
		this.tipologia="";
		this.numTempiMotore=0;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public int getNumTempiMotore() {
		return numTempiMotore;
	}
	public void setNumTempiMotore(int numTempiMotore) {
		this.numTempiMotore = numTempiMotore;
	}
	
	public String toString() {
		return "Motocicletta "+tipologia+"  "+numTempiMotore+" tempi \nCilindrata: " +super.getCilindrata()+"\nTipo alimentazione: "+super.getTipoAlimentazione()+"\nMarca: "+super.getMarca()+"\nAnno immatricolazione: "+super.getAnnoimmatricolazione();
	}
}
