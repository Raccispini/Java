
public class Esercizio2 {
	public void sommaPariDispari(int[] array) {
		int sommaPari=0;
		int sommaDispari=0;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0)
				sommaPari+=array[i];
			else
				sommaDispari+=array[i];
		}
		if(sommaPari==sommaDispari)
			System.out.println("Pari e Dispari uguali!");
		else
			System.out.println("Pari e Dispari diversi!");
	}
	public static void main(String[] args) {
		ArrayRandom a = new ArrayRandom();
		Esercizio2 e = new Esercizio2();
		
		int[] array = new int[10];
		array = a.generaArray(10);
		a.stampaArray(array);
		e.sommaPariDispari(array);
	}
}
