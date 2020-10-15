package soloVocali;
import java.util.Scanner;

public class soloVocali {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		
		System.out.println("Inserisci una stringa: ");
		s= in.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'a': System.out.print(s.charAt(i));
						break;
			case 'e':System.out.print(s.charAt(i));
						break;
			case 'i':System.out.print(s.charAt(i));
						break;
			case 'o':System.out.print(s.charAt(i));
						break;
			case 'u':System.out.print(s.charAt(i));
						break;
			}
		}
		
	}
}
