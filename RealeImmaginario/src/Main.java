import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n;
		String string;
		System.out.println("Inserisci un numero: ");
		string = s.next();
		try {
			n = Double.parseDouble(string);
		}catch(Exception e) {
			System.out.print("Complesso : i");
			n = Double.parseDouble(string.substring(1));
			
		}
		System.out.println(n);
	}
}
