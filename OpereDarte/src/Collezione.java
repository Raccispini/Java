import java.util.ArrayList;


public class Collezione {
	private String nome;
	private String luogo;
	private ArrayList<Operadarte> collezione;
	
	public Collezione(String nome, String luogo) {
		super();
		this.nome = nome;
		this.luogo = luogo;
		this.collezione = new ArrayList<Operadarte>();
	}
	
	public void addOpera(Operadarte a) {
		collezione.add(a);
	}
	public void removeOpera(int i) {
		collezione.remove(i);	
	}

	public void stampaOpera(int i) {
		collezione.get(i).stampa();
	}
	
	public void stampaCollezione() {
		for (int i = 0; i < collezione.size(); i++) {
			stampaOpera(i);
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	
	
	
}
