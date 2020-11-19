import java.util.ArrayList;

public class Istituzione {
	private ArrayList<Staff> istituzione = new ArrayList<Staff>();
	
	public void stampaIstituzione() {
		for (int i = 0; i < istituzione.size(); i++) {
			System.out.println("Staff #"+(i+1));
			istituzione.get(i).stampaStaff();
		}
	}
	public void addStaff(Staff s) {
		istituzione.add(s);
	}
	public void removeStaff(int i) {
		istituzione.remove(i);
	}
	
}
