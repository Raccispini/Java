
public class Quadro extends Operadarte{
	private double altezza;
	private double larghezza;
	

	public Quadro(String titolo,String autore,double altezza, double larghezza) {
		super(titolo,autore);
		this.altezza = altezza;
		this.larghezza = larghezza;
		
	}
	@Override
	public void stampa() {
		System.out.print("Quadro: "+super.titolo+"\t"+super.artista+" ");
		super.printIngombro();
	}
	@Override
	public double ingombro() {
		return altezza*larghezza;
	}
	
}
