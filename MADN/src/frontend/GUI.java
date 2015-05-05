package frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
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

import backend.Spiel;
import backend.Wuerfel;

import java.awt.event.*;
import java.awt.geom.Ellipse2D;

/**
 * Die Klasse GUI
 * 
 *
 */

public class GUI extends JFrame {
	JTextField feld01;
	JSpinner spinner;
	JRadioButton RBRED;
	JRadioButton RBGREEN;
	JRadioButton RBBLUE;
	JRadioButton RBYELLOW;
	JRadioButton Mensch;
	JRadioButton KIa;
	JRadioButton KId;
	JFrame frame;
	private JFrame jf = new JFrame("SPIEL");
	private EventHandler eh;
	private int spAnzahl; // spielerAnzahl die im Spinner gewählt wird
	private String spielerName;
	// private Spiel s;
	// private JLabel jl = new JLabel("");
	// private JSpinner spinner;
	// private boolean fehler;
	private String spielerFarbe;
	private String spielerArt;
	// private Wuerfel w;
	private iBediener bediener = new Spiel();
	JFrame hauptf = new JFrame("Spiel 'Mensch aergere dich nicht!'");
	JPanel hauptp = new JPanel(new BorderLayout());
	JButton[] buttonArray = new JButton[72];
	private JTextArea ta = new JTextArea(10, 20);// fuer die Loggerfeld groesse
	private JScrollPane scroller;
	private boolean hatGewuerfelt;
	
