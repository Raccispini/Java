package esercizio3;
import java.util.Scanner;

public class Car {
	private double rendimento;
	private double carburante;
	
	public Car(double rendimento,double carburante) {
		this.rendimento = rendimento;
		this.carburante = carburante;
	}
	public double getGas() {
		return carburante;
	}
	public void addGas(double gas) {
		carburante +=gas;
	}
	public void drive(double percorso) {
		if(percorso * rendimento <=carburante) {
			carburante -= percorso*rendimento;
		}else {
			System.out.println("Percorso troppo lungo , metti più carburante!!");
		}
	}
	public double getRendimento() {
		return rendimento;
	}
	public void menu() {
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			
			System.out.println("Menu: ");
			System.out.println("1)Fai rifornimento");
			System.out.println("2)Guida");
			System.out.println("3)Stampa carburante rimanente");
			System.out.println("0)Esci");
			n = s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Inserisci il carburante da rifornire in Litri:");
				addGas(s.nextDouble());
				break;
			case 2: 
				System.out.println("Inserisci la distanza da percorrere in Km: ");
				drive(s.nextDouble());
				break;
			case 3:
				System.out.println("Rimangono ancora "+getGas()+" litri di carburante");
				break;
			case 0:
				return;
			
			}
		}
	}
	public static void main(String[] args) {
		Car c = new Car(1,10) ;
		c.menu();
	}
}
