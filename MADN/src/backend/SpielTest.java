package backend;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import frontend.iBediener;

/**
 * Klasse zum Spielstart
 * @author Judith, Michi,Tobi,Doerte
 *
 */

public class SpielTest {



	/**
	 * Main Methode 
	 * @param args
	 */
	public static void main(String[] args) {

		iBediener s = new Spiel ();
		s.SpielerHinzufuegen("Ki", "red", "aggressiv");
		s.SpielerHinzufuegen("Reiner", "Green",null);

		
		
//___________________________________________________________________________________

		GUI g = new GUI();
		
//	System.out.println(s.getSpieler());	
	}

}
