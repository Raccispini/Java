
public class Scultura extends Operadarte{
	private double altezza;
	private double larghezza;
	private double profondita;
	
	public Scultura(String titolo,String autore,double altezza, double larghezza, double profondita) {
		super(titolo,autore);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}
	
	@Override
	public void stampa() {
		System.out.print("Scultura: "+super.titolo+"\t"+super.artista+" ");
		super.printIngombro();
	}
	
	@Override
	public double ingombro() {
		return altezza*larghezza*profondita;
	}
	
	
}
