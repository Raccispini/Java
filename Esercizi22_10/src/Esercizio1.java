
public class Esercizio1 {
	public void zigZag(int[] array) {
		for (int i = 0; i < array.length/2; i++) {
			System.out.print(array[i]+"\t");
			System.out.print(array[array.length-(i+1)]+"\t");
			
			
		}
	}
	public static void main(String[] args) {
		ArrayRandom a = new ArrayRandom();
		Esercizio1 e = new Esercizio1();
		int[] n = new int[10];
		n= a.generaArray(10);
		a.stampaArray(n);
		e.zigZag(n);
	}
}
