package esercizio4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void aggiungiVeicolo(ArrayList<Garage> g,int n) {
		Scanner s = new Scanner(System.in);
		int scelta;
		int anno,cilindrata;
		String marca,tipoAlimentazione;
		System.out.println("Seleziona il tipo di veicolo da inserire: ");
		System.out.println("1)Automobile ");
		System.out.println("2)Furgone");
		System.out.println("3)Motocicletta");
		System.out.println("0)Niente");
		scelta = s.nextInt();
		if(scelta ==0) {
			return;
		}else {
			System.out.println("Inserisci la marca : ");
			marca = s.next();
			System.out.println("Inserisci la cilindrata: ");
			cilindrata = s.nextInt();
			System.out.println("Inserisci il tipo di alimentazione: ");
			tipoAlimentazione = s.next();
			System.out.println("Inserisci anno di immatricolazione: ");
			anno = s.nextInt();
		}
		switch(scelta) {
		case 1:
			System.out.println("Insetrisci il numerod i porte: ");
			g.get(n).immettiNuovoVeicolo(new Automobile(s.nextInt(),anno,marca,tipoAlimentazione,cilindrata));
			break;
		case 2:
			System.out.println("Inserisci la capacità di carico del furgone: ");
			g.get(n).immettiNuovoVeicolo(new Furgone(s.nextInt(),anno,marca,tipoAlimentazione,cilindrata));
			break;
		case 3:
			System.out.println("Inserisci il tipo di moto: ");
			String tipo = s.next();
			System.out.println("Insrisci il numerod i tempi del motore: ");
			g.get(n).immettiNuovoVeicolo(new Motocicletta(tipo,s.nextInt(),anno,marca,tipoAlimentazione,cilindrata));
			break;
		default : return;
			
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int scelta;
		ArrayList<Garage> g = new ArrayList<Garage>();
		
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Aggiungi garage");
			System.out.println("2)Aggiungi veicolo ad un garage");
			System.out.println("3)Rimuovi veicolo da un garage");
			System.out.println("4)Rimuovi garage");
			System.out.println("5)Stampa");
			System.out.println("0)Esci");
			scelta = s.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("Inserisci il numero di posti del nuovo garage: ");
				g.add(new Garage(s.nextInt()));
				break;
			case 2:
				System.out.println("Inserisci il garage dove vuoi mettere la macchina: ");
				aggiungiVeicolo(g,s.nextInt()-1);
				break;
			case 3:
				System.out.println("Inserisci il garage dal quale togliere il veicolo: ");
				int n = s.nextInt();
				System.out.println("Inserisci la posizione del veicolo da eliminare: ");
				g.get(n-1).estraiVeicolo(s.nextInt());
				break;
			case 4:
				System.out.println("Scegli il garage da eliminare: ");
				g.remove(s.nextInt());
				break;
			case 5:
				for (int i = 0; i < g.size(); i++) {
					System.out.println("Garage "+(i+1));
					g.get(i).stampaSituazionePosti();
				}
				break;
			default: return;
			}
		}
	}
}
