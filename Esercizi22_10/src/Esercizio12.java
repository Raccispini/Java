import java.util.Scanner;

public class Esercizio12 {
	public int[] bubbleSort(int[] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if(n[i]<n[j]) {
					//Swap
					int a = n[j];
					n[j]=n[i];
					n[i]=a;
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		ArrayRandom a = new ArrayRandom();
		Esercizio12 e = new Esercizio12();
		int[] array = a.generaArray(10);
		a.stampaArray(array);
		e.bubbleSort(array);
		a.stampaArray(array);
	}
}
