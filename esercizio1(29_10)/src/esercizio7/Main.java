package esercizio7;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Libro[] l = new Libro[6];
		String nome;
		String autore;
		double prezzo;
		Scanner s = new Scanner(System.in);
		
		//Init
		for (int i = 0; i < l.length; i++) {
			System.out.println("Inserisci il nome del libro "+(i+1));
			nome = s.next();
			System.out.println("Inserisci il nome dell'autore del libro "+(i+1));
			autore = s.next();
			System.out.println("Inserisci il prezzo del libro "+(i+1));
			prezzo = s.nextDouble();
			l[i]=new Libro(nome,autore,prezzo);
		}
		
		Libreria lib = new Libreria(l);
		int n ;
		while(true) {
			System.out.println("Inserisci un qualsiasi numero per continuare");
			n = s.nextInt();
			if(n==0) {
				return;
			}
			String str;
			System.out.println("Inserisci l'autore da cercare: ");
			str=s.next();
			System.out.println("Inserisci il prezzo minimo del libro: ");
			n=s.nextInt();
			System.out.println("Sono stati trovti "+lib.trova(str, n)+" libri");
			
		}
	}
}
