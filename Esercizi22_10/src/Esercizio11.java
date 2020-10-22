import java.util.Scanner;

public class Esercizio11 {
	public boolean palindromo(String s) {
		boolean a = true;
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-(i+1))) {
				a=false;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		System.out.println("Inserisci una stringa: ");
		s=scanner.next();
		Esercizio11 e = new Esercizio11();
		if(e.palindromo(s))
			System.out.println("Palindromo!");
		else
			System.out.println("Non Palindromo :(");
	}
}
