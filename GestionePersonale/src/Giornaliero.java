
public class Giornaliero extends Dipendente{
	private int giornateLavorative;
	
	public Giornaliero(String nome, String indirizzo, String telefono, String codiceFiscale, double stipendioMin,int giornateLavorative) {
		super(nome, indirizzo, telefono, codiceFiscale, stipendioMin);
		this.giornateLavorative = giornateLavorative;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcoloStipendio() {
		return super.getStipendioMin()*giornateLavorative;
	}

	@Override
	public String toString() {
		return "Giornaliero: "+super.nome+"\tCodice Fiscale: "+super.getCodiceFiscale()+"\tIndirizzo: "+super.indirizzo+"\tTelefono: "+super.telefono+"\tStipendio: "+calcoloStipendio();
	}
	
	
}
