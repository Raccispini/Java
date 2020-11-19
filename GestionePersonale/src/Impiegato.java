
public class Impiegato extends Dipendente{
	private int numBonus;
	
	public Impiegato(String nome, String indirizzo, String telefono, String codiceFiscale, double stipendioMin,int numBonus) {
		super(nome, indirizzo, telefono, codiceFiscale, stipendioMin);
		this.numBonus = numBonus;
	}

	@Override
	public double calcoloStipendio() {
		return super.getStipendioMin()+numBonus;
	}

	@Override
	public String toString() {
		return "Impiegato: "+super.nome+"\tCodice Fiscale: "+super.getCodiceFiscale()+"\tIndirizzo: "+super.indirizzo+"\tTelefono: "+super.telefono+"\tStipendio: "+calcoloStipendio();
	}
	
	
}
