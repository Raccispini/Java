import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class LeggiFile {
	public String nomeFile;
    private ArrayList<String> righeFile = new ArrayList<String>();
    private ArrayList<String>[] matrice = new ArrayList[4];

    public LeggiFile(String nomeFile){
        this.nomeFile = nomeFile;
    }

    public void leggiFile(){
        boolean a = true;
        try {
            BufferedReader read = new BufferedReader(new FileReader(nomeFile));
            while(a){
                try{
                    String s = read.readLine();
                    if(s.equals(null))
                    	break;
                    //System.out.println(s);
                    righeFile.add(s);
                }
                catch(IOException e){
                    a=false;
                }
                catch(NullPointerException e) {               	
                	return;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Errore lettura!!");
            e.printStackTrace();
        } catch (IOException e) {
        	System.out.println("Errore Lettura!!");
            e.printStackTrace();
        }
    }

    public void stampaFile(){
        for (int i = 0; i< righeFile.size();i++){
            System.out.println(righeFile.get(i));
        }
    }
    
    public void dividiFile(String token) {
    	//Inizializzazione matrice
    	for (int i = 0; i <4; i++) {
			matrice[i]= new ArrayList<String>();
		}
    	
    	
    	for (int i = 0; i < righeFile.size(); i++) {
			StringTokenizer s = new StringTokenizer(righeFile.get(i),",");
			try {
				for (int j = 0; j <4; j++) {
					matrice[j].add(s.nextToken());				
				}							
			}catch(NullPointerException e) {
				System.out.println("sos");
			}
		}
    }
    public void stampaMatrice() {
    	System.out.println("Nome\t\tTipologia\t\tCittà\t\tN.Employees");
    	for (int i = 0; i <= matrice.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrice[j].get(i)+"\t\t");
			}
			System.out.println();
		}
    }
}
