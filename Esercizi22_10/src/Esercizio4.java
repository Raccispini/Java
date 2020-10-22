
public class Esercizio4 {
	public void treConsecutivi(int[] array) {
		int[] prec = new int[2];
		prec[0]=array[0];
		prec[1]=array[1];
		boolean flag = false;
		for (int i = 1; i < array.length; i++) {
			if(prec[0]==prec[1]&&prec[1]==array[i]) {
				System.out.println("Tre consecutivi");
				return;
			}
			prec[0]=prec[1];
			prec[1]=array[i];
		}
	}
	public static void main(String[] args) {
		ArrayRandom a = new ArrayRandom();
		Esercizio4 e = new Esercizio4();
		
		int[] array = {1,2,2,2,3,4,5,7,7,8};
		//array = a.generaArray(10);
		a.stampaArray(array);
		e.treConsecutivi(array);
		
	}
}
