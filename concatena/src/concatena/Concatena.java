package concatena;
import java.util.Scanner;

public class Concatena {
	public String concatena(String s1, String s2) {
		return s1+"*"+s2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1,s2,s3;
		Concatena c = new Concatena();
		
		System.out.println("Inserisci la prima stringa: ");
		s1 = in.next();
		System.out.println("Inserisci la seconda stringa: ");
		s2 = in.next();
		System.out.println("Inserisci la terza stringa: ");
		s3 = in.next();
		
		String s;
		s=c.concatena(s1, s2);
		s=c.concatena(s, s3);
		System.out.println(s);
	}
}
