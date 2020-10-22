import java.util.Scanner;
import java.util.Random;
public class Esercizio9 {
	public void lanciaDadi(long n) {
		long[] numeri = new long[(int)n];
		
		for (int i = 0; i < n; i++) {
			numeri[i]=tira();
		}
		leggiArray(numeri);
	}
	public int tira() {
		Random r = new Random();
		return r.nextInt(6)+1;
	}
	public void leggiArray(long[] array) {
		double media = 0;
		long max = array[0];
		long min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			media += array[i];
			if(array[i]>max)
				max= array[i];
			if(array[i]<min)
				min=array[i];
		}
		media /= array.length;
		System.out.println("Media = "+media);
		System.out.println("Min = "+min+"\tMax = "+max);
	}
	public static void main(String[] args) {
		long n;
		Scanner s = new Scanner(System.in);
		Esercizio9 e = new Esercizio9();
		System.out.println("Inserisci il numero di tiri di dadi da fare : ");
		n= s.nextInt();
		
		e.lanciaDadi(n);
	}
}
