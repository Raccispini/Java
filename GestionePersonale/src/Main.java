
public class Main {

	public static void main(String[] args) {
		Staff s = new Staff();
		s.addPersonale(new Giornaliero("Peppino","Impastato","333-333333","ajsbfiesbgifj",100,20));
		s.addPersonale(new Impiegato("Robespierre","via dalle palle","332-3333333","sfueiejorbibf",500,2));
		s.addPersonale(new Volontario("Scemo","Coglione","666-6666666"));
		
		Staff s2 = new Staff();
		s2.addPersonale(new Giornaliero("qwereqw","gggggggg","333-332333","fefefefefefef",2222,1));
		s2.addPersonale(new Impiegato("dddee","via wwww palle","332-33333323","sfuedwwiejbibf",520,2));
		s2.addPersonale(new Volontario("Scemo1","Coglione1","666-6666666"));
		Istituzione ist = new Istituzione();
		ist.addStaff(s);
		ist.addStaff(s2);
		ist.stampaIstituzione();
	}

}
