package prova;
import java.util.Scanner;


public class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi : ");
		
		int n1,n2;
		
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		System.out.print("Somma : ");
		System.out.println(n1+n2);
	}
}
