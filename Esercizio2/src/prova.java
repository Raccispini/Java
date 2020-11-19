import java.util.Scanner;

public class prova extends Stampa{
	@Override
	public void stampa(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {		
			Addizione a = new Addizione();
			Sottrazione s = new Sottrazione();
			Moltiplicazione m = new Moltiplicazione();
			Divisione d = new Divisione();
			Scanner scan = new Scanner(System.in);
			prova p = new prova();
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
			case 1: p.stampa(""+a.operazione(n1, n2));
					break;
			case 2: p.stampa(""+s.operazione(n1, n2));
					break;
			case 3: p.stampa(""+m.operazione(n1, n2));
					break;
			case 4: p.stampa(""+d.operazione(n1, n2));
					break;
		
		}
	}

	

}
