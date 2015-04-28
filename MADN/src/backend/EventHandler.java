package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import frontend.GUI;

public class EventHandler implements ActionListener {

	private GUI gui; //kenntnisbeziehung herstellen!!!
	
	public EventHandler(GUI gui){
		this.setGUI(gui);
	}
	

	private void setGUI(GUI gui) {
		this.gui = gui;
		
		
	}


	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == null) {

			gui.nameFarbeArtAbfrage();

		}

	}

}