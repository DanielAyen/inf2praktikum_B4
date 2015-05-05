package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import backend.Spiel;
/**
 * Die Klasse EventHandler
 *
 */
public class EventHandler implements ActionListener {
	private GUI gui; // kenntnisbeziehung herstellen!!!
//	private iBediener bediener = new Spiel();

	
	/**
	 * 
	 * @param gui
	 */
	public EventHandler(GUI gui) {
		this.setGUI(gui);;
	}
/**
 * 
 * @param gui
 */
	private void setGUI(GUI gui) {
		this.gui = gui;

	}
/**
 * 
 */
	public void actionPerformed(ActionEvent ae) {
			switch (ae.getActionCommand()){
			case "OK":
				gui.log("Spieler erstellen: Spielerzahl waehlen");
				gui.setSpAnzahl(((Number) gui.spinner.getValue()).intValue());
				for (int i = 0; i < gui.getSpAnz(); i++) {
					gui.nameFarbeArtAbfrage();	
					}
				gui.log("gewaehlter Spielerzahl:" + gui.getSpAnz());
				gui.frame.dispose();
				break;
			case "Bestätigen":
				gui.setSpielerName(gui.feld01.getText());
				// Radio Button Abfrage Farbe
				if (gui.RBRED.isSelected() == true) {
					gui.setSpielerFarbe("RED");
				}
				if (gui.RBGREEN.isSelected() == true) {
					gui.setSpielerFarbe("GREEN");
				}
				if (gui.RBBLUE.isSelected() == true) {
					gui.setSpielerFarbe("BLUE");
				}
				if (gui.RBYELLOW.isSelected() == true) {
					gui.setSpielerFarbe("YELLOW");
				}

				// Radio Button Abfrage Art
				if (gui.Mensch.isSelected() == true) {
					gui.setSpielerArt(null);
				}
				if (gui.KIa.isSelected() == true) {
					gui.setSpielerArt("AGGRESSIV");
				}
				if (gui.KId.isSelected() == true) {
					gui.setSpielerArt("DEFENSIV");
				}
				gui.nameFarbeArtUebergeben();
				gui.frame02.dispose();
				gui.log("SpielerName: "+ gui.getSpielerName() + "SpielerFarbe:" + gui.getSpielerFarbe() + "SpielerArt:" + gui.getSpielerArt());
				break;
			case "Spiel laden":
				gui.spielLaden();
				break;
			case "neues Spiel erstellen":
				gui.anzahlSpielerDieSpielenWollenAbfrage(); break;
//			case "als PDF speichern" : ...... break;
//			case "Figur vor": ........break;
//			case "Werfeln" : ..... break;
//			case "Erste Fuellung" : ...... break;
			
				
			}
	}
}


