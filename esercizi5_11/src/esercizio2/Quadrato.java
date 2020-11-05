package esercizio2;

public class Quadrato extends Rettangolo {
	private double lato;
	
	public Quadrato(double lato) {
		super(lato,lato);
		this.lato=lato;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	public void visualizza() {
		System.out.print("Quadrato: lato = "+lato);
		// super.super.visualizza()
		super.visualizza();
	}
}
