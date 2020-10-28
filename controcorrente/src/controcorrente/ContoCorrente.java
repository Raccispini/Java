package controcorrente;

public class ContoCorrente {
	private double saldo;
	public int id;
	public static double tasso=0.2;
	public static int lastContoCreated = 1000;
	
	public ContoCorrente(double conto) {
		this.saldo = conto;
		id = lastContoCreated;
		lastContoCreated++;
	}

	public double getConto() {
		return saldo;
	}
	
	public void setConto(double conto) {
		this.saldo = conto;
	}

	public int getId() {
		return id;
	}

	public void preleva(double n) {
		saldo -= n;
	}
	public void versa(double n) {
		saldo +=n;
	}
	public void maturaInteressi() {
		saldo += saldo * tasso;
	}
	
}
