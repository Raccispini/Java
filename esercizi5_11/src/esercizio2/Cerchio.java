package esercizio2;

public class Cerchio extends Figura{
	private double raggio;
	
	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}
	public void calcoloArea() {
		super.setArea(raggio*raggio*Math.PI);
	}
	public void calcoloPerimetro() {
		super.setPerimetro(2*raggio*Math.PI);
	}
	public double getRaggio() {
		return raggio;
	}
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	public void visualizza() {
		System.out.print("Cerchio: raggio = "+raggio);
		super.visualizza();
	}
	
}
