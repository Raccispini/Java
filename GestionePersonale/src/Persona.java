
public abstract class Persona {
	public String nome;
	public String indirizzo;
	public String telefono;
	
	public Persona(String nome, String indirizzo, String telefono) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}
	
	public abstract String toString();
	public abstract double calcoloStipendio();
}
