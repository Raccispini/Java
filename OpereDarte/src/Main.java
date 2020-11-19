
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collezione c = new Collezione("collezione1","Fermo");
		c.addOpera(new Quadro("nicolo","raccichini",100,20));
		c.addOpera(new Scultura("asd","fhh",82,23,111));
		c.stampaCollezione();
	}

}