	/**
	 * Konstruktor GUI
	 */
	public GUI() {
		super();
		eh = new EventHandler(this);
		// spielLadenAbfrage();
		spielfeldAnzeigen();
		jf.addWindowListener(new WindowAdapter() { // fuer die Menue Knoepfe
			public void windowClosing(final WindowEvent e) {
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
	// /**
	// * JOptionPane um abzufragen, ob altes Spiel geladen werden soll
	// */
	//
	// public void spielLadenAbfrage() {
	// int x = JOptionPane.showConfirmDialog(null,
	// "Möchtest du ein Spiel laden?", "Herzlich Willkommen bei MADN",
	// JOptionPane.YES_NO_OPTION);
	// if (x == JOptionPane.YES_OPTION) {
	// spielLaden();
	// }
	// if (x == JOptionPane.NO_OPTION) {
	// neuesSpielErstellenAbfrage();
	// }
	//
	// ;
	// }
	// /**
	// *JOptionPAne um Abzufragen, ob neues Spiel erstellt werden soll
	// */
	//
	// public void neuesSpielErstellenAbfrage() {
	// int y = JOptionPane.showConfirmDialog(null,
	// "Möchtest du ein neues Spiel erstellen?",
	// "Herzlich Willkommen bei MADN", JOptionPane.YES_NO_OPTION);
	// if (y == JOptionPane.YES_OPTION) {
	// spielerErstellen();
	// }
	// if (y == JOptionPane.NO_OPTION) {
	// spielLadenAbfrage();
	//
	// }
	// }

	/**
	 * JOptionPAne um Anzahl aller Spieler abzufragen
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

		frame = new JFrame("Spieler erstellen");
		JLabel label = new JLabel(
				"Mit wie vielen Spielern soll das Spiel gespielt werden? ");
		frame.setSize(370, 100);
		frame.setResizable(false);
		JPanel panel = new JPanel(new BorderLayout());
		JButton button01 = new JButton("OK");

//		log("Spieler erstellen: Spielerzahl waehlen");
		// button01.setLayout(new FlowLayout());

		// button01.setPreferredSize(new Dimension(5,10));
		// button01.setSize(500, 30);
		// button01.setBounds(185, 75, 50, 20);

		SpinnerNumberModel anzahlSpielerAuswaehlen = new SpinnerNumberModel(2,
				1, 4, 1); // value, min, max, step
		spinner = new JSpinner(anzahlSpielerAuswaehlen);
		panel.add(label, BorderLayout.WEST);
		panel.add(spinner, BorderLayout.EAST);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(button01, BorderLayout.SOUTH);
		button01.addActionListener(eh);
		frame.setVisible(true);
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
		JButton button02 = new JButton("Bestätigen");
		feld01 = new JTextField("Spielername");

		panel02.add(label02, BorderLayout.NORTH);
		label02.setLayout(new BorderLayout());
		panel02.add(button02, BorderLayout.SOUTH);
		button02.addActionListener(eh);

		panel02 = new JPanel();
		panel02.setLayout(new FlowLayout());
		panel02.add(feld01, BorderLayout.SOUTH);
		frame02.add(label02, BorderLayout.NORTH);
		frame02.add(panel02, BorderLayout.SOUTH);

		// RadioButtons für Farbe
		RBRED = new JRadioButton("RED", true);
		RBGREEN = new JRadioButton("GREEN");
		RBBLUE = new JRadioButton("BLUE");
		RBYELLOW = new JRadioButton("YELLOW");
		
		ButtonGroup group = new ButtonGroup();
		group.add(RBRED);
		group.add(RBGREEN);
		group.add(RBBLUE);
		group.add(RBYELLOW);

		panel02.add(RBRED);
		panel02.add(RBGREEN);
		panel02.add(RBBLUE);
		panel02.add(RBYELLOW);

		// RadioButtons für Art
		Mensch = new JRadioButton("Mensch", true);
		KIa = new JRadioButton("KI-Aggressiv");
		KId = new JRadioButton("KI-Defensiv");

		ButtonGroup group2 = new ButtonGroup();
		group2.add(Mensch);
		group2.add(KIa);
		group2.add(KId);

		panel02.add(Mensch);
		panel02.add(KIa);
		panel02.add(KId);
		panel02.add(button02, BorderLayout.SOUTH);

//		spielerName = feld01.getText(); // gibt den eingegebenen Spielernamen
										// aus
			
				nameFarbeArtUebergeben(); // beim klick auf den button werden
											// die daten uebergeben

				// if (bediener.getA() == false) {
				// frame02.dispose();
				// } // schliesst den frame beim klick auf button
			

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
	// anzahlSpielerDieSpielenWollenAbfrage() benötigt

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

		ImageIcon feld = new ImageIcon("Bilder//spielbrett.jpg");
		hauptf.setLocation(200, 50);
		hauptf.setMenuBar(this.getMenuOben()); // erstellt Menue oben

		hauptf.setSize(1250, 1000);
		JLabel hauptl = new JLabel(feld);

		ImageIcon test = new ImageIcon("Bilder//eins.jpg");
		// /////////////////////////////////////////wuerfel anzeigen lassen
		JLabel wuerfelL = new JLabel(test);
		// //////////////////////////////////////////////

		if (bediener.wurf() == 1) {
			log("Eins wurde gewuerfelt");
			ImageIcon eins = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 2) {
			log("Zwei wurde gewuerfelt");
			ImageIcon zwei = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 3) {
			log("Drei wurde gewuerfelt");
			ImageIcon drei = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 4) {
			log("Vier wurde gewuerfelt");
			ImageIcon vier = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 5) {
			log("Fuenf wurde gewuerfelt");
			ImageIcon fünf = new ImageIcon("Bilder//eins.jpg");
		}
		if (bediener.wurf() == 6) {
			log("Sechs wurde gewuerfelt");
			ImageIcon sechs = new ImageIcon("Bilder//eins.jpg");
		}

		hauptf.add(hauptp);
		hauptf.add(hauptl, BorderLayout.CENTER);
		hauptf.add(wuerfelL, BorderLayout.WEST);
		hauptf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hauptf.setVisible(true);
		hauptf.setResizable(false);

		// LOGGER

		JPanel logger = new JPanel();
		logger.setLayout(new BorderLayout());
		ta.setFont(new Font("Arial", Font.PLAIN, 14));
		ta.setOpaque(true);
		ta.setEditable(false);
		scroller = new JScrollPane(ta);
		logger.add(new JLabel("Log-Fenster:"), BorderLayout.NORTH);
		logger.add(scroller, BorderLayout.CENTER);
		jf.getContentPane().add(logger);
		hauptf.add(logger, BorderLayout.SOUTH);
		//

		// Bedieung
		JPanel panelB = new JPanel();
		panelB.setLayout(new BorderLayout());
		JButton buttonVor = new JButton("Figur vor");
		JButton buttonWurf = new JButton("Wuerfeln");

		buttonVor.addActionListener(eh);
		buttonWurf.addActionListener(eh);

		panelB.add(buttonVor, BorderLayout.CENTER);
		panelB.add(buttonWurf, BorderLayout.EAST);
		hauptf.add(panelB, BorderLayout.EAST);

		// //////////////////////////////Damit kann man die absoloute buttons
		// zeigen, aber rechts fallen die buttons
		// raus////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		feldButtons();
		addComponentsToPane(hauptf.getContentPane());

		//
		// /////////////////////////////////////////////////////////////////////////////////////////////////////
		// if(spielErstellt || spielGeladen==true){
		//
		// }

		if (hatGewuerfelt == false) { // Wenn nicht gewürfelt wurde darf man Vor
										// nicht waehlen koennen, leider zeigts
										// meine Buttons nicht an :(
										// diese Abfrage muss er eig ständig
										// machen

			buttonVor.setEnabled(false);
			buttonWurf.setEnabled(true);
		} else {
			buttonVor.setEnabled(true);
			buttonWurf.setEnabled(false);
		}

		//

		// Spielfiguren anzeigen figuren abfragen und setzten
	}

	/**
	 * 
	 * @param text
	 *            wird im Logger gezeigt
	 */
	public void log(String text) {
		ta.setText(text + "\n" + ta.getText());// Wenn etwas im Logger gezweigt
												// werden soll einfach
												// log("inhalt"); aufrufen!
	}

	/**
	 * Zum leeren des Loggers
	 */
	public void logClear() {
		ta.setText("");
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
		laden.addActionListener(eh);
		MenuItem neu = new MenuItem("neues Spiel erstellen"); // Unterknopf 2
		spiel.add(neu);
		neu.addActionListener(eh);
		MenuItem speichern = new MenuItem("als PDF speichern");
		spiel.add(speichern);
		menueLeiste.add(spiel);

		Menu hilfe = new Menu("Hilfe"); // zweiter Knopf
		menueLeiste.add(hilfe);

		return menueLeiste;
	}

	// /////////////////////////////////////Alle Feld
	// Buttons////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void feldButtons() {

		for (int i = 0; i < 72; i++) {
			buttonArray[i] = new JButton("Erste Fuellung");
			buttonArray[i].setMargin(new Insets(0, 0, 0, 0));
			// buttonArray[i].setVisible(false);
		}
		setButtonText(1, "SFR1");
		setButtonText(2, "SFR2");
		setButtonText(3, "SFR3");
		setButtonText(4, "SFR4");

		setButtonText(5, "SFB1");
		setButtonText(6, "SFB2");
		setButtonText(7, "SFB3");
		setButtonText(8, "SFB4");

		setButtonText(13, "SFG1");
		setButtonText(14, "SFG2");
		setButtonText(15, "SFG3");
		setButtonText(16, "SFG4");
		
		setButtonText(9, "SFY1");
		setButtonText(10, "SFY2");
		setButtonText(11, "SFY3");
		setButtonText(12, "SFY4");
		

		for (int x = 17; x <= 56; x++) {
			int y = x - 16;
			setButtonText(x, "F" + y);

		}

		setButtonText(57, "EFR1");
		setButtonText(58, "EFR2");
		setButtonText(59, "EFR3");
		setButtonText(60, "EFR4");

		setButtonText(61, "EFB1");
		setButtonText(62, "EFB2");
		setButtonText(63, "EFB3");
		setButtonText(64, "EFB4");

		setButtonText(65, "EFG1");
		setButtonText(66, "EFG2");
		setButtonText(67, "EFG3");
		setButtonText(68, "EFG4");

		setButtonText(69, "EFY1");
		setButtonText(70, "EFY2");
		setButtonText(71, "EFY3");
		setButtonText(72, "EFY4");
	}

	// //////////////////////////////////////

	// //////////////////////////////////////////////////////////////////////////////////////mögl
	// für absoloute
	// buttons////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void addComponentsToPane(Container pane) {
		pane.setLayout(null);

		for (int i = 0; i < 72; i++) {
			pane.add(buttonArray[i]);
		}
		// SR
		Insets insets = pane.getInsets();
		Dimension size = buttonArray[0].getPreferredSize();
		size = buttonArray[0].getPreferredSize();
		buttonArray[0].setBounds(280 + insets.left, 99 + insets.top,
				size.width, size.height);
		buttonArray[0].setSize(35, 35);

		size = buttonArray[1].getPreferredSize();
		buttonArray[1].setBounds(333 + insets.left, 99 + insets.top,
				size.width, size.height);
		buttonArray[1].setSize(35, 35);

		size = buttonArray[2].getPreferredSize();
		buttonArray[2].setBounds(280 + insets.left, 153 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[2].setSize(35, 35);

		size = buttonArray[3].getPreferredSize();
		buttonArray[3].setBounds(333 + insets.left, 153 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[3].setSize(35, 35);

		// SB

		size = buttonArray[4].getPreferredSize();
		buttonArray[4].setBounds(756 + insets.left, 99 + insets.top,
				size.width, size.height);
		buttonArray[4].setSize(35, 35);

		size = buttonArray[5].getPreferredSize();
		buttonArray[5].setBounds(809 + insets.left, 99 + insets.top,
				size.width, size.height);
		buttonArray[5].setSize(35, 35);

		size = buttonArray[6].getPreferredSize();
		buttonArray[6].setBounds(756 + insets.left, 153 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[6].setSize(35, 35);

		size = buttonArray[7].getPreferredSize();
		buttonArray[7].setBounds(809 + insets.left, 153 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[7].setSize(35, 35);

		// SY
		size = buttonArray[8].getPreferredSize();
		buttonArray[8].setBounds(280 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[8].setSize(35, 35);

		size = buttonArray[9].getPreferredSize();
		buttonArray[9].setBounds(333 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[9].setSize(35, 35);

		size = buttonArray[10].getPreferredSize();
		buttonArray[10].setBounds(280 + insets.left, 629 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[10].setSize(35, 35);

		size = buttonArray[11].getPreferredSize();
		buttonArray[11].setBounds(333 + insets.left, 629 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[11].setSize(35, 35);

		// SG

		size = buttonArray[12].getPreferredSize();
		buttonArray[12].setBounds(756 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[12].setSize(35, 35);

		size = buttonArray[13].getPreferredSize();
		buttonArray[13].setBounds(809 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[13].setSize(35, 35);

		size = buttonArray[14].getPreferredSize();
		buttonArray[14].setBounds(756 + insets.left, 629 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[14].setSize(35, 35);

		size = buttonArray[15].getPreferredSize();
		buttonArray[15].setBounds(809 + insets.left, 629 + insets.top,
				size.width + 50, size.height + 20);
		buttonArray[15].setSize(35, 35);

		// F
		size = buttonArray[16].getPreferredSize();
		buttonArray[16].setBounds(280 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[16].setSize(35, 35);

		size = buttonArray[17].getPreferredSize();
		buttonArray[17].setBounds(333 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[17].setSize(35, 35);

		size = buttonArray[18].getPreferredSize();
		buttonArray[18].setBounds(386 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[18].setSize(35, 35);

		size = buttonArray[19].getPreferredSize();
		buttonArray[19].setBounds(439 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[19].setSize(35, 35);

		size = buttonArray[20].getPreferredSize();
		buttonArray[20].setBounds(492 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[20].setSize(35, 35);

		size = buttonArray[21].getPreferredSize();
		buttonArray[21].setBounds(492 + insets.left, 257 + insets.top,
				size.width, size.height);
		buttonArray[21].setSize(35, 35);

		size = buttonArray[22].getPreferredSize();
		buttonArray[22].setBounds(492 + insets.left, 204 + insets.top,
				size.width, size.height);
		buttonArray[22].setSize(35, 35);

		size = buttonArray[23].getPreferredSize();
		buttonArray[23].setBounds(492 + insets.left, 151 + insets.top,
				size.width, size.height);
		buttonArray[23].setSize(35, 35);

		size = buttonArray[24].getPreferredSize();
		buttonArray[24].setBounds(492 + insets.left, 98 + insets.top,
				size.width, size.height);
		buttonArray[24].setSize(35, 35);

		size = buttonArray[25].getPreferredSize();
		buttonArray[25].setBounds(545 + insets.left, 98 + insets.top,
				size.width, size.height);
		buttonArray[25].setSize(35, 35);

		size = buttonArray[26].getPreferredSize();
		buttonArray[26].setBounds(598 + insets.left, 98 + insets.top,
				size.width, size.height);
		buttonArray[26].setSize(35, 35);

		size = buttonArray[27].getPreferredSize();
		buttonArray[27].setBounds(598 + insets.left, 151 + insets.top,
				size.width, size.height);
		buttonArray[27].setSize(35, 35);

		size = buttonArray[28].getPreferredSize();
		buttonArray[28].setBounds(598 + insets.left, 204 + insets.top,
				size.width, size.height);
		buttonArray[28].setSize(35, 35);

		size = buttonArray[29].getPreferredSize();
		buttonArray[29].setBounds(598 + insets.left, 257 + insets.top,
				size.width, size.height);
		buttonArray[29].setSize(35, 35);

		size = buttonArray[30].getPreferredSize();
		buttonArray[30].setBounds(598 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[30].setSize(35, 35);

		size = buttonArray[31].getPreferredSize();
		buttonArray[31].setBounds(651 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[31].setSize(35, 35);

		size = buttonArray[32].getPreferredSize();
		buttonArray[32].setBounds(704 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[32].setSize(35, 35);

		size = buttonArray[33].getPreferredSize();
		buttonArray[33].setBounds(757 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[33].setSize(35, 35);

		size = buttonArray[34].getPreferredSize();
		buttonArray[34].setBounds(810 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[34].setSize(35, 35);

		size = buttonArray[35].getPreferredSize();
		buttonArray[35].setBounds(810 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[35].setSize(35, 35);

		size = buttonArray[36].getPreferredSize();
		buttonArray[36].setBounds(810 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[36].setSize(35, 35);

		size = buttonArray[37].getPreferredSize();
		buttonArray[37].setBounds(757 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[37].setSize(35, 35);

		size = buttonArray[38].getPreferredSize();
		buttonArray[38].setBounds(704 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[38].setSize(35, 35);

		size = buttonArray[39].getPreferredSize();
		buttonArray[39].setBounds(651 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[39].setSize(35, 35);

		size = buttonArray[40].getPreferredSize();
		buttonArray[40].setBounds(598 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[40].setSize(35, 35);

		size = buttonArray[41].getPreferredSize();
		buttonArray[41].setBounds(598 + insets.left, 469 + insets.top,
				size.width, size.height);
		buttonArray[41].setSize(35, 35);

		size = buttonArray[42].getPreferredSize();
		buttonArray[42].setBounds(598 + insets.left, 522 + insets.top,
				size.width, size.height);
		buttonArray[42].setSize(35, 35);

		size = buttonArray[43].getPreferredSize();
		buttonArray[43].setBounds(598 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[43].setSize(35, 35);

		size = buttonArray[44].getPreferredSize();
		buttonArray[44].setBounds(598 + insets.left, 628 + insets.top,
				size.width, size.height);
		buttonArray[44].setSize(35, 35);

		size = buttonArray[45].getPreferredSize();
		buttonArray[45].setBounds(545 + insets.left, 628 + insets.top,
				size.width, size.height);
		buttonArray[45].setSize(35, 35);

		size = buttonArray[46].getPreferredSize();
		buttonArray[46].setBounds(492 + insets.left, 628 + insets.top,
				size.width, size.height);
		buttonArray[46].setSize(35, 35);

		size = buttonArray[47].getPreferredSize();
		buttonArray[47].setBounds(492 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[47].setSize(35, 35);

		size = buttonArray[48].getPreferredSize();
		buttonArray[48].setBounds(492 + insets.left, 522 + insets.top,
				size.width, size.height);
		buttonArray[48].setSize(35, 35);

		size = buttonArray[49].getPreferredSize();
		buttonArray[49].setBounds(492 + insets.left, 469 + insets.top,
				size.width, size.height);
		buttonArray[49].setSize(35, 35);

		size = buttonArray[50].getPreferredSize();
		buttonArray[50].setBounds(492 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[50].setSize(35, 35);

		size = buttonArray[51].getPreferredSize();
		buttonArray[51].setBounds(439 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[51].setSize(35, 35);

		size = buttonArray[52].getPreferredSize();
		buttonArray[52].setBounds(386 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[52].setSize(35, 35);

		size = buttonArray[53].getPreferredSize();
		buttonArray[53].setBounds(333 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[53].setSize(35, 35);

		size = buttonArray[54].getPreferredSize();
		buttonArray[54].setBounds(280 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[54].setSize(35, 35);

		size = buttonArray[55].getPreferredSize();
		buttonArray[55].setBounds(280 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[55].setSize(35, 35);

		// ER

		size = buttonArray[56].getPreferredSize();
		buttonArray[56].setBounds(333 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[56].setSize(35, 35);

		size = buttonArray[57].getPreferredSize();
		buttonArray[57].setBounds(386 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[57].setSize(35, 35);

		size = buttonArray[58].getPreferredSize();
		buttonArray[58].setBounds(439 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[58].setSize(35, 35);

		size = buttonArray[59].getPreferredSize();
		buttonArray[59].setBounds(492 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[59].setSize(35, 35);
		
		//EB
		
		size = buttonArray[60].getPreferredSize();
		buttonArray[60].setBounds(545 + insets.left, 151 + insets.top,
				size.width, size.height);
		buttonArray[60].setSize(35, 35);
		
		size = buttonArray[61].getPreferredSize();
		buttonArray[61].setBounds(545 + insets.left, 204 + insets.top,
				size.width, size.height);
		buttonArray[61].setSize(35, 35);
		
		size = buttonArray[62].getPreferredSize();
		buttonArray[62].setBounds(545 + insets.left, 257 + insets.top,
				size.width, size.height);
		buttonArray[62].setSize(35, 35);
		
		size = buttonArray[63].getPreferredSize();
		buttonArray[63].setBounds(545 + insets.left, 310 + insets.top,
				size.width, size.height);
		buttonArray[63].setSize(35, 35);
		
		
		//EG
		
		
		size = buttonArray[64].getPreferredSize();
		buttonArray[64].setBounds(755 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[64].setSize(35, 35);
		
		size = buttonArray[65].getPreferredSize();
		buttonArray[65].setBounds(702 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[65].setSize(35, 35);
		
		size = buttonArray[66].getPreferredSize();
		buttonArray[66].setBounds(649 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[66].setSize(35, 35);
		
		size = buttonArray[67].getPreferredSize();
		buttonArray[67].setBounds(596 + insets.left, 363 + insets.top,
				size.width, size.height);
		buttonArray[67].setSize(35, 35);
		
		
		//EY
		

		size = buttonArray[68].getPreferredSize();
		buttonArray[68].setBounds(545 + insets.left, 575 + insets.top,
				size.width, size.height);
		buttonArray[68].setSize(35, 35);
		
		size = buttonArray[69].getPreferredSize();
		buttonArray[69].setBounds(545 + insets.left, 522 + insets.top,
				size.width, size.height);
		buttonArray[69].setSize(35, 35);
		
		size = buttonArray[70].getPreferredSize();
		buttonArray[70].setBounds(545 + insets.left, 469 + insets.top,
				size.width, size.height);
		buttonArray[70].setSize(35, 35);
		
		size = buttonArray[71].getPreferredSize();
		buttonArray[71].setBounds(545 + insets.left, 416 + insets.top,
				size.width, size.height);
		buttonArray[71].setSize(35, 35);
		
		ImageIcon kreis = new ImageIcon("C://Users//maddo_000//Desktop//kreis.gif");
	
		buttonArray[71].setText(null);
		 buttonArray[71].setIcon( kreis );
		
	}
	
	
		
		

	public void setButtonText(int nummer, String text) {
		buttonArray[nummer - 1].setText(text);
	}
	public void setSpielerArt(String SpielerArt) {
		spielerArt = SpielerArt;
	}

	public void setSpielerFarbe(String SpielerFarbe) {
		this.spielerFarbe = SpielerFarbe;
	}
	public String getSpielerName() {
		return spielerName;
	}

	public String getSpielerFarbe() {
		return spielerFarbe;
	}

	public String getSpielerArt() {
		return spielerArt;
	}
	public void setSpielerName(String spielerName) {
		this.spielerName = spielerName;
	}
	/**
	 * 
	 * @return spAnzahl Anzahl aller Spieler
	 */
	public int getSpAnz() {
		return spAnzahl;
	}
	public void setSpAnzahl(int spAnzahl) {
		this.spAnzahl = spAnzahl;
	}

	// //////////////////////////////////////////////////////////////////////////////////

	// ein bild zu button:
	// JButton button = new JButton();
	// button.setIcon( icon1 );
	// frame.add( button );
	// frame.add( new JLabel( icon2 ) );
}
