import java.util.Scanner;

public class Esercizio6 {
	public void dueSequenze() {
		String[] sequenza1 = new String[5];
		String[] sequenza2 = new String[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di 5 stringhe: ");
		for (int i = 0; i < sequenza1.length; i++) {
			System.out.println("Stringa "+(i+1));
			sequenza1[i]=input.next();
		}
		
		System.out.println("Inserisci un'altra sequenza di 5 stringhe: ");
		for (int i = 0; i < sequenza2.length; i++) {
			System.out.println("Stringa "+(i+1));
			sequenza2[i]=input.next();
		}

		for (int i = 0; i < sequenza1.length; i++) {
			for (int j = 0; j < sequenza2.length; j++) {
				if(sequenza1[i].equals(sequenza2[j])) {
					System.out.println("Ok!");
					return;
				}
			}
		}
		System.out.println("No!");
	}
	public static void main(String[] args) {
		Esercizio6 e = new Esercizio6();
		e.dueSequenze();
	}
}
