package frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import backend.Spiel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Die Klasse GUI
 * 
 *
 */

public class GUI extends JFrame implements iMeldung {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7153140876841963797L;
	private JButton kiZug;
	private ImageIcon RotF;
	private ImageIcon BlauF;
	private ImageIcon GelbF;;
	private ImageIcon GruenF;
	private ImageIcon Rot;
	private ImageIcon Blau;
	private ImageIcon Gelb;
	private ImageIcon Gruen;
	private ImageIcon feldn;

	private ButtonGroup group;
	private ImageIcon eins;
	private JLabel wuerfelt1;
	private ImageIcon zwei;
	private JLabel wuerfelt2;
	private ImageIcon drei;
	private JLabel wuerfelt3;
	private ImageIcon vier;
	private JLabel wuerfelt4;
	private ImageIcon fuenf;
	private JLabel wuerfelt5;
	private ImageIcon sechs;
	private JLabel wuerfelt6;
	private JLabel wuerfelL;
	private ImageIcon test;
	private JLabel wuerfelt;
	private ImageIcon wuerfeln;
	private JTextField feld01;
	private JSpinner spinner;
	private JRadioButton RBRED;
	private JRadioButton RBGREEN;
	private JRadioButton RBBLUE;
	private JRadioButton RBYELLOW;
	private JRadioButton Mensch;
	private JRadioButton KIa;
	private JRadioButton KId;
	private JFrame frame;
	private JFrame frame02;
	private JFrame mailFrame;
	private JButton buttonWurf;
	// private JFrame jf = new JFrame("SPIEL");
	private EventHandler eh;
	private int spAnzahl; // spielerAnzahl die im Spinner gewählt wird
	private String spielerName;
	// private JLabel jl = new JLabel("");
	// private JSpinner spinner;
	// private boolean fehler;
	private String spielerFarbe;
	private String spielerArt;
	private iBediener bediener = new Spiel();
	private JFrame hauptf = new JFrame("Spiel 'Mensch aergere dich nicht!'");
	private JPanel hauptp = new JPanel(new BorderLayout());
	private JButton[] buttonArray = new JButton[72];
	private JTextArea ta = new JTextArea(8, 20);// fuer die Loggerfeld groesse
	private JScrollPane scroller;
	private JButton mitte = new JButton("M");
	private final int x = 35;
	private final int y = 35;
	private final int a = 53;
	private final int b = 3;
	private final int c = 3;
	private boolean first = false;
	private ArrayList<String> farbe;
	JTextField empfaengerFeld;

