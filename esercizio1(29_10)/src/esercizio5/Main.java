package esercizio5;
import java.util.ArrayList;
import java.util.Scanner;


import java.util.Random;
public class Main {
	public static void riempiVelocemente(ArrayList<Dipendente> d,int n) {
		for (int i = 0; i < n; i++) {
			d.add(new Dipendente());
		}
	}
	public static void riempi(ArrayList<Dipendente> d,int n) {
		Scanner s = new Scanner(System.in);
		String nome;
		double stipendio;
		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci il nome del dipentendente "+(i+1));
			nome = s.next();
			System.out.println("Inserisci lo stipendio del dipendente "+(i+1));
			stipendio = s.nextDouble();
			d.add(new Dipendente(nome,stipendio));
		}
	}
	public static void votazione(ArrayList<Dipendente> d) {
		Random r = new Random();
		int n=0;
		for (int i = 0; i < d.size(); i++) {
			n=r.nextInt(d.size());
			System.out.println(n);
			d.get(n).setVoto();
		}
		int max=0;
		for (int i = 0; i <d.size(); i++) {
			if(d.get(i).getVoto()>d.get(max).getVoto())
				max=i;
		}
		System.out.println("Il dipendente "+(max+1)+" è diventato Supervisor!");
		d.get(max).makeSupervisor();
	}
	public static void stampa(ArrayList<Dipendente> d) {
		System.out.println("ID\tNome\tStipendio");
		for (int i = 0; i < d.size(); i++) {
			System.out.println((i+1)+"\t"+d.get(i).getNome()+"\t"+d.get(i).getStipendio());
		}
	}
	public static void main(String[] args) {
		ArrayList<Dipendente> dipendenti = new ArrayList<Dipendente>();
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Stampa dipendenti");
			System.out.println("2)Assumi velocemente");
			System.out.println("3)Assumi normalmente");
			System.out.println("4)Votazione");
			System.out.println("0)Esci");
			n=s.nextInt();
			switch(n) {
			case 1:
				if(dipendenti.size()==0) {
					System.out.println("Riempimento veloce: ");
					System.out.println("Inserisci il numerod di dipendenti da assumenre: ");
					riempiVelocemente(dipendenti,s.nextInt());
					stampa(dipendenti);
				}else {
					stampa(dipendenti);
				}
				break;
			case 2:
				System.out.println("Inserisci il numero di dipendenti da assumere: ");
				riempiVelocemente(dipendenti,s.nextInt());
				break;
			case 3:
				System.out.println("Inserisci il numero di dipendenti da assumere: ");
				riempi(dipendenti,s.nextInt());
				break;
			case 4:
				votazione(dipendenti);
				break;
			case 0:
				return;
			}
		}
	}
}
