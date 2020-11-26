
public class Main {
	public static void main(String[] args){
        LeggiFile div = new LeggiFile("D:\\Documenti\\Java\\Esercizi26_11\\src/prova.csv");
        div.leggiFile();
        //div.stampaFile();
        div.dividiFile(",");
        div.stampaMatrice();
    }
}
