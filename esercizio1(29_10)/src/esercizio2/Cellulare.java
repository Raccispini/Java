package esercizio2;
import java.util.Scanner;

public class Cellulare {
	public static double costoOperatore = 0.2;
	private int numeroChiamate;
	private double creditoResiduo;
	
	public Cellulare(double creditoIniziale) {
		this.numeroChiamate=0;
		this.creditoResiduo=creditoIniziale;
	}
	public void ricarica(double importo) {
		creditoResiduo+=importo;
	}
	public void chiama(int minutiChiamata) {
		numeroChiamate++;
		creditoResiduo -= minutiChiamata*costoOperatore;
	}
	public double numero404() {
		return creditoResiduo;
	}
	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	public void azzeraChiamate() {
		numeroChiamate=0;
	}
	public void menu() {
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Chiama un numero ");
			System.out.println("2)Fai una ricarica ");
			System.out.println("3)Credito residuo");
			System.out.println("4)Numero chiamate");
			System.out.println("5)Azzera numero delle chiamate");
			System.out.println("0)Esci");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Inserisci il numero di minuti della chiamata :");
				chiama(s.nextInt());
				break;
			case 2:
				System.out.println("Inserisci l'importo da ricaricare : ");
				ricarica(s.nextInt());
				break;
			case 3:
				System.out.println("Il tuo credito residuo è di : " + numero404());
				break;
			case 4:
				System.out.println("Il tuo numero di chiamate fatte è di : "+ getNumeroChiamate());
				break;
			case 5:
				azzeraChiamate();
				System.out.println("Chiamate azzerate!");
				break;
			case 0:return;
			}
		}
	}
	public static void main(String[] args) {
		Cellulare c = new Cellulare(100);
		c.menu();
	}
	
}
