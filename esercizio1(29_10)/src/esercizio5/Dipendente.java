package esercizio5;

public class Dipendente {
	private String nome;
	private double stipendio;
	public static double incrementoSupervisor = 1;
	private boolean isSuperVisor=false;
	private int voto =0;
	
	public Dipendente() {
		this.nome="Default";
		this.stipendio = 10;
		this.isSuperVisor=false;
		this.voto=0;
	}
	public Dipendente(String nome,double stipendio) {
		this.nome=nome;
		this.stipendio=stipendio;
		this.isSuperVisor=false;
		this.voto=0;
	}
	
	
	public void aumento(double percentuale) {
		stipendio +=stipendio*percentuale;
	}
	
	public void makeSupervisor() {
		stipendio+=stipendio*incrementoSupervisor;
	}
	
	public void setVoto() {
		voto++;
	}
	public int getVoto() {
		return voto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
}
