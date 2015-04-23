package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventHandler implements ActionListener {

	private JButton button01;
	private GUI gui;

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == this.button01) {

			gui.nameFarbeArtAbfrage();

		}

	}

}
