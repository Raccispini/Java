package esercizio2;

public class TriangoloRettangolo extends Triangolo{
	public TriangoloRettangolo(double base,double altezza) {
		super(base,altezza);
	}
	public void calcoloPerimetro() {
		super.setPerimetro(super.getBase()+super.getAltezza()+Math.sqrt(super.getBase()*super.getBase()+super.getAltezza()*super.getAltezza()));
	}
}
