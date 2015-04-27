package frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
	// private Spiel spiel;
	private JFrame jf = new JFrame("SPIEL");
	private int spAnzahl; //spielerAnzahl die im Spinner gewählt wird

	// private JLabel jl = new JLabel("");
	// private JSpinner spinner;

	public GUI() {
		super();
		spielLadenAbfrage();
		spielfeldAnzeigen();

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
		// pack();
		// this.setVisible(true);
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

		// //geht auch ohne switch case. x +1 = anz spieler

		// }
		// nameFarbeArtAbfrage();

		JFrame frame = new JFrame("Spieler erstellen");
		JLabel label = new JLabel(
				"Mit wie vielen Spielern soll das Spiel gespielt werden? ");
		frame.setSize(370, 100);
		frame.setResizable(false);
		JPanel panel = new JPanel(new BorderLayout());
		JButton button01 = new JButton("OK");
		// button01.setLayout(new FlowLayout());

		// button01.setPreferredSize(new Dimension(5,10));
		// button01.setSize(500, 30);
		// button01.setBounds(185, 75, 50, 20);

		SpinnerNumberModel anzahlSpielerAuswaehlen = new SpinnerNumberModel(2,
				1, 4, 1); // value, min, max, step
		JSpinner spinner = new JSpinner(anzahlSpielerAuswaehlen);

		panel.add(label, BorderLayout.WEST);
		panel.add(spinner, BorderLayout.EAST);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(button01, BorderLayout.SOUTH);

		button01.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				spAnzahl = ((Number) spinner.getValue()).intValue();
				for(int i=0;i<spAnzahl;i++){nameFarbeArtAbfrage();} // oeffnet dann den neuen frame
				frame.dispose(); // schliesst den frame beim klick auf OK button
			}
		});

		

		frame.setVisible(true);
	}

	public void nameFarbeArtAbfrage() {

		JFrame frame02 = new JFrame("Spieler erstellen");
		JLabel label02 = new JLabel(
				"Gebe deinen Spielernamen deine Farbe und die Art ein.");
		JPanel panel02 = new JPanel(new BorderLayout());
		frame02.setSize(400, 250);

		JButton button02 = new JButton("Bestätigen");
		JTextField feld01 = new JTextField("Spielername");
		frame02.setResizable(false);
		panel02.add(label02, BorderLayout.NORTH);
		label02.setLayout(new BorderLayout());
		panel02.add(button02, BorderLayout.SOUTH);
		frame02.add(panel02, BorderLayout.CENTER);
		button02.addActionListener(this);
		frame02.setLayout(new GridLayout(3, 1));
		panel02 = new JPanel();
		panel02.setLayout(new FlowLayout());
		panel02.add(feld01, BorderLayout.SOUTH);
		frame02.add(label02, BorderLayout.NORTH);
		frame02.add(panel02, BorderLayout.SOUTH);
//RadioButtons für Farbe
		final JRadioButton RBRED = new JRadioButton("RED", true);
		final JRadioButton RBGREEN = new JRadioButton("GREEN");
		final JRadioButton RBBLUE = new JRadioButton("BLUE");
		final JRadioButton RBYELLOW = new JRadioButton("YELLOW");

		RBRED.setMnemonic(KeyEvent.VK_R);
		RBGREEN.setMnemonic(KeyEvent.VK_G);
		RBBLUE.setMnemonic(KeyEvent.VK_B);
		RBYELLOW.setMnemonic(KeyEvent.VK_Y);

		ButtonGroup group = new ButtonGroup();
		group.add(RBRED);
		group.add(RBGREEN);
		group.add(RBBLUE);
		group.add(RBYELLOW);

		panel02.add(RBRED);
		panel02.add(RBGREEN);
		panel02.add(RBBLUE);
		panel02.add(RBYELLOW);
		panel02.add(button02, BorderLayout.SOUTH);
		frame02.setVisible(true);
//RadioButtons für Art
		final JRadioButton Mensch = new JRadioButton("Mensch", true);
		final JRadioButton KIa = new JRadioButton("KI-Aggressiv");
		final JRadioButton KId = new JRadioButton("KI-Defensiv");
		
		ButtonGroup group2 = new ButtonGroup();
		group.add(Mensch);
		group.add(KIa);
		group.add(KId);
		
		panel02.add(Mensch);
		panel02.add(KIa);
		panel02.add(KId);
		
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



	// Textfeld eingabe lesen

	// public void jButton1_ActionEvents()
	// public void button02_ActionEvents()
	// {
	// String a = feld01.getText();
	// String b = feld02.getText();
	//
	// }
	//
	// public void jButton2_ActionEvents(){
	//
	// int a= ((Number)spinner.getValue()).intValue();
	// }

	public void spielfeldAnzeigen() {

		JFrame hauptf = new JFrame("Spiel");
		JPanel hauptp = new JPanel(new BorderLayout());
		ImageIcon feld = new ImageIcon(
				"Bilder//spielbrett.jpg");
		hauptf.setSize(1250, 1000);
		JLabel hauptl = new JLabel(feld);
		hauptf.add(hauptp);
		hauptf.add(hauptl, BorderLayout.CENTER);
		hauptf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//("Bilder//spielbrett.jpg")C:\\Users\\maddo_000\\Desktop\\spielbrett.jpg
		hauptf.setVisible(true);
		hauptf.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
