import java.util.Scanner;

public class Lunghezze {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lenght=0;
		String s;
		
		do {
			System.out.println("Inserisci una stringa oppure non scrivere niente per smettere di inserire: ");
			s=in.nextLine();
			lenght+=s.length();
		}while(!s.equals(""));
		System.out.println("La lunghezza totale delle stringhe � di : "+lenght);
	}
}
