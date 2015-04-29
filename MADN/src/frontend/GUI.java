package frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import backend.EventHandler;
import backend.Spiel;
import backend.Wuerfel;

import java.awt.event.*;

/** Die Klasse GUI
 * 
 *
 */

public class GUI extends JFrame {
	private JFrame jf = new JFrame("SPIEL");
	private EventHandler eh;
	private int spAnzahl; // spielerAnzahl die im Spinner gew�hlt wird
	private String spielerName;
//	private Spiel s;
	// private JLabel jl = new JLabel("");
	// private JSpinner spinner;
	// private boolean fehler;
	private String spielerFarbe;
	private String spielerArt;
//	private Wuerfel w;
	private iBediener bediener = new Spiel();
	
	/**
	 * Konstruktor GUI
	 */
	private JTextArea ta=new JTextArea(6,20);
	private JScrollPane scroller;

	public GUI() {
		super();
		eh = new EventHandler(this);
		//spielLadenAbfrage();
		spielfeldAnzeigen();
		jf.addWindowListener(new WindowAdapter(){ // fuer die Menue Knoepfe
			public void windowClosing (final WindowEvent e){
				System.exit(0);
			}
		});
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
//	/**
//	 * JOptionPane um abzufragen, ob altes Spiel geladen werden soll
//	 */
//
//	public void spielLadenAbfrage() {
//		int x = JOptionPane.showConfirmDialog(null,
//				"M�chtest du ein Spiel laden?", "Herzlich Willkommen bei MADN",
//				JOptionPane.YES_NO_OPTION);
//		if (x == JOptionPane.YES_OPTION) {
//			spielLaden();
//		}
//		if (x == JOptionPane.NO_OPTION) {
//			neuesSpielErstellenAbfrage();
//		}
//
//		;
//	}
//	/**
//	 *JOptionPAne um Abzufragen, ob neues Spiel erstellt werden soll
//	 */
//
//	public void neuesSpielErstellenAbfrage() {
//		int y = JOptionPane.showConfirmDialog(null,
//				"M�chtest du ein neues Spiel erstellen?",
//				"Herzlich Willkommen bei MADN", JOptionPane.YES_NO_OPTION);
//		if (y == JOptionPane.YES_OPTION) {
//			spielerErstellen();
//		}
//		if (y == JOptionPane.NO_OPTION) {
//			spielLadenAbfrage();
//
//		}
//	}
	
	/**
	 *JOptionPAne um Anzahl aller Spieler abzufragen
	 */

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
		button01.addActionListener(eh);
		spAnzahl = ((Number) spinner.getValue()).intValue();
		frame.setVisible(true);

	}
	/**
	 * 
	 * @return spAnzahl Anzahl aller Spieler
	 */
	public int getSpAnz(){
		return spAnzahl;
	}


