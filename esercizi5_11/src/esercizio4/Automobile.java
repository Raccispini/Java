package esercizio4;

public class Automobile extends VeicoloAMotore {
	private int numPorte;
	
	public Automobile() {
		super();
		this.numPorte=0;
	}
	public Automobile(int numPorte,int annoImmatricolazione,String marca,String tipoAlimentazione,int cilindrata) {
		super(annoImmatricolazione,marca,tipoAlimentazione,cilindrata);
		this.numPorte=numPorte;
	}

	public int getNumPorte() {
		return numPorte;
	}

	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}
	
	public String toString() {
		return "Automobile "+numPorte+"porte \nCilindrata: " +super.getCilindrata()+"\nTipo alimentazione: "+super.getTipoAlimentazione()+"\nMarca: "+super.getMarca()+"\nAnno immatricolazione: "+super.getAnnoimmatricolazione();
	}
}