	/**
	 * Konstruktor GUI
	 */
	public GUI() {
		super();
		eh = new EventHandler(this);
		// spielLadenAbfrage();
		farbe = new ArrayList<String>();
		spielfeldAnzeigen();
		// jf.addWindowListener(new WindowAdapter() { // fuer die Menue Knoepfe
		// public void windowClosing(final WindowEvent e) {
		// System.exit(0);
		// }
		// });
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

		// log("Spieler erstellen: Spielerzahl waehlen");
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

		frame02 = new JFrame("Spieler erstellen");
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
		RBRED = new JRadioButton("RED");
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

		// spielerName = feld01.getText(); // gibt den eingegebenen Spielernamen
		// aus

		// nameFarbeArtUebergeben(); // beim klick auf den button werden
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

	public void spielSpeichern() throws IOException {
		bediener.Speichern("MADN Spiel", "PDF");
	}

	public void spielSpeichernCSV() throws IOException {
		bediener.Speichern("MADN Spiel", "CSV");
	}

	public void spielSpeichernSER() throws IOException {
		bediener.Speichern("MADN Spiel", "SER");
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

		// ImageIcon feld = new ImageIcon("Bilder//spielbrett.jpg");
		ImageIcon feld = new ImageIcon("Bilder//feldU.gif");

		hauptf.setLocation(GetScreenWorkingWidth() / 16,
				GetScreenWorkingHeight() / 14);
		hauptf.setMenuBar(this.getMenuOben()); // erstellt Menue oben

		hauptf.setSize(GetScreenWorkingWidth() - 450,
				GetScreenWorkingHeight() - 50);
		// hauptf.setExtendedState(Frame.MAXIMIZED_BOTH);
		// hauptf.setSize(1250, 1000);
		JLabel hauptl = new JLabel(feld);

		test = new ImageIcon("Bilder//eins.jpg");
		wuerfelL = new JLabel(test);
		// ////////wuerfel anzeigen lassen

		eins = new ImageIcon("Bilder//eins.jpg");
		wuerfelt1 = new JLabel(eins);
		zwei = new ImageIcon("Bilder//zwei.jpg");
		wuerfelt2 = new JLabel(zwei);
		drei = new ImageIcon("Bilder//drei.jpg");
		wuerfelt3 = new JLabel(drei);
		vier = new ImageIcon("Bilder//vier.jpg");
		wuerfelt4 = new JLabel(vier);
		fuenf = new ImageIcon("Bilder//fuenf.jpg");
		wuerfelt5 = new JLabel(fuenf);
		sechs = new ImageIcon("Bilder//sechs.jpg");
		wuerfelt6 = new JLabel(sechs);

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
		// jf.getContentPane().add(logger);
		hauptf.add(logger, BorderLayout.SOUTH);
		//

		// Bedieung
		JPanel panelB = new JPanel();
		panelB.setLayout(new BorderLayout());
		buttonWurf = new JButton("Wuerfeln");
		kiZug = new JButton("KI ziehen");


		buttonWurf.addActionListener(eh);
		kiZug.addActionListener(eh);
		

		panelB.add(buttonWurf, BorderLayout.EAST);
		panelB.add(kiZug, BorderLayout.CENTER);
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
	}
/**
 * Fuer  dass aender der bildchen wenn sich das Spiel aendert
 * 
 * @param IDs
 * @param pos_old
 */
	public void playerIcons(String[] IDs, int pos_old) {
		if (IDs != null && IDs.length == 2) {
			int pos;
			if (IDs[0].length() < 3) {
				pos = Integer.parseInt(IDs[0]) + 15;
			} else {
				pos = 0;
				if (IDs[0].contains("E")) {
					pos += 55;
				}
				if (IDs[0].contains("B")) {
					pos += 4;
				} else if (IDs[0].contains("G")) {
					pos += 8;
				} else if (IDs[0].contains("Y")) {
					pos += 12;
				}
				pos += Integer.parseInt(IDs[0].substring(3, 3));
			}
			if (IDs[1] != null) {
				int pos2 = 0;
				if (IDs[1].contains("B")) {
					pos2 += 4;
				} else if (IDs[1].contains("G")) {
					pos2 += 8;
				} else if (IDs[1].contains("Y")) {
					pos2 += 12;
				}
				pos2 += Integer.parseInt(IDs[1].substring(3, 3));

				// einfach nur methode wenn geschlagen werden muss, Icon an der
				// Stelle vom ButtonArray
				// auf das man geklickt hat verschieben. Also Icon an der stelle
				// wo die figur stand
				// auf das default icon setzen (feldn ?)
				// das Icon an der Pos2 (da wo die figur hin soll und schon eine
				// sitzt) auf das entsprechende Startfeld verschieben
				// icon = ButtonArray[pos].getIcon() ??
				
				buttonArray[pos].setIcon(feldn);// default Icon (wird eh nochmal ueberschrieben)

				if (IDs[1].contains("B")) {

					buttonArray[pos2].setIcon(feldn);
					for (int i = 4; i < 7; i++) {

						if (buttonArray[i].getIcon() == Blau) {

							buttonArray[i].setIcon(BlauF);

						}
					}
				}

				if (IDs[1].contains("G")) {

					buttonArray[pos2].setIcon(feldn);
					for (int i = 8; i < 11; i++) {

						if (buttonArray[i].getIcon() == Gruen) {

							buttonArray[i].setIcon(GruenF);

						}
					}
				}

				if (IDs[1].contains("Y")) {

					buttonArray[pos2].setIcon(feldn);
					for (int i = 12; i < 15; i++) {

						if (buttonArray[i].getIcon() == Gelb) {

							buttonArray[i].setIcon(GelbF);

						}
					}
				}

				if (IDs[1].contains("R")) {

					buttonArray[pos2].setIcon(feldn);
					for (int i = 4; i < 7; i++) {

						if (buttonArray[i].getIcon() == Rot) {

							buttonArray[i].setIcon(RotF);

						}
					}
				}

				// buttonArray[pos2].setIcon//SpielfigurIcon auf
				// Startfeld(geschlagen) -> farbe bei bedarf in IDs[1]
			}
			// methode laufen ohne schlagen
			// die alte position wo die Spielfigur sitzt auf das default icon
			// setzen (feln?)
			// das icon auf die neue position verschieben
			// icon = ButtonArray[pos].getIcon() ??

			buttonArray[pos_old].setIcon(feldn);

			if (IDs[0].contains("R")) {

				buttonArray[pos].setIcon(RotF);
			}

			if (IDs[0].contains("B")) {

				buttonArray[pos].setIcon(BlauF);
			}

			if (IDs[0].contains("G")) {

				buttonArray[pos].setIcon(GruenF);
			}

			if (IDs[0].contains("Y")) {

				buttonArray[pos].setIcon(GelbF);
			}

			// ButtonArray[pos_old] = default Icon
			// ButtonArray[pos] = SpielfigurIcon (neue position, farbe bei
			// bedarf in IDs[0]
		}
	}

	/**
	 * 
	 * @param text
	 *            wird im Logger gezeigt
	 */
	@Override
	public void log(String text) {

		if (first == false) {
			ta.setText(ta.getText() + text);
			first = true;
		} else {
			ta.setText(ta.getText() + "\n" + text);// Wenn etwas im Logger
													// gezweigt
													// werden soll einfach
		} // log("inhalt"); aufrufen!
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
		speichern.addActionListener(eh);
		menueLeiste.add(spiel);
		MenuItem speichernCSV = new MenuItem("als CSV speichern");
		spiel.add(speichernCSV);
		speichernCSV.addActionListener(eh);
		menueLeiste.add(spiel);
		MenuItem speichernSER = new MenuItem("Serialisiert speichern");
		spiel.add(speichernSER);
		speichernSER.addActionListener(eh);
		menueLeiste.add(spiel);

		Menu mail = new Menu("Mail");
		MenuItem senden = new MenuItem("Mail senden");
		mail.add(senden);
		senden.addActionListener(eh);
		menueLeiste.add(mail);

		Menu hilfe = new Menu("Hilfe"); // dritter Knopf
		MenuItem screenshot = new MenuItem("Screenshot");
		hilfe.add(screenshot);
		screenshot.addActionListener(eh);
		menueLeiste.add(hilfe);

		return menueLeiste;
	}

	public static BufferedImage getScreenShot(Component component) {

		BufferedImage image = new BufferedImage(component.getWidth(),
				component.getHeight(), BufferedImage.TYPE_INT_RGB);
		// ruft die Komponente der zeichnen Methoden auf
		// Graphics Object vom Image
		component.paint(image.getGraphics());
		return image;
	}

	public void screenshotErstellen() {

		BufferedImage img = getScreenShot(hauptf.getContentPane());

		try {
			// macht das Bild zu PNG
			ImageIO.write(img, "png", new File("screenshotSpiel.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		log("Screenshot wurde erstellt.");
	}

	// ////////////////////////////////Alle FeldButtons

	public void feldButtons() {

		for (int i = 0; i < 72; i++) {
			buttonArray[i] = new JButton("");
			buttonArray[i].setMargin(new Insets(0, 0, 0, 0));
			buttonArray[i].addActionListener(eh);

		}

	}

	public void addComponentsToPane(Container pane) {
		pane.setLayout(null);

		feldn = new ImageIcon("Bilder//Feldw.png");
		Rot = new ImageIcon("Bilder//KreisR.gif");
		Blau = new ImageIcon("Bilder//KreisB.gif");
		Gelb = new ImageIcon("Bilder//KreisY.gif");
		Gruen = new ImageIcon("Bilder//KreisG.gif");

		RotF = new ImageIcon("Bilder//FigurRot.png");
		BlauF = new ImageIcon("Bilder//FigurBlau.png");
		GelbF = new ImageIcon("Bilder//FigurGelb.png");
		GruenF = new ImageIcon("Bilder//FigurGruen.png");

		for (int i = 0; i < 72; i++) {
			pane.add(buttonArray[i]);
		}
		// SR

		buttonArray[0].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[0].setIcon(Rot);

		buttonArray[1].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[1].setIcon(Rot);

		buttonArray[2].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[2].setIcon(Rot);

		buttonArray[3].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[3].setIcon(Rot);

		// SB

		buttonArray[4].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[4].setIcon(Blau);

		buttonArray[5].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[5].setIcon(Blau);

		buttonArray[6].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[6].setIcon(Blau);

		buttonArray[7].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[7].setIcon(Blau);

		// SY
		buttonArray[8].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[8].setIcon(Gelb);

		buttonArray[9].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[9].setIcon(Gelb);

		buttonArray[10].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[10].setIcon(Gelb);

		buttonArray[11].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[11].setIcon(Gelb);

		// SG

		buttonArray[12].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[12].setIcon(Gruen);

		buttonArray[13].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[13].setIcon(Gruen);

		buttonArray[14].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[14].setIcon(Gruen);

		buttonArray[15].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[15].setIcon(Gruen);

		for (int x = 16; x <= 56; x++) {
			buttonArray[x].setIcon(feldn);

		}

		// F
		buttonArray[16].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b - a, x, y);

		buttonArray[17].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b - a, x, y);

		buttonArray[18].setBounds(GetScreenWorkingWidth() / c - 3 * a,
				GetScreenWorkingHeight() / b - a, x, y);

		buttonArray[19].setBounds(GetScreenWorkingWidth() / c - 2 * a,
				GetScreenWorkingHeight() / b - a, x, y);

		buttonArray[20].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b - a, x, y);

		buttonArray[21].setBounds(GetScreenWorkingWidth() / c - a,
				GetScreenWorkingHeight() / b - 2 * a, x, y);

		buttonArray[22].setBounds(GetScreenWorkingWidth() / c - a,
				GetScreenWorkingHeight() / b - 3 * a, x, y);

		buttonArray[23].setBounds(GetScreenWorkingWidth() / c - a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);

		buttonArray[24].setBounds(GetScreenWorkingWidth() / c - a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);

		buttonArray[25].setBounds(GetScreenWorkingWidth() / c + 0 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);

		buttonArray[26].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);

		buttonArray[27].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);

