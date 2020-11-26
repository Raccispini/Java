package Esercizio2;

public class Studente {
	private String nome;
	private String cognome;
	private int matricola;
	private int anno;
	
	public Studente(String nome, String cognome, int matricola, int anno) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.anno = anno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String toString() {
		return nome+"\t"+cognome+"\t"+matricola+"\t"+anno;
	}
	public String toStringToken(String token) {
		return nome+token+cognome+token+matricola+token+anno+"\n";
	}
	
}
