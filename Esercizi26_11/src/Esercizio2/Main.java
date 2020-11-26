package Esercizio2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		GestioneRegistro reg;
		int n;
		String str;
		
		System.out.println("Inserisci il nome del file: ");
		str = s.next();
		System.out.println("Inserisci il token separatore: ");
		String token = s.next();
		reg = new GestioneRegistro(str,token);
		reg.leggiFile();
		
		
		while(true) {
			System.out.println("Menu:");
			System.out.println("1)Visualizza registro");
			System.out.println("2)Aggiungi studente");
			System.out.println("3)Modifica eta");
			System.out.println("4)Salva");
			System.out.println("0)Esci");
			
			n = s.nextInt();
			
			switch(n) {
			case 1: reg.visualizzaRegistro();
					break;
			case 2:System.out.println("Inserisci il nome dello studente: ");
					String a = s.next();
					System.out.println("Inserisci il cognome dello studente: ");
					String b = s.next();
					System.out.println("Inserisci il numero di matricola: ");
					int c = s.nextInt();
					System.out.println("Inserisci l'eta :");
					reg.addStudente(new Studente(a,b,c,s.nextInt()));
					break;
			case 3:	System.out.println("Inserisci il numero dello studente da modificare: ");
					int d = s.nextInt();
					System.out.println("Inserisci la nuova età: ");
					reg.setEta(s.nextInt(), d);
					break;
			case 4: reg.salva(token);
					break;
			case 0:return;
			
			}
		}
	}

}
