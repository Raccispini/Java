package quaCubo;
import java.util.Scanner;

public class Quacubo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Inserisci un numero: ");
		n = s.nextInt();
		
		Quadrato q = new Quadrato();
		Numero num = new Numero();
		Cubo c = new Cubo();
		
		System.out.println(num.ritorno(n));
		System.out.println(q.ritorno(n));
		System.out.println(c.ritorno(n));
		
	}
}
