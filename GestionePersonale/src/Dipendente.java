
public class Dipendente extends Persona {
	private String codiceFiscale;
	private double stipendioMin;
	
	public Dipendente(String nome,String indirizzo,String telefono,String codiceFiscale,double stipendioMin) {
		super(nome,indirizzo,telefono);
		this.codiceFiscale =codiceFiscale;
		this.stipendioMin = stipendioMin;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double calcoloStipendio() {
		return stipendioMin;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public double getStipendioMin() {
		return stipendioMin;
	}

	public void setStipendioMin(double stipendioMin) {
		this.stipendioMin = stipendioMin;
	}
	
}
