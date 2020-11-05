package esercizi5_11;

public class MainEs1 {
	public static void main(String[] args) {
		OggettoLanciato dado = new OggettoLanciato(6);
		OggettoLanciato moneta = new OggettoLanciato(2);
		
		System.out.println("Lancio della moneta...");
		System.out.print("E' uscito ");
		if(moneta.lancia()==2)
			System.out.println("testa");
		else
			System.out.println("croce");
		System.out.println();
		System.out.println("Lancio del dado...");
		System.out.println("E' uscito il numero "+dado.lancia());
		
	}
}
