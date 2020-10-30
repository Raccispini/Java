package esercizio7;

public class Libreria {
	private Libro[] l;
	
	public Libreria(Libro[] l) {
		this.l=l;
	}
	public int trova(String autore,int k) {
		int c = 0;
		for (int i = 0; i < l.length; i++) {
			if(l[i].getAutore().equals(autore) && l[i].getPrezzo()>k) {
				c++;
			}
		}
		return c;
	}
}
