package esercizio6;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pila p = new Pila();
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Push");
			System.out.println("2)Pop");
			System.out.println("3)Stampa");
			System.out.println("0)Esci");
			n=s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Inserisci il numero da inserire: ");
				p.push(s.nextInt());
				break;
			case 2:
				System.out.println("Hai estratto il valore: "+p.pop());
				break;
			case 3:
				p.stampa();
				break;
			case 0:
				return;
			}
		}
	}
}
