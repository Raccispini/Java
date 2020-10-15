package continuaFino;
import java.util.Scanner;

public class ContinuaFino {
	public static void main(String[] args) {
		boolean flag = true;
		int n;
		int somma=0;
		System.out.println("Inserisci numeri finchè non inserisci un numero negativo divisibile per due oppure positivio divisibile per 3");
		Scanner input = new Scanner(System.in);
		do {
			n= input.nextInt();
			if(n<0 && n%2==0 || n>0 && n%3==0)
				flag=false;
			else
				somma+=n;
		}while(flag);
		
		System.out.println("Somma = "+somma);
	}
}
