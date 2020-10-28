package controcorrente;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int maxSportelli=10;
	public static int menu(TerminaleSportello[] terminali,int lastTerminal) throws IOException {
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Menu principale :");
		if(lastTerminal !=-1) {
			System.out.println("1)Accedi ad un terminale");
		}
		
		System.out.println("2)Crea un nuovo terminale");
		System.out.println("0)Esci");
		switch(s.nextInt()) {
		case 1:
			String us,pass;
			System.out.println("Inserisci Username: ");
			us = s.next();
			System.out.println("Inserisci la Password: ");
			pass = s.next();
			int i = 0;
			for(TerminaleSportello t : terminali) {
				if(t.autentica(us, pass))
					return i;
				i++;
			}
			System.out.println("Username o PassWord non corretti !!");
			break;
		case 2:if(lastTerminal < maxSportelli) {
			System.out.println("Inserisci il tuo username : ");
			us = s.next();
			System.out.println("Inserisci la tua password: ");
			pass = s.next();
			System.out.println("Inserisci il conto iniziale :");
			terminali[lastTerminal+1]= new TerminaleSportello(us,pass,Integer.parseInt(s.next()));
			return lastTerminal+1;
			}else {
				System.out.println("Numero di sportelli masimi raggiunto!!");
			}
			break;
		case 0:return -1;
		
		}	
		return lastTerminal;
		
	}
	public static void main(String[] args) throws IOException {
		int i=-1;
		TerminaleSportello[] t = new TerminaleSportello[maxSportelli];
		while(true) {
			i = menu(t,i);
			if(i==-1) {
				System.out.println("Esci");
				return;
			}
			t[i].menu();
		}
	}
}
