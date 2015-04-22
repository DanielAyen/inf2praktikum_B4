package backend;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
private Spiel spiel;
	
	public GUI(){
	
		//JLabel test = new JLabel("test test");
		
		
		JLabel labelDialog = new JLabel ("Anzahl Spieler: Name, Farbe, Art: ");
		
		
//		JLabel labelDialog=new JLabel("Anzahl Spieler:/*"+spiel.getAnzahlSpieler()+*/
//		"Name, Farbe und Art:"+
//				//spiel.getSpieler()+ 
//		"\n null steht fuer Mensch");
		getContentPane().add(labelDialog);
		//getContentPane().add(test);
		pack();
	}
	
	

}
