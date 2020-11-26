package Esercizio3;
import java.awt.*;
//import java.swing.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestioneContatore g = new GestioneContatore(0);
		String[] options = {"Mostra", "Incrementa", "Decrementa", "Azzera"};
		
		while(true) {
			int n = JOptionPane.showOptionDialog(null,"Which colour do you like?","Choose a colour",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);			
			 switch(n) {
			 case 0:g.mostra();
			 		break;
			 case 1:g.aggiungi();
			 		break;
			 case 2: g.sottrai();
			 		break;
			 case 3:g.azzera();
			 		break;
			 case -1:
				 System.out.println("Chiudi");
				 return;
			 }
		}
	}

}
