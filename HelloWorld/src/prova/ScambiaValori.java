package prova;
import java.util.Scanner;
public class ScambiaValori {
	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci 2 numeri");
		a= input.nextInt();
		b= input.nextInt();
		
		//Swap
		int c = a;
		a=b;
		b= c;
		System.out.println("A = "+a+"  B= "+b);
	}
}
