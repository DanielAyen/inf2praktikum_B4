package frontend;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
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
import backend.Wuerfel;

import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Die Klasse GUI
 * 
 *
 */

public class GUI extends JFrame implements iMeldung{
	ImageIcon eins;
	JLabel wuerfelt1;
	ImageIcon zwei;
	JLabel wuerfelt2;
	ImageIcon drei;
	JLabel wuerfelt3;
	ImageIcon vier;
	JLabel wuerfelt4;
	ImageIcon fuenf;
	JLabel wuerfelt5;
	ImageIcon sechs;
	JLabel wuerfelt6;
	JLabel wuerfelL;
	ImageIcon test;
	JLabel wuerfelt;
	ImageIcon wuerfeln;
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
	JFrame frame02;
	JFrame mailFrame;
	JButton buttonWurf;
	JButton buttonVor;
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
	iBediener bediener = new Spiel();
	JFrame hauptf = new JFrame("Spiel 'Mensch aergere dich nicht!'");
	JPanel hauptp = new JPanel(new BorderLayout());
	JButton[] buttonArray = new JButton[72];
	private JTextArea ta = new JTextArea(8, 20);// fuer die Loggerfeld groesse
	private JScrollPane scroller;
	private boolean hatGewuerfelt;
	JButton mitte = new JButton("M");
	private final int x = 35;
	private final int y = 35;
	private final int a = 53;
	private final int b =  3;
	private final int c =  3;
	private boolean first=false;
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
	public void spielSpeichern() throws IOException{
		bediener.Speichern("MADN Spiel", "PDF");
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

		hauptf.setLocation(GetScreenWorkingWidth()/16, GetScreenWorkingHeight()/14);
		hauptf.setMenuBar(this.getMenuOben()); // erstellt Menue oben

		hauptf.setSize(GetScreenWorkingWidth()-450, GetScreenWorkingHeight()-50);   
		//hauptf.setExtendedState(Frame.MAXIMIZED_BOTH);
		// hauptf.setSize(1250, 1000);
		JLabel hauptl = new JLabel(feld);

		test = new ImageIcon("Bilder//eins.jpg");
		wuerfelL = new JLabel(test);
		//////////wuerfel anzeigen lassen
		
		eins = new ImageIcon ("Bilder//eins.jpg");
		wuerfelt1= new JLabel(eins);
		zwei = new ImageIcon ("Bilder//zwei.jpg");
		wuerfelt2= new JLabel(zwei);
		drei = new ImageIcon ("Bilder//drei.jpg");
		wuerfelt3= new JLabel(drei);
		vier = new ImageIcon ("Bilder//vier.jpg");
		wuerfelt4= new JLabel(vier);
		fuenf = new ImageIcon ("Bilder//fuenf.jpg");
		wuerfelt5= new JLabel(fuenf);
		sechs = new ImageIcon ("Bilder//sechs.jpg");
		wuerfelt6= new JLabel(sechs);

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
	@Override
	public void log(String text) {
	
		if(first==false){
			ta.setText(ta.getText() +text);
			first =true;
		}
		else{
		ta.setText(ta.getText()+ "\n" +text);// Wenn etwas im Logger gezweigt
												// werden soll einfach
		}									// log("inhalt"); aufrufen!
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

		ImageIcon feldn = new ImageIcon("Bilder//Feldw.png");
		ImageIcon Rot = new ImageIcon("Bilder//KreisR.gif");
		ImageIcon Blau = new ImageIcon("Bilder//KreisB.gif");
		ImageIcon Gelb = new ImageIcon("Bilder//KreisY.gif");
		ImageIcon Gruen = new ImageIcon("Bilder//KreisG.gif");

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

						buttonArray[53].setBounds(GetScreenWorkingWidth() / c -  4 * a,		
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
						buttonArray[71].setIcon(Gelb);

						buttonArray[69].setBounds(GetScreenWorkingWidth() / c,
								GetScreenWorkingHeight() / b + 3 * a, x, y);
						buttonArray[71].setIcon(Gelb);

						buttonArray[70].setBounds(GetScreenWorkingWidth() / c,
								GetScreenWorkingHeight() / b + 2 * a, x, y);
						buttonArray[71].setIcon(Gelb);

						buttonArray[71].setBounds(GetScreenWorkingWidth() / c,
								GetScreenWorkingHeight() / b + 1 * a, x, y);
						buttonArray[71].setIcon(Gelb);
				

		ImageIcon kreisY = new ImageIcon("Bilder//FigurGelb.png");

		buttonArray[16].setIcon(Rot);
		buttonArray[26].setIcon(Blau);
		buttonArray[36].setIcon(Gruen);
		buttonArray[46].setIcon(Gelb);
		
		
		buttonArray[68].setIcon(kreisY);

		buttonArray[69].setIcon(kreisY);

		buttonArray[70].setIcon(kreisY);

		buttonArray[71].setIcon(kreisY);

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
	
	public void Wuerfeln(){
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
		JTextField empfaengerFeld = new JTextField("");

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

//	public void mailSenden(){
//		bediener.mailSenden();
//	}

	// //////////////////////////////////////////////////////////////////////////////////

	// ein bild zu button:
	// JButton button = new JButton();
	// button.setIcon( icon1 );
	// frame.add( button );
	// frame.add( new JLabel( icon2 ) );
}
