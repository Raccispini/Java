package esercizio4;
import esercizio3.Car;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void stampaCar(ArrayList<Car> macchine) {
		System.out.println("N Carburante\tRendimento");
		for (int i = 0; i < macchine.size(); i++) {
			System.out.println((i+1)+")"+macchine.get(i).getGas()+"\t\t"+macchine.get(i).getRendimento());
		}
	}
	public static void stampaDis(ArrayList<DistributoreBenzina> dis) {
		System.out.println("N Carburante\tPrezzo");
		for (int i = 0; i < dis.size(); i++) {
			System.out.println((i+1)+")"+dis.get(i).getDeposito()+"\t\t"+dis.get(i).getPrezzo());
			
		}
	}
	public static void addCar(ArrayList<Car> c) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci il carburante iniziale: ");
		int carb = s.nextInt();
		System.out.println("Inserisci il rendimento dell'automobile: ");
		int rend = s.nextInt();
		c.add(new Car(rend,carb));
	}
	public static void addDist(ArrayList<DistributoreBenzina> dis) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci il deposito iniziale: ");
		double deposito = s.nextDouble();
		System.out.println("Inserisci il prezzo: ");
		dis.add(new DistributoreBenzina(s.nextDouble(),deposito));
	}
	public static void main(String[] args) {
		ArrayList<DistributoreBenzina> dis = new ArrayList<DistributoreBenzina>();
		ArrayList<Car> c = new ArrayList<Car>();
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1)Fai un viaggio");
			System.out.println("2)Rifornisci");
			System.out.println("3)Rifornisci distributori");
			System.out.println("4)Aggiungi automobile");
			System.out.println("5)Aggiungi distributre");
			System.out.println("0)Esci");
			n = s.nextInt();
			switch(n) {
			case 1:
				if(c.size()==0) {
					System.out.println("Aggiungi una macchina: ");
					addCar(c);
				}
				System.out.println("Inserisci la macchina che deve fare il viaggio");
				stampaCar(c);
				n = s.nextInt();
				System.out.println("Inserisci il percorso da fare: ");
				c.get(n-1).drive(s.nextDouble());
				break;
			case 2:
				if(dis.size()==0) {
					System.out.println("Aggiungi un distributore: ");
					addDist(dis);
				}
				System.out.println("Scegli il distributore dove rifornirti: ");
				stampaDis(dis);
				n = s.nextInt();
				stampaCar(c);
				System.out.println("Scegli la macchina da rifornire : ");
				int n2 = s.nextInt();
				System.out.println("Scegli euro di benzina inserire: ");
				if(dis.get(n-1).vendi(s.nextDouble(), c.get(n2-1))) {
					System.out.println("Rifornimento effettuato!!");
				}else {
					System.out.println("Rifornimento fallito, ricarica il distributore!!");
				}
				break;
			case 3:
				if(dis.size()==0) {
					System.out.println("Aggiungi un distributore : ");
					addDist(dis);
				}
				System.out.println("Inserisci il distributore da rifornire :");
				stampaDis(dis);
				n = s.nextInt();
				System.out.println("Inserisci la benzina da inserire: ");
				dis.get(n-1).rifornisci(s.nextDouble());
				break;
			case 4:
				addCar(c);
				break;
			case 5:
				addDist(dis);
				break;
			case 0: return;
			
				
			}
		}
	}
}