		buttonArray[28].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b - 3 * a, x, y);

		buttonArray[29].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b - 2 * a, x, y);

		buttonArray[30].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b - 1 * a, x, y);

		buttonArray[31].setBounds(GetScreenWorkingWidth() / c + 2 * a,
				GetScreenWorkingHeight() / b - 1 * a, x, y);

		buttonArray[32].setBounds(GetScreenWorkingWidth() / c + 3 * a,
				GetScreenWorkingHeight() / b - 1 * a, x, y);

		buttonArray[33].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b - 1 * a, x, y);

		buttonArray[34].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b - 1 * a, x, y);

		buttonArray[35].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 0 * a, x, y);

		buttonArray[36].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[37].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[38].setBounds(GetScreenWorkingWidth() / c + 3 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[39].setBounds(GetScreenWorkingWidth() / c + 2 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[40].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[41].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b + 2 * a, x, y);

		buttonArray[42].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b + 3 * a, x, y);

		buttonArray[43].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);

		buttonArray[44].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);

		buttonArray[45].setBounds(GetScreenWorkingWidth() / c + 0 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);

		buttonArray[46].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);

		buttonArray[47].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);

		buttonArray[48].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b + 3 * a, x, y);

		buttonArray[49].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b + 2 * a, x, y);

		buttonArray[50].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[51].setBounds(GetScreenWorkingWidth() / c - 2 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[52].setBounds(GetScreenWorkingWidth() / c - 3 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[53].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[54].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 1 * a, x, y);

		buttonArray[55].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 0 * a, x, y);

		// ER

		buttonArray[56].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[56].setIcon(Rot);

		buttonArray[57].setBounds(GetScreenWorkingWidth() / c - 3 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[57].setIcon(Rot);

		buttonArray[58].setBounds(GetScreenWorkingWidth() / c - 2 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[58].setIcon(Rot);

		buttonArray[59].setBounds(GetScreenWorkingWidth() / c - 1 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[59].setIcon(Rot);

		// EB

		buttonArray[60].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[60].setIcon(Blau);

		buttonArray[61].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b - 3 * a, x, y);
		buttonArray[61].setIcon(Blau);

		buttonArray[62].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b - 2 * a, x, y);
		buttonArray[62].setIcon(Blau);

		buttonArray[63].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b - 1 * a, x, y);
		buttonArray[63].setIcon(Blau);

		// EG

		buttonArray[64].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[64].setIcon(Gruen);

		buttonArray[65].setBounds(GetScreenWorkingWidth() / c + 3 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[65].setIcon(Gruen);

		buttonArray[66].setBounds(GetScreenWorkingWidth() / c + 2 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[66].setIcon(Gruen);

		buttonArray[67].setBounds(GetScreenWorkingWidth() / c + 1 * a,
				GetScreenWorkingHeight() / b, x, y);
		buttonArray[67].setIcon(Gruen);

		// EY

		buttonArray[68].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[68].setIcon(Gelb);

		buttonArray[69].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b + 3 * a, x, y);
		buttonArray[69].setIcon(Gelb);

		buttonArray[70].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b + 2 * a, x, y);
		buttonArray[70].setIcon(Gelb);

		buttonArray[71].setBounds(GetScreenWorkingWidth() / c,
				GetScreenWorkingHeight() / b + 1 * a, x, y);
		buttonArray[71].setIcon(Gelb);

		buttonArray[16].setIcon(Rot);
		buttonArray[26].setIcon(Blau);
		buttonArray[36].setIcon(Gruen);
		buttonArray[46].setIcon(Gelb);

	}

	public static int GetScreenWorkingWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getMaximumWindowBounds().width;

	}

	public static int GetScreenWorkingHeight() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getMaximumWindowBounds().height;
	}

	public void setButtonText(int nummer, String text) {
		buttonArray[nummer - 1].setText(text);
	}

	public void setButtonIconRot() {

		buttonArray[0].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[0].setIcon(RotF);

		buttonArray[1].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[1].setIcon(RotF);

		buttonArray[2].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[2].setIcon(RotF);

		buttonArray[3].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[3].setIcon(RotF);
	}

	public void setButtonIconBlau() {

		buttonArray[4].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[4].setIcon(BlauF);

		buttonArray[5].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b - 5 * a, x, y);
		buttonArray[5].setIcon(BlauF);

		buttonArray[6].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[6].setIcon(BlauF);

		buttonArray[7].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b - 4 * a, x, y);
		buttonArray[7].setIcon(BlauF);
	}

	public void setButtonIconGruen() {

		buttonArray[12].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[12].setIcon(GruenF);

		buttonArray[13].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[13].setIcon(GruenF);

		buttonArray[14].setBounds(GetScreenWorkingWidth() / c + 4 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[14].setIcon(GruenF);

		buttonArray[15].setBounds(GetScreenWorkingWidth() / c + 5 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[15].setIcon(GruenF);
	}

	public void setButtonIconGelb() {

		buttonArray[8].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[8].setIcon(GelbF);

		buttonArray[9].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b + 4 * a, x, y);
		buttonArray[9].setIcon(GelbF);

		buttonArray[10].setBounds(GetScreenWorkingWidth() / c - 4 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[10].setIcon(GelbF);

		buttonArray[11].setBounds(GetScreenWorkingWidth() / c - 5 * a,
				GetScreenWorkingHeight() / b + 5 * a, x, y);
		buttonArray[11].setIcon(GelbF);
	}

	public void setSpielerArt(String SpielerArt) {
		this.spielerArt = SpielerArt;
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

	public void Wuerfeln() {
		bediener.wurf();
	}

	public void mailAbfrage() {
		mailFrame = new JFrame();
		mailFrame.setSize(500, 150);
		mailFrame.setTitle("Mail");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2));

		JLabel mailAdresse = new JLabel("E-Mail:");
		JLabel pwLabel = new JLabel("Passwort:");
		JLabel empfaenger = new JLabel("Empfaenger E-Mail:");

		JTextField mail = new JTextField(
				"nur Adressen von reutlingen-university.de");
		JPasswordField pwField = new JPasswordField("");
		pwField.setEchoChar('*'); // macht * bei Passworteingabe
		empfaengerFeld = new JTextField("");

		JButton senden = new JButton("senden");
		senden.addActionListener(eh);

		panel.add(mailAdresse);
		panel.add(mail);
		panel.add(pwLabel);
		panel.add(pwField);
		panel.add(empfaenger);
		panel.add(empfaengerFeld);
		panel.add(senden);

		mailFrame.add(panel);
		mailFrame.setResizable(false);
		mailFrame.setVisible(true);
	}

	// public void mailSenden(){
	// bediener.mailSenden();
	// }

	public boolean compareIcon(ImageIcon i) {

		return (i.equals(BlauF) || i.equals(RotF) || i.equals(GelbF) || i
				.equals(GruenF));
	}

	// ______________________________________getter und
	// setter__________________________________//
	public String getEmpfaenger() {
		return empfaengerFeld.getText();
	}

	public ImageIcon getRotF() {
		return RotF;
	}

	public void setRotF(ImageIcon rotF) {
		RotF = rotF;
	}

	public ImageIcon getBlauF() {
		return BlauF;
	}

	public void setBlauF(ImageIcon blauF) {
		BlauF = blauF;
	}

	public ImageIcon getGelbF() {
		return GelbF;
	}

	public void setGelbF(ImageIcon gelbF) {
		GelbF = gelbF;
	}

	public ImageIcon getGruenF() {
		return GruenF;
	}

	public void setGruenF(ImageIcon gruenF) {
		GruenF = gruenF;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public void setGroup(ButtonGroup group) {
		this.group = group;
	}

	public ImageIcon getEins() {
		return eins;
	}

	public void setEins(ImageIcon eins) {
		this.eins = eins;
	}

	public JLabel getWuerfelt1() {
		return wuerfelt1;
	}

	public void setWuerfelt1(JLabel wuerfelt1) {
		this.wuerfelt1 = wuerfelt1;
	}

	public ImageIcon getZwei() {
		return zwei;
	}

	public void setZwei(ImageIcon zwei) {
		this.zwei = zwei;
	}

	public JLabel getWuerfelt2() {
		return wuerfelt2;
	}

	public void setWuerfelt2(JLabel wuerfelt2) {
		this.wuerfelt2 = wuerfelt2;
	}

	public ImageIcon getDrei() {
		return drei;
	}

	public void setDrei(ImageIcon drei) {
		this.drei = drei;
	}

	public JLabel getWuerfelt3() {
		return wuerfelt3;
	}

	public void setWuerfelt3(JLabel wuerfelt3) {
		this.wuerfelt3 = wuerfelt3;
	}

	public ImageIcon getVier() {
		return vier;
	}

	public void setVier(ImageIcon vier) {
		this.vier = vier;
	}

	public JLabel getWuerfelt4() {
		return wuerfelt4;
	}

	public void setWuerfelt4(JLabel wuerfelt4) {
		this.wuerfelt4 = wuerfelt4;
	}

	public ImageIcon getFuenf() {
		return fuenf;
	}

	public void setFuenf(ImageIcon fuenf) {
		this.fuenf = fuenf;
	}

	public JLabel getWuerfelt5() {
		return wuerfelt5;
	}

	public void setWuerfelt5(JLabel wuerfelt5) {
		this.wuerfelt5 = wuerfelt5;
	}

	public ImageIcon getSechs() {
		return sechs;
	}

	public void setSechs(ImageIcon sechs) {
		this.sechs = sechs;
	}

	public JLabel getWuerfelt6() {
		return wuerfelt6;
	}

	public void setWuerfelt6(JLabel wuerfelt6) {
		this.wuerfelt6 = wuerfelt6;
	}

	public JLabel getWuerfelL() {
		return wuerfelL;
	}

	public void setWuerfelL(JLabel wuerfelL) {
		this.wuerfelL = wuerfelL;
	}

	public ImageIcon getTest() {
		return test;
	}

	public void setTest(ImageIcon test) {
		this.test = test;
	}

	public JLabel getWuerfelt() {
		return wuerfelt;
	}

	public void setWuerfelt(JLabel wuerfelt) {
		this.wuerfelt = wuerfelt;
	}

	public ImageIcon getWuerfeln() {
		return wuerfeln;
	}

	public void setWuerfeln(ImageIcon wuerfeln) {
		this.wuerfeln = wuerfeln;
	}

	public JTextField getFeld01() {
		return feld01;
	}

	public void setFeld01(JTextField feld01) {
		this.feld01 = feld01;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	public JRadioButton getRBRED() {
		return RBRED;
	}

	public void setRBRED(JRadioButton rBRED) {
		RBRED = rBRED;
	}

	public JRadioButton getRBGREEN() {
		return RBGREEN;
	}

	public void setRBGREEN(JRadioButton rBGREEN) {
		RBGREEN = rBGREEN;
	}

	public JRadioButton getRBBLUE() {
		return RBBLUE;
	}

	public void setRBBLUE(JRadioButton rBBLUE) {
		RBBLUE = rBBLUE;
	}

	public JRadioButton getRBYELLOW() {
		return RBYELLOW;
	}

	public void setRBYELLOW(JRadioButton rBYELLOW) {
		RBYELLOW = rBYELLOW;
	}

	public JRadioButton getMensch() {
		return Mensch;
	}

	public void setMensch(JRadioButton mensch) {
		Mensch = mensch;
	}

	public JRadioButton getKIa() {
		return KIa;
	}

	public void setKIa(JRadioButton kIa) {
		KIa = kIa;
	}

	public JRadioButton getKId() {
		return KId;
	}

	public void setKId(JRadioButton kId) {
		KId = kId;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JFrame getFrame02() {
		return frame02;
	}

	public void setFrame02(JFrame frame02) {
		this.frame02 = frame02;
	}

	public JButton getButtonWurf() {
		return buttonWurf;
	}

	public void setButtonWurf(JButton buttonWurf) {
		this.buttonWurf = buttonWurf;
	}

	public EventHandler getEh() {
		return eh;
	}

	public void setEh(EventHandler eh) {
		this.eh = eh;
	}

	public iBediener getBediener() {
		return bediener;
	}

	public void setBediener(iBediener bediener) {
		this.bediener = bediener;
	}

	public JFrame getHauptf() {
		return hauptf;
	}

	public void setHauptf(JFrame hauptf) {
		this.hauptf = hauptf;
	}

	public JPanel getHauptp() {
		return hauptp;
	}

	public void setHauptp(JPanel hauptp) {
		this.hauptp = hauptp;
	}

	public JButton[] getButtonArray() {
		return buttonArray;
	}

	public void setButtonArray(JButton[] buttonArray) {
		this.buttonArray = buttonArray;
	}

	public JTextArea getTa() {
		return ta;
	}

	public void setTa(JTextArea ta) {
		this.ta = ta;
	}

	public JScrollPane getScroller() {
		return scroller;
	}

	public void setScroller(JScrollPane scroller) {
		this.scroller = scroller;
	}

	public JButton getMitte() {
		return mitte;
	}

	public void setMitte(JButton mitte) {
		this.mitte = mitte;
	}

	public ArrayList<String> getFarbe() {
		return farbe;
	}

	public void setFarbe(ArrayList<String> farbe) {
		this.farbe = farbe;
	}

	public int getSpAnzahl() {
		return spAnzahl;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public JFrame getMailFrame() {
		return mailFrame;
	}

	public void setMailFrame(JFrame mailFrame) {
		this.mailFrame = mailFrame;
	}

	public ImageIcon getRot() {
		return Rot;
	}

	public void setRot(ImageIcon rot) {
		Rot = rot;
	}

	public ImageIcon getBlau() {
		return Blau;
	}

	public void setBlau(ImageIcon blau) {
		Blau = blau;
	}

	public ImageIcon getGelb() {
		return Gelb;
	}

	public void setGelb(ImageIcon gelb) {
		Gelb = gelb;
	}

	public ImageIcon getGruen() {
		return Gruen;
	}

	public void setGruen(ImageIcon gruen) {
		Gruen = gruen;
	}

	public ImageIcon getFeldn() {
		return feldn;
	}

	public void setFeldn(ImageIcon feldn) {
		this.feldn = feldn;
	}
	public JButton getKiZug() {
		return kiZug;
	}

	public void setKiZug(JButton kiZug) {
		this.kiZug = kiZug;
	}

	// //////////////////////////////////////////////////////////////////////////////////

	// ein bild zu button:
	// JButton button = new JButton();
	// button.setIcon( icon1 );
	// frame.add( button );
	// frame.add( new JLabel( icon2 ) );
}
