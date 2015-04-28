package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import frontend.GUI;

public class EventHandler implements ActionListener {

	boolean wert=false;
	
	private GUI gui; // kenntnisbeziehung herstellen!!!

	public EventHandler(GUI gui) {
		this.setGUI(gui);
	}

	private void setGUI(GUI gui) {
		this.gui = gui;

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == null) {

			gui.nameFarbeArtAbfrage();

		}

		for (int i = 0; i < gui.getSpAnz(); i++) {
			gui.nameFarbeArtAbfrage();
		} // oeffnet dann den neuen frame
	}

}
