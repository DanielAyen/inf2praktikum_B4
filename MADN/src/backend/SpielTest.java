package backend;

import javax.swing.JFrame;

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
//		s.SpielerHinzufuegen("Ki2", "Blue", "defensiv");
//		s.SpielerHinzufuegen("Rosa", "red",null);
//		s.SpielerHinzufuegen("Helmut", "blue",null);
		s.SpielerHinzufuegen("Reiner", "Green",null);
//		s.SpielerHinzufuegen("Ole", "Yellow",null);
//		s.initSpiel();
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehren(1);
//		s.zugDurchfuehrenSchmeissenTest(1);
//		s.zugDurchfuehrenEndfeldTest(1);
		
		
		
	  //s.initTestSpiel();
		
//		s.initTestSpielZugDefensiv();
//		s.initTestSpielZugAggressiv();

		//s.Speichern("csv");
		
		
		
		//___________________________________________________________________________________
		
		GUI g=new GUI();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		
	System.out.println(s.getSpieler());	
	}

}
