package ripeti;
import java.util.Scanner;

public class Ripeti {
	
	public void ripeti(String s,int n) {
		if(n<=0) {
			System.out.println("ERRORE:numero negativo");
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String s;
		Ripeti r = new Ripeti();
		
		
		System.out.println("Inserisci la stringa da ripetere: ");
		s = input.next();
		System.out.println("Inserisci quante volte vuoi ripetere la stringa: ");
		n = input.nextInt();
		r.ripeti(s,n);
	}
	
}
