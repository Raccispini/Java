
public abstract class Operadarte {
	protected String titolo;
	protected String artista;
	
	
	public Operadarte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}

	public abstract double ingombro();
	public abstract void stampa();
	public boolean equals(Object o) {
		
		if( this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
	
	public void printIngombro() {
		System.out.println(ingombro());
	}
	
	
}
