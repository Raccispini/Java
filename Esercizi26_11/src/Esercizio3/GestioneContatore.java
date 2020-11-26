package Esercizio3;

public class GestioneContatore {
	private int n;
	
	public GestioneContatore(int  n) {
		this.n = n;
	}
	
	public void aggiungi() {
		n++;
		System.out.println(n);
	}
	public void sottrai() {
		n--;
		System.out.println(n);
	}
	public void azzera() {
		n=0;
		System.out.println(n);
	}
	public void mostra() {
		System.out.println(n);
	}
	
}
