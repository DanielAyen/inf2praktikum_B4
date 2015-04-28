package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import frontend.GUI;
/**
 * Die Klasse EventHandler
 *
 */
public class EventHandler implements ActionListener {

	boolean wert=false;
	
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

		if (ae.getSource() == null) {

			gui.nameFarbeArtAbfrage();
			setBool(true);

		}

		for (int i = 0; i < gui.getSpAnz(); i++) {
			gui.nameFarbeArtAbfrage();
		} // oeffnet dann den neuen frame
	}
/**
 * 
 * @param b
 */
	private void setBool(boolean b) {
		wert=b;
	}
	/**
	 * 
	 * @return wert, gibt den boolschen Wert zurück 
	 */
	public boolean getBool(){
		return wert;
	}

}
