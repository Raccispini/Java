package controcorrente;
import java.io.IOException;
import java.util.Scanner;

public class TerminaleSportello {
	private String username;
	private String password;
	private ContoCorrente c;
	
	public TerminaleSportello(String username,String password,double initConto) {
		this.username=username;
		this.password=password;
		c = new ContoCorrente(initConto);
	}
	public TerminaleSportello() {
		this.username="admin";
		this.username="admin";
		c = new ContoCorrente(0);
	}
	public boolean autentica(String username,String password) {
		if(username.equals(this.username) && password.equals(this.password)){
			return true;
		}
		return false;
	}
	
	public void menu() {
		int n;
		
		while(true) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Menu: ");
			System.out.println("1)Preleva");
			System.out.println("2)Versa");
			System.out.println("3)Stampa info");
			System.out.println("0)Esci");
			
			n = s.nextInt();
			switch (n) {
			case 1:
				System.out.print("Inserisci la somma da prelevare :");
				c.preleva(s.nextDouble());
				break;
			case 2:
				System.out.print("Inserisci la somma da Versare: ");
				c.versa(s.nextDouble());
				break;
			case 3:
				System.out.println("Conto corrente n. : "+ c.id);
				System.out.println("Saldo attuale: "+c.getConto());
				break;
			case 0: return;
			}
		}
	}
}
