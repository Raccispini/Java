package tuttiPositivi;
import java.util.Scanner;

public class TuttiPositiviPari {
	public static void main(String[] args) {
		int n;
		int[] numbers;
		boolean flag=false;
		
		//Input
		System.out.println("Inserisci la quantit� di numeri che vuoi inserire: ");
		Scanner input = new Scanner(System.in);
		
		n= input.nextInt();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Inerisci un numero");
			numbers[i]= input.nextInt();
			if(numbers[i]%2!=0 || numbers[i]<0) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("NO");
			return;
		}
		System.out.println("Sono tutti pari e positivi!! ");
		
		
		
	}
}