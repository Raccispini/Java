
public class Esercizio5 {
	public void doppioUnoDellAltro(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i]==(2*array[j])) {
					System.out.println("Doppio l'uno dell'altro!");
					return;
				}
			
			}
		}
		System.out.println("No!");
	}
	public static void main(String[] args) {
		Esercizio5 e = new Esercizio5();
		ArrayRandom a = new ArrayRandom();
		int[] array = a.generaArray(10);
		a.stampaArray(array);
		e.doppioUnoDellAltro(array);
	}
}
