import java.util.ArrayList;

public class Staff {
	private ArrayList<Persona> staff = new ArrayList<Persona>();
	
	public void stampaStaff() {
		for (int i = 0; i <staff.size(); i++) {
			System.out.println(staff.get(i).toString());
		}
	}
	public void addPersonale(Persona a) {
		staff.add(a);
	}
	public void removePersonale(int i) {
		staff.remove(i);
	}
}
