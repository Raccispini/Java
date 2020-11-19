
public class Volontario extends Persona{

	public Volontario(String nome,String indirizzo,String telefono) {
		super(nome,indirizzo,telefono);
	}
	
	
	@Override
	public String toString() {
		return "Volontario: "+super.nome+"\tIndirizzo: "+super.indirizzo+"\tTelefono: "+super.telefono+"\tStipendio: "+calcoloStipendio();
	}

	@Override
	public double calcoloStipendio() {
		return 0;
	}
	
}
