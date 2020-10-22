import java.util.*;

public class ArrayRandom {
	public int[] generaArray(int n) {
		Random r = new Random();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i]= r.nextInt(100);
		}
		return num;
	}
	public int sommaArray(int[] num) {
		int somma= 0;
		for(int n : num) {
			somma+=n;
		}
		return somma;
	}
	public void stampaArray(int[] array) {
		int offset = 0;
		for(int n : array) {
			System.out.print(n+"\t");
			if(offset%10==0 && offset!=0) 
				System.out.println();
			offset++;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayRandom a = new ArrayRandom();
		int[] n = new int[100];
		n= a.generaArray(100);
		int somma = a.sommaArray(n);
		System.out.println("Stampa array: ");
		a.stampaArray(n);
		System.out.println("La sua somma è di : "+ somma);
	}
}
