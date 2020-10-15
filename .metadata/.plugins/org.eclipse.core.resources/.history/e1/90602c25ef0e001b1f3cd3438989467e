package mediaMultipliDiTre;
import java.util.Scanner;

public class MediaMultipliDiTre {
	public static void main(String[] args) {
		int n,n1,c;
		double media;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Quanti numeri vuoi inserire? ");
			n=in.nextInt();
			if(n<0) {
				System.out.println("Numero non valido!!");
			}
		}while(n<0);
		
		c=0;
		media=0;
		for (int i = 0; i <n; i++) {
			System.out.println("Inserisci un numero: ");
			n1= in.nextInt();
			if(n1%3==0) {
				media+=n1;
				c++;
			}
		}
		media/=c;
		System.out.println("La media dei numeri divisibili per 3 inseriti è : "+media);
		
	}
}
