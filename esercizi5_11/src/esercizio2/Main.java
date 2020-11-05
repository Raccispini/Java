package esercizio2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void creaFigura(ArrayList<Figura> f) {
		Scanner s = new Scanner(System.in);
		int n;
		double n1,n2;
		
		System.out.println("Scegli la figura da creare: ");
		System.out.println("1)Rettangolo");
		System.out.println("2)Quadrato");
		System.out.println("3)Cerchio");
		
		System.out.println("4)Triangolo");
		System.out.println("5)Triangolo rettangolo");
		System.out.println("0)Niente");
		 n = s.nextInt();
		 switch(n) {
		 case 1:
			 System.out.println("Inserisci la base :");
			 n1 = s.nextDouble();
			 System.out.println("Inserisci l'altezza: ");
			 f.add(new Rettangolo(n1,s.nextDouble()));
			 break;
		 case 2:
			 System.out.println("Inserisci il lato : ");
			 f.add(new Quadrato(s.nextDouble()));
			 break;
		 case 3:
			 System.out.println("Inserisci il raggio: ");
			 f.add(new Cerchio(s.nextDouble()));
			 break;
		 case 4:
			 System.out.println("Inserisci la base :");
			 n1 = s.nextDouble();
			 System.out.println("Inserisci l'altezza: ");
			 f.add(new Triangolo(n1,s.nextDouble()));
			 break;
		 case 5:
			 System.out.println("Inserisci la base :");
			 n1 = s.nextDouble();
			 System.out.println("Inserisci l'altezza: ");
			 f.add(new TriangoloRettangolo(n1,s.nextDouble()));
			 break;
		 default:
				return;
		 }
	}
	public static void stampa(ArrayList<Figura> f) {
		for (int i = 0; i < f.size(); i++) {
			System.out.print((i+1)+")");
			f.get(i).visualizza();
		}
	}
	public static void elimina(ArrayList<Figura> f) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Inserisci il numero della figura da eliminare: ");
		n = s.nextInt();
		f.remove(n-1);
	}
	public static void main(String[] args) {
		ArrayList<Figura> figure = new ArrayList<Figura>();
		Scanner s = new Scanner(System.in);
		int scelta;
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Crea una figura");
			System.out.println("2)Stampa figure");
			System.out.println("3)Elimina figura");
			System.out.println("0)Esci");
			scelta=s.nextInt();
			switch(scelta) {
			case 1:
				creaFigura(figure);
				break;
			case 2:
				stampa(figure);
				break;
			case 3:
				elimina(figure);
				break;
			default:return;
			}
		}
	}
}
