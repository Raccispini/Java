package esercizio4;

import esercizio3.Car;
public class DistributoreBenzina {
	private double deposito;
	private double euroPerLitro;
	public DistributoreBenzina(double euroPerLitro,double deposito) {
		this.deposito=deposito;
		this.euroPerLitro=euroPerLitro;
	}
	public void rifornisci(double rifornimento) {
		deposito += rifornimento;
	}
	public boolean vendi(double euro,Car automobile) {
		if(deposito>euro*euroPerLitro) {
			automobile.addGas(euro*euroPerLitro);
			deposito-=euro*euroPerLitro;
			return true;
		}else {
			return false;
		}
	}
	public void aggiorna(double prezzoPerLitro) {
		euroPerLitro=prezzoPerLitro;
	}
	public double getDeposito() {
		return deposito;
	}
	public double getPrezzo() {
		return euroPerLitro;
	}
	
}
