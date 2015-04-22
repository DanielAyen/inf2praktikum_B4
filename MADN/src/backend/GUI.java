package backend;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class GUI extends JFrame {
	// private Spiel spiel;
	private JFrame jf;

	// private JLabel jl = new JLabel("");
	// private JSpinner spinner;

	public GUI(String titel) {
		super(titel); // Titel des Spiel-Frames
		spielLadenAbfrage();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf = new JFrame();
		// JPanel jp = new JPanel();
		// jp.add(jl);
		// jf.setContentPane(jp);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.pack(); jf.setVisible(true);
		// JLabel test = new JLabel("test test");

		// JLabel labelDialog = new JLabel ();
		// JOptionPane ersterDialog = new JOptionPane();

		// JOptionPane.showMessageDialog(null, "Anzahl Spieler und und und",
		// "erstes Dialogfenster", JOptionPane.INFORMATION_MESSAGE);

		// JLabel labelDialog=new
		// JLabel("Anzahl Spieler:/*"+spiel.getAnzahlSpieler()+*/
		// "Name, Farbe und Art:"+
		// //spiel.getSpieler()+
		// "\n null steht fuer Mensch");
		// getContentPane().add(labelDialog);
		// getContentPane().add(test);
		pack();
		this.setVisible(true);
	}

	/* __________________Abfragen______________________________ */

	public void spielLadenAbfrage() {
		int x = JOptionPane.showConfirmDialog(null,
				"Möchtest du ein Spiel laden?", "Herzlich Willkommen bei MADN",
				JOptionPane.YES_NO_OPTION);
		if (x == JOptionPane.YES_OPTION) {
			spielLaden();
		}
		if (x == JOptionPane.NO_OPTION) {
			neuesSpielErstellenAbfrage();

			// int x=JOptionPane.showConfirmDialog(null,
			// "Möchtest du ein Spiel laden?","Herzlich Willkommen bei MADN",
			// JOptionPane.YES_NO_OPTION );
		}

		;
	}

	public void neuesSpielErstellenAbfrage() {
		int y = JOptionPane.showConfirmDialog(null,
				"Möchtest du ein neues Spiel erstellen?",
				"Herzlich Willkommen bei MADN", JOptionPane.YES_NO_OPTION);
		if (y == JOptionPane.YES_OPTION) {
			spielerErstellen();
		}
		if (y == JOptionPane.NO_OPTION) {
			spielLadenAbfrage();

		}
	}

	public void anzahlSpielerDieSpielenWollenAbfrage() {

		/* alternative Loesung ueber JOptionPane */
		// Object[] options = { "1", "2", "3", "4" };
		// int x = JOptionPane.showOptionDialog(null,
		// "Wie viele Spieler sollen bei dem Spiel mitspielen? ",
		// "Spieler erstellen", JOptionPane.DEFAULT_OPTION,
		// JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		// switch (x) {
		// case 0: System.out.println("1 geklickt"); //case 0 wegen Array (index
		// 0)
		//
		// // speichern
		// break;
		// case 1:
		// break;
		// case 2:
		// break;
		// case 3:
		// break;
		// default: meldungWennKeineSpielerAnzGewaehlt();
		// break;
		
		////geht auch ohne switch case. x +1 = anz spieler
		
		// }
		// nameFarbeArtAbfrage();

		JFrame frame = new JFrame("Spieler erstellen");
		JLabel label = new JLabel("Anzahl Spieler: ");
		label.setSize(200,100);
		JPanel panel = new JPanel(new BorderLayout());
		JButton button = new JButton ("OK");

		SpinnerNumberModel anzahlSpielerAuswaehlen = new SpinnerNumberModel(2,
				1, 4, 1); // value, min, max, step
		JSpinner spinner = new JSpinner(anzahlSpielerAuswaehlen);

		panel.add(label, BorderLayout.WEST);
		panel.add(spinner, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.pack();

	}

	public void nameFarbeArtAbfrage() {

	}

	/* ___________Methoden____________ */
	public void spielLaden() {
		// J File Chooser
	}

	public void spielerErstellen() {

		anzahlSpielerDieSpielenWollenAbfrage();
		// name, farbe, art ---- JTextField, JRadioButton, JRadioButton
	}

	public void meldungWennKeineSpielerAnzGewaehlt() {
		JOptionPane
				.showMessageDialog(
						null,
						"Es wurde nicht gewaehlt, wie viel Spieler am Spiel teilnehmen.",
						"Herzlich Willkommen bei MADN",
						JOptionPane.PLAIN_MESSAGE);

	}

	// int x=JOptionPane.showConfirmDialog(null,
	// "Mit wie viel Spielern soll das Spiel gespielt werden?",
	// "Spieler erstellen")
	// farbe auswählen, name eingeben, mensch/ki, spieler anzahl

}
