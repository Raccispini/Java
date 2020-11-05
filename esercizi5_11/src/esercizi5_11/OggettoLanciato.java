package esercizi5_11;
import java.util.Random;

public class OggettoLanciato {
	private int facce;
	
	public OggettoLanciato(int facce) {
		this.facce=facce;
	}
	public int lancia() {
		Random r = new Random();
		return r.nextInt(facce)+1;
	}
	public int getFacce() {
		return facce;
	}
	public void setFacce(int facce) {
		this.facce = facce;
	}
	
	
}
