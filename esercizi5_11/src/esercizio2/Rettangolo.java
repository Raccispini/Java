package esercizio2;

public class Rettangolo extends Figura{
	private double base;
	private double altezza;
	
	public Rettangolo(double base,double altezza) {
		super((base+altezza)*2,base*altezza);
		this.base = base;
		this.altezza = altezza;
	}
	public void ricalcoloPerimetro() {
		super.setPerimetro((base+altezza)*2); 
	}
	public void ricalcoloArea() {
		super.setArea(base*altezza);
	}
	public double getArea() {
		return super.getArea();
	}
	public double getPerimetro() {
		return super.getPerimetro();
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public void visualizza() {
		System.out.print("Rettangolo: base = "+base+" altezza = "+altezza);
		super.visualizza();
	}
}
