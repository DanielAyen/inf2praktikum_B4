package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import frontend.GUI;

/**
 * Die Klasse EventHandler
 *
 */
public class EventHandler implements ActionListener {

	private GUI gui; // kenntnisbeziehung herstellen!!!
	
	/**
	 * 
	 * @param gui
	 */
	public EventHandler(GUI gui) {
		this.setGUI(gui);
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
				gui.spielerErstellen();
				break;
			case "Spiel laden":
				gui.spielLaden();
				break;
			case "neues Spiel erstellen":
				gui.anzahlSpielerDieSpielenWollenAbfrage(); break;
//			case "als PDF speichern" : 
				
			}
	}
}