	public void nameFarbeArtAbfrage() {

	/**
	 * JOptionPAne um Name, Farbe und Art des Spielers abzufragen
	 */

		JFrame frame02 = new JFrame("Spieler erstellen");
		frame02.setLayout(new GridLayout(2, 0));
		frame02.setSize(400, 210);
		frame02.setResizable(false);
		JLabel label02 = new JLabel(
				"Gebe deinen Spielernamen deine Farbe und die Art ein.");
		JPanel panel02 = new JPanel(new BorderLayout());
		JButton button02 = new JButton("Best�tigen");
		JTextField feld01 = new JTextField("Spielername");

		panel02.add(label02, BorderLayout.NORTH);
		label02.setLayout(new BorderLayout());
		panel02.add(button02, BorderLayout.SOUTH);
		button02.addActionListener(eh);

		panel02 = new JPanel();
		panel02.setLayout(new FlowLayout());
		panel02.add(feld01, BorderLayout.SOUTH);
		frame02.add(label02, BorderLayout.NORTH);
		frame02.add(panel02, BorderLayout.SOUTH);

		// RadioButtons f�r Farbe
		final JRadioButton RBRED = new JRadioButton("RED", true);
		final JRadioButton RBGREEN = new JRadioButton("GREEN");
		final JRadioButton RBBLUE = new JRadioButton("BLUE");
		final JRadioButton RBYELLOW = new JRadioButton("YELLOW");

		ButtonGroup group = new ButtonGroup();
		group.add(RBRED);
		group.add(RBGREEN);
		group.add(RBBLUE);
		group.add(RBYELLOW);

		panel02.add(RBRED);
		panel02.add(RBGREEN);
		panel02.add(RBBLUE);
		panel02.add(RBYELLOW);

		// RadioButtons f�r Art
		final JRadioButton Mensch = new JRadioButton("Mensch", true);
		final JRadioButton KIa = new JRadioButton("KI-Aggressiv");
		final JRadioButton KId = new JRadioButton("KI-Defensiv");

		ButtonGroup group2 = new ButtonGroup();
		group2.add(Mensch);
		group2.add(KIa);
		group2.add(KId);

		panel02.add(Mensch);
		panel02.add(KIa);
		panel02.add(KId);
		panel02.add(button02, BorderLayout.SOUTH);

		spielerName = feld01.getText(); // gibt den eingegebenen Spielernamen
										// aus

		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Radio Button Abfrage Farbe
				if (RBRED.isSelected() == true) {
					spielerFarbe = "RED";
				}
				if (RBGREEN.isSelected() == true) {
					spielerFarbe = "GREEN";
				}
				if (RBBLUE.isSelected() == true) {
					spielerFarbe = "BLUE";
				}
				if (RBYELLOW.isSelected() == true) {
					spielerFarbe = "YELLOW";
				}

				// Radio Button Abfrage Art
				if (Mensch.isSelected() == true) {
					spielerArt = null; // null, da mensch keine ki ist
				}
				if (KIa.isSelected() == true) {
					spielerArt = "AGGRESSIV";
				}
				if (KId.isSelected() == true) {
					spielerArt = "DFENSIV";
				}

				nameFarbeArtUebergeben(); // beim klick auf den button werden
											// die daten uebergeben

//				if (bediener.getA() == false) {
//					frame02.dispose();
//				} // schliesst den frame beim klick auf button
			}
		});

		frame02.setVisible(true);
	}

	/* ___________Methoden____________ */
	 /**
	  * oeffnet FileChooser, um altes Spiel aus Datei zu laden
	  */
	public void spielLaden() {
		 JFileChooser fc = new JFileChooser();
         fc.showOpenDialog(null);
	}

	/**
	 * erstellt neuen Spieler
	 */
	public void spielerErstellen() {

		anzahlSpielerDieSpielenWollenAbfrage();
	}

	// diese Methode wird fuer die alternative von
	// anzahlSpielerDieSpielenWollenAbfrage() ben�tigt
	
	/**
	 * Fehlermeldung wenn keine Spieleranzahl gewaehlt
	 */
	public void meldungWennKeineSpielerAnzGewaehlt() {
		JOptionPane
				.showMessageDialog(
						null,
						"Es wurde nicht gewaehlt, wie viel Spieler am Spiel teilnehmen.",
						"Herzlich Willkommen bei MADN",
						JOptionPane.PLAIN_MESSAGE);

	}
	/**
	 * speichert Name, Farbe und Art des Spielers
	 */

	public void nameFarbeArtUebergeben() {
		bediener.SpielerHinzufuegen(spielerName, spielerFarbe, spielerArt);

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
/**
 * oeffnet den Spiel-Frame
 */
	public void spielfeldAnzeigen() {

		JFrame hauptf = new JFrame("Spiel 'Mensch aergere dich nicht!'");
		JPanel hauptp = new JPanel(new BorderLayout());
		ImageIcon feld = new ImageIcon("Bilder//spielbrett.jpg");
		hauptf.setLocation(200, 50);
		hauptf.setMenuBar(this.getMenuOben()); // erstellt Menue oben


		hauptf.setSize(1250, 1000);
		JLabel hauptl = new JLabel(feld);

		JLabel wuerfelL = new JLabel();

		hauptf.add(wuerfelL);
		hauptf.add(wuerfelL, BorderLayout.WEST);

		if (bediener.wurf() == 1) {
			ImageIcon eins = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 2) {
			ImageIcon zwei = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 3) {
			ImageIcon drei = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 4) {
			ImageIcon vier = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 5) {
			ImageIcon f�nf = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 6) {
			ImageIcon sechs = new ImageIcon("Bilder//eins.jpg");
		}



		hauptf.add(hauptp);
		hauptf.add(hauptl, BorderLayout.CENTER);

		hauptf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hauptf.setVisible(true);
		hauptf.setResizable(false);
		
		  // LOGGER
		
	    JPanel logger=new JPanel();
	    logger.setLayout(new BorderLayout());
			ta.setFont(new Font("Arial", Font.PLAIN, 11));
			ta.setOpaque(true);
			ta.setEditable(false);
			scroller=new JScrollPane(ta);
			logger.add(new JLabel("Log-Fenster:"),BorderLayout.NORTH);
			logger.add(scroller,BorderLayout.CENTER);
			logger.setBounds(0,517,680,150);
			jf.getContentPane().add(logger);
			hauptf.add(logger,BorderLayout.SOUTH);
	}

	/**
	 * 
	 * @return menueLeiste, gibt die Menueleiste oben aus
	 */
	protected MenuBar getMenuOben() {
		MenuBar menueLeiste = new MenuBar();
		Menu spiel = new Menu("Spiel"); // erster Knopf
		MenuItem laden = new MenuItem("Spiel laden"); // Unterknopf 1
		spiel.add(laden);
		 laden.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	            	spielLaden();;
	            }
	        });
		MenuItem neu = new MenuItem("neues Spiel erstellen"); // Unterknopf 2		
		spiel.add(neu);
		 neu.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	            	anzahlSpielerDieSpielenWollenAbfrage();;
	            }
	        });
		MenuItem speichern = new MenuItem("als PDF speichern");
		spiel.add(speichern);
		menueLeiste.add(spiel);

		Menu hilfe = new Menu("Hilfe"); // zweiter Knopf
		menueLeiste.add(hilfe);

		return menueLeiste;
	}
}
