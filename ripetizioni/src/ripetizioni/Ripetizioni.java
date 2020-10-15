package ripetizioni;
import java.util.Scanner;

public class Ripetizioni {
	public static void main(String[] args) {
		int n;
		String c;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il numero di caratteri da inserire");
			n= in.nextInt();
			for (int j = 0; j < n; j++) {
				c= in.next();
				System.out.println(c);
			}
		}
	}
}
