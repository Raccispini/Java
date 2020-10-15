package fattoriale;
import java.util.Scanner;

public class Fattoriale {
	public static void main(String[] args) {
		int fatt_int=1;
		long fatt_long=1;
		double fatt_double=1;
		
		int n,n1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero da fattorializzare: ");
		n=in.nextInt();
	
		for (int i = 0; i < n; i++) {
			n1=n-i;
			fatt_int *= n1;
			fatt_long *= n1;
			fatt_double *= n1;
		}
		System.out.println("Fattoriale intero: "+fatt_int);
		System.out.println("Fattoriale Double: "+ fatt_double);
		System.out.println("Fattoriale Long: "+fatt_long);
	}
}
