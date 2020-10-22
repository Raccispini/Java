import java.util.Scanner;

public class Esercizio3 {
	//da rivedere
	public int[] secondoArray() {
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[10];
		int c =0;
		System.out.println("Inserisci 10 numeri interi: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Inserisci il numero n°"+(i+1));
			array1[i]=input.nextInt();
			if(array1[i]>0)
				c++;
		}
		int[] array2 = new int[c];
		c=0;
		for (int j = 0; j < array1.length; j++) {
			if(array1[j]>0) {
				array2[c]=array1[j];
				c++;
			}
				
		}
		return array2;
	}
	public static void main(String[] args) {
		Esercizio3 e = new Esercizio3();
		ArrayRandom a = new ArrayRandom();
		int[] array = new int[10];
		array = e.secondoArray();
		a.stampaArray(array);
		
	}
}
