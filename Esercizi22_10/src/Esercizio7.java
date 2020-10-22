import java.util.Scanner;

public class Esercizio7 {
	public void tuttiUguali() {
		int[] n = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci 3 numeri: ");
		for (int i = 0; i < n.length; i++) {
			System.out.println("\n"+(i+1)+") ");
			n[i]=input.nextInt();
		}
		if(controllo(n)) {
			System.out.println("Tutti e 3 uguali!");
		}else {
			System.out.println("Almeno uno dei 3 è diverso!");
		}
	}
	public boolean controllo(int[] n) {
		boolean a = true;
		for (int i = 0; i < (n.length-1); i++) {
			if(n[i]!=n[i+1])
				a=false;
		}
		return a;
	}
	public static void main(String[] args) {
		Esercizio7 e = new Esercizio7();
		e.tuttiUguali();
	}
}
