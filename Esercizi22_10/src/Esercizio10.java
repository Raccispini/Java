import java.util.Scanner;

public class Esercizio10 {
	public int[] input() {
		Scanner s = new Scanner(System.in);
		char[] c = new char[10];
		System.out.println("Inserisci 10 caratteri :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Inserisci il carattere numero "+(i+1));
			c[i]=s.next().charAt(0);
		}
		return contaVocali(c);
	
		
	}
	public int[] contaVocali(char[] c) {
		int[] j = new int[5];
		for (int i = 0; i < c.length; i++) {
			switch(c[i]) {
			case 'a' :j[0]++;
			break;
			case 'e':j[1]++;
			break;
			case 'i' :j[2]++;
			break;
			case 'o':j[3]++;
			break;
			case 'u':j[4]++;
			break;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		Esercizio10 e = new Esercizio10();
		int[] vocali =e.input();
		System.out.println("Ci sono "+ vocali[0]+" A, "+ vocali[1]+ " E, "+vocali[2]+" I, "+vocali[3]+" O, "+vocali[4]+" U. ");
	}
}
