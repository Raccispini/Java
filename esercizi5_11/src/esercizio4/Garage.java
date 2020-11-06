package esercizio4;
import java.util.ArrayList;

public class Garage {
	//private ArrayList<VeicoloAMotore> veicoli = new ArrayList<VeicoloAMotore>();
	private VeicoloAMotore[] posti ;
	
	
	public Garage(int numPosti) {
		posti = new VeicoloAMotore[numPosti];
		for (int i = 0; i < posti.length; i++) {
			posti[i]=null;
		}
	}
	
	public void immettiNuovoVeicolo(VeicoloAMotore v) {
		for (int i = 0; i < posti.length; i++) {
			if(posti[i]==null) {
				posti[i]=v;
				return;
			}
		}
		System.out.println("Posti pieni!");
	}
	public void estraiVeicolo(int pos) {
		posti[pos]=null;
	}
	
	public void stampaSituazionePosti() {
		for (int i = 0; i < posti.length; i++) {
			System.out.print((i+1)+")");
			if(posti[i]!=null) {
				System.out.println(posti[i].toString());
			}else {
				System.out.println();
			}
		}
	}
}
