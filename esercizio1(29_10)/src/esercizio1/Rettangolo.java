package esercizio1;

public class Rettangolo {
	private double base;
	private double altezza;
	private double posx;
	private double posy;
	
	public Rettangolo() {
		this.base = 16;
		this.altezza=9;
		this.posx=0;
		this.posy=0;
	}
	public Rettangolo(double base,double altezza,double posx,double posy) {
		this.base=base;
		this.altezza=altezza;
		this.posx=posx;
		this.posy=posy;
	}
	public double getArea() {
		return base*altezza;
	}
	public double getPerimetro() {
		return (base+altezza)*2;
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
	public double getPosx() {
		return posx;
	}
	public void setPosx(double posx) {
		this.posx = posx;
	}
	public double getPosy() {
		return posy;
	}
	public void setPosy(double posy) {
		this.posy = posy;
	}
	
	
}
