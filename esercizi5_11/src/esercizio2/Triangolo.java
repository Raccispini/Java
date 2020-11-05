package esercizio2;

public class Triangolo extends Figura {
	private double base;
	private double altezza;
	
	public Triangolo(double base,double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	
	public void calcoloArea() {
		super.setArea(base*altezza/2);
	}
	public void calcoloPerimetro() {
		super.setPerimetro(base+(Math.sqrt((base/2)*(base/2)+(altezza/2)*(altezza/2))*2));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
		calcoloArea();
		calcoloPerimetro();
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
		calcoloArea();
		calcoloPerimetro();
	}
	public void visualizza() {
		System.out.print("Triangolo: base = "+base+" altezza = "+altezza);
		super.visualizza();
	}
}
