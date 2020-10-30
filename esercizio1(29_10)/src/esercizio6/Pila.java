package esercizio6;

public class Pila {
	private int max = 5;
	private int[] pila = new int[max];
	
	public Pila() {
		for (int i = 0; i < pila.length; i++) {
			pila[i]=0;
		}
	}
	
	public void push(int n) {
		for (int i = pila.length-1; i >=0; i--) {
			if(pila[i]==0) {
				pila[i]=n;
				return;
			}
		}
	}
	public int pop() {
		for (int i = pila.length-1; i >=0; i--) {
			if(pila[i]==0) {
				int a = pila[i+1];
				pila[i+1]=0;
				return a;
			}
		}
		return 0;
	}
	public void stampa() {
		for (int i = 0; i < pila.length; i++) {
			System.out.println(pila[i]);
		}
	}
}
