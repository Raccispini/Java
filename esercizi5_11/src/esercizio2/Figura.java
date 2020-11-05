package esercizio2;

public class Figura {
	private double perimetro;
	private double area;
	
	public Figura(double perimetro,double area) {
		this.perimetro=perimetro;
		this.area=area;
	}
	public Figura() {
		this.perimetro=0;
		this.area=0;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void visualizza() {
		System.out.println("Area : "+area+"  Perimetro: ");
	}
	
}
