package esercizio1;

public class Main {
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo();
		Rettangolo r2 = new Rettangolo(20,10,12,2);
		System.out.println("Area rettangolo 1 : "+ r.getArea()+"  Perimetro rettangolo 1: "+r.getPerimetro());
		System.out.println("Area rettangolo 2 : "+ r2.getArea()+"  Perimetro rettangolo 2: "+ r2.getPerimetro());
	}
}
