
public class Esercizio8 {
	public void mezziCasuali() {
		System.out.println(generaNumero());
	}
	public double generaNumero() {
		double r = Math.random();
		if(r<0.5)
			return r;
		else
			return r-0.5;		
	}
	public static void main(String[] args) {
		Esercizio8 e = new Esercizio8();
		e.mezziCasuali();
	}
}
