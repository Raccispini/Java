import java.util.Scanner;

public class Main {
	public static void main() {
		Addizione a = new Addizione();
		Sottrazione s = new Sottrazione();
		Moltiplicazione m = new Moltiplicazione();
		Divisione d = new Divisione();
		Scanner scan = new Scanner(System.in);
		double n1;
		double n2;
		int n;
		
		System.out.println("Inserisci il primo numero: ");
		n1= scan.nextDouble();
		System.out.println("Inserisci il secondo numero: ");
		n2 = scan.nextDouble();
		System.out.println("Scegli l'operazione da eseguire: ");
		System.out.println("1)Addizione");
		System.out.println("2)Sottrazione");
		System.out.println("3)Moltiplicazione");
		System.out.println("4)Divisione");
		
		n = scan.nextInt();
		
		switch(n) {
		case 1: System.out.println(a.operazione(n1, n2));
				break;
		case 2: System.out.println(s.operazione(n1, n2));
				break;
		case 3: System.out.println(m.operazione(n1, n2));
				break;
		case 4: System.out.println(d.operazione(n1, n2));
				break;
		}
			
			
		
		
	}
}
