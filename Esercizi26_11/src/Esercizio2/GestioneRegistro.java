package Esercizio2;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class GestioneRegistro {
	private String nomeFile;
	private String token;
	public ArrayList<Studente> matrice = new ArrayList<Studente>();
	
	
	public GestioneRegistro(String nomeFile,String token) {
		this.nomeFile = nomeFile;
		this.token=token;
	}
	
	public void leggiFile() {
		ArrayList<String> righeFile = new ArrayList<String>();
		boolean a=true;
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
                	break;
                }

            }
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			
		}
		
		dividiFile(token,righeFile);
	}
	
	public void dividiFile(String token,ArrayList<String> righeFile) {

    	for (int i = 0; i < righeFile.size(); i++) {
    		System.out.println(i);
			StringTokenizer s = new StringTokenizer(righeFile.get(i),token);
			try {
				for (int j = 0; j <4; j++) {
					
					matrice.add(new Studente(s.nextToken(),s.nextToken(),Integer.parseInt(s.nextToken()),Integer.parseInt(s.nextToken())));
				}							
			}catch(NullPointerException e) {
				System.out.println("sos");
			}
			catch(NoSuchElementException e) {
				
			}
		}
    }
	
	
	public void salva(String token) {
		//Clear file
		/*
		File file = new File(nomeFile);
		if (file.exists() && file.isFile()) 
		  { 
		  file.delete(); 
		  } 
		
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		*/
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(nomeFile));
			for (int i = 0; i < matrice.size(); i++) {				
				write.append(matrice.get(i).toStringToken(token));
			}
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void visualizzaRegistro() {
		System.out.println("Nome\tCognome\tMatr.\tEta");
		for (int i = 0; i < matrice.size(); i++) {
			System.out.println(matrice.get(i).toString());
		}
	}
	public void addStudente(Studente s) {
		matrice.add(s);
	}
	public void setEta(int e,int pos) {
		matrice.get(pos).setAnno(e);
	}
}
