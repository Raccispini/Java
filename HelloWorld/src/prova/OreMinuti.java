package prova;
import java.util.Scanner;

public class OreMinuti {
	public static void main(String[] args) {
		double ore;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il tempo in ore: ");
		
		ore = in.nextDouble();
		
		int minuti = (int)(ore*60);
		
		System.out.println("Il tempo in minuti � "+minuti);
		
	}
}
