package positivoNegativo;
import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,prec;
		boolean flag = true;
		prec = 0;
		System.out.println("Scrivi quanti numeri vuoi e per smettere premi 0");
		do {
			n=input.nextInt();
			if(prec!=0) {
				if(n>0 && prec<0 ) {			
					System.out.println("OK");
					return;
				}			
			}
			if(n==0) {
				flag=false;
				
			}
			prec=n;
		}while(flag);
		System.out.println("NO");
	}
}
