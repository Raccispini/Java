package serieArmonica;
import java.util.Scanner;

public class SerieArmonica {
	public static void main(String[] args) {
		int m;
		int n;
		double serie = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero: ");
		n = in.nextInt();
		System.out.println("Inserisci il numero di iterazioni: ");
		m = in.nextInt();
		
		for (int i = 0; i < m; i++) {
			serie+=(double) 1/n;
		}
		System.out.println("La serie 1/"+ n+" all'iterazione m � uguale a : "+serie);
	}
}