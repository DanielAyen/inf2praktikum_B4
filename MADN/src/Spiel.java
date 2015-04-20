import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Die Klasse Spiel
 * */
public class Spiel implements iBediener {

	/**
	 * @param spielerZaehler
	 *            zaehlt Anzahl der Spieler
	 * 
	 * @param brettZaehler
	 *            zaehlt Anzahl der Spielbretter
	 * 
	 * @param w
	 *            Wuerfel
	 * @param spielFeldArray
	 *            Array der Spielfelder1-40
	 * 
	 *            * @param fig Spielfigur
	 *
	 * @param farbe
	 *            FarbEnum Farbe
	 * 
	 */
	private int spielerZaehler = 0;
	private int brettZaehler = 0;
	private int aktSpielerZaehler = 0;
	private Wuerfel w;
	private int[] spielFeldArray;
	protected boolean KIyn = false;
	int figZaehler = 0;
	private ArrayList<Spieler> spieler = new ArrayList<Spieler>();
	Object[][][] farbeNamePosition;
	private Spielfigur fig;
	private FarbEnum farbe;
	Properties p = new Properties();
	iDatenzugriff dzCSV = new DatenzugriffCSV();
	iDatenzugriff dz = new DatenzugriffSerialisiert();

	@Override
	public void spielSpeichern(Properties p) {
		p.setProperty("Auswahl", "schreiben");
		try {
			dz.oeffnen(p);
			dz.schreiben(this);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				dz.schliessen(null);
			} catch (IOException fail) {
				System.out.println(fail.getMessage());
			}
		}
	}

	@Override
	public void spielSpeichernCSV(Properties p) {
		p.setProperty("Auswahl", "schreiben");
		try {
			dzCSV.oeffnen(p);
			dzCSV.schreiben(this);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				dzCSV.schliessen(null);
			} catch (IOException fail) {
				System.out.println(fail.getMessage());
			}
		}
	}

	@Override
	public void spielLaden(Properties p) {
		p.setProperty("Auswahl", "lesen");
		try {
			dz.oeffnen(p);
			dz.lesen();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				dz.schliessen(null);
			} catch (IOException fail) {
				System.out.println(fail.getMessage());
			}
		}
	}
	
	@Override
	public void spielLadenCSV(Properties p) {
		p.setProperty("Auswahl", "lesen");
		try {
			dz.oeffnen(p);
			dz.lesen();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				dz.schliessen(null);
			} catch (IOException fail) {
				System.out.println(fail.getMessage());
			}
		}
	}

	/**
	 * erstellt die einzelnen Spieler
	 * 
	 * @param name
	 *            Der Spielername
	 * 
	 * @param farbe
	 *            Die Farbe des Spielers
	 * 
	 * @throws wirft
	 *             Exception wenn die Max Spielerzahl überschritten wird
	 */
	@Override
	public void erstelleSpieler(String name, FarbEnum farbe) {
		if (spielerZaehler <= 3) {
			if (spieler.size() == 0) {

				Spieler SP1 = new Spieler(name, farbe);
				spielerZaehler++;
				spieler.add(SP1);
			}

			else if (spieler.size() == 1) {

				Spieler SP2 = new Spieler(name, farbe);
				spielerZaehler++;
				spieler.add(SP2);

			}

			else if (spieler.size() == 2) {

				Spieler SP3 = new Spieler(name, farbe);
				spielerZaehler++;
				spieler.add(SP3);

			}

			else if (spieler.size() == 3) {

				Spieler SP4 = new Spieler(name, farbe);
				spielerZaehler++;
				spieler.add(SP4);

			}

		} else
			throw new RuntimeException("Max Spielerzahl erreicht!");

	}

	/**
	 * erstellt das Spielbrett
	 * 
	 * 
	 * @throws wirft
	 *             Exception wenn die Max Anzahl an Spielbretter überschritten
	 *             wird
	 */
	@Override
	public void erstelleBrett() {
		if (brettZaehler == 0) {
			new Spielbrett();
			brettZaehler++;
		} else
			throw new RuntimeException("Es gibt schon ein Spielbrett!");
	}

	/**
	 * Lässt das Spiel beginnen
	 * 
	 */
	@Override
	public void spielStarten() {
		if (spielerZaehler > 0 || brettZaehler == 1) {
			System.out.println("Das Spiel beginnt.");
			System.out.println("Spieler" + getAktSpieler() + "darf wuerfeln!");

		}

	}

	/**
	 * 
	 * @return gibt den akt Spieler zurueck.
	 */
	private Spieler getAktSpieler() {
		switch (aktSpielerZaehler) {

		case 1:
			return spieler.get(0);

		case 2:
			return spieler.get(1);

		case 3:
			return spieler.get(2);

		case 4:
			return spieler.get(3);

		default:
			return null;
		}

	}

	/**
	 * Gibt dem Spieler die Möglichkeit zu wuerfeln
	 * 
	 */
	@Override
	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * Schaut welche Farbe die aufs Feld zustellende Figur hat um sie auf das
	 * richtige Feld zu setzen
	 * 
	 * @param farbe
	 *            Farbe der Spieler
	 * @return spielFeldArray[1] Start-Spielfeld der Frabe Rot
	 * @return spielFeldArray[11] Start-Spielfeld der Frabe Blau
	 * @return spielFeldArray[21] Start-Spielfeld der Frabe Gruen
	 * @return spielFeldArray[31] Start-Spielfeld der Frabe Gelb
	 */

	@SuppressWarnings("null")
	@Override
	public int aufStartSpielfeld() {

		fig.getFarbe();
		switch (farbe) {

		case ROT:
			KIyn = false;

			return spielFeldArray[0]; // index 0 = FeldID 1, index 1 = FeldID 2
										// ff.
		case BLAU:
			KIyn = false;

			return spielFeldArray[10];
		case GRUEN:
			KIyn = false;

			return spielFeldArray[20];
		case GELB:
			KIyn = false;

			return spielFeldArray[30];

		default:
			return (Integer) null;
		}
	}

	@Override
	public void entscheidungBeiSechs() {

		anzahlFigurenAufStartFeldern(farbe, farbeNamePosition); // Farbe v.
																// spieler muss
																// ueberg.
																// werden

		if (figZaehler == 0) {
			aufStartSpielfeld();
			System.out
					.println("Keine Figur auf den Feldern, eine Figur wir auf das Starfeld gesetzt.");

		} else if (figZaehler != 4) {

			System.out
					.println("Moechtest du mit einer Figur ziehen oder eine neue auf das Startfeld setzen?");
			// entscheidung zwischen figur.vor(); und aufStartSpielfeld();
			// //KONSOLEN EINGABE IMPLEMETIEREN
		} else {

			// fig.vor(); // PROBLEM BEI VOR!!!
		}

		wuerfeln();

	}

	@Override
	public void welcheSpielfigurNutzen(FarbEnum farbe,
			Object[][][] farbeNamePosition, int w) {// int w für gefürfelte
													// Zahl? wenn !=6 dann nur
													// die die nicht im SF sind
													// angeben

		if (farbe == FarbEnum.ROT) {
			if (w != 6) {

				for (int i = 0; i < farbeNamePosition[0].length; i++) {

					for (int j = 0; j < farbeNamePosition[0][i].length; j++) {

						if (farbeNamePosition[0][i][j] != "SR1"
								|| farbeNamePosition[0][i][j] != "SR2"
								|| farbeNamePosition[0][i][j] != "SR3"
								|| farbeNamePosition[0][i][j] != "SR4") {

							System.out.println("Mögliche Figur/-en:"
									+ farbeNamePosition[0][i][j]);

							// iwie noch die figur nutzbar machen

						}
					}

				}
			}

		}

		if (farbe == FarbEnum.BLAU) {

		}

		if (farbe == FarbEnum.GELB) {

		}

		if (farbe == FarbEnum.GRUEN) {

		}

		// auswahl zwischen den verfügbaren figuren geben,
		// (darauf achten ob im startfeld array oder nicht?)

	}

	public boolean GegnerSchlagen() {
		// prüfen ob auch sicher Feindfigur
		// feindfigur zurückstellen
		//
		return false;
	}

	public int anzahlFigurenAufStartFeldern(FarbEnum farbe,
			Object[][][] farbeNamePosition) {
		figZaehler = 0;
		if (farbe == FarbEnum.ROT) {

			if (farbeNamePosition[0][0][0].equals("SR1")
					|| farbeNamePosition[0][1][1].equals("SR2")
					|| farbeNamePosition[0][2][2].equals("SR3")
					|| farbeNamePosition[0][3][3].equals("SR4")) {
				figZaehler++;
			}

		}

		if (farbe == FarbEnum.BLAU) {

			if (farbeNamePosition[1][0][0].equals("SB1")
					|| farbeNamePosition[1][1][1].equals("SB2")
					|| farbeNamePosition[1][2][2].equals("SB3")
					|| farbeNamePosition[1][3][3].equals("SB4")) {
				figZaehler++;
			}

		}
		if (farbe == FarbEnum.GELB) {

			if (farbeNamePosition[2][0][0].equals("SY1")
					|| farbeNamePosition[2][1][1].equals("SY2")
					|| farbeNamePosition[2][2][2].equals("SY3")
					|| farbeNamePosition[2][3][3].equals("SY4")) {
				figZaehler++;
			}

		}

		if (farbe == FarbEnum.GRUEN) {

			if (farbeNamePosition[3][0][0].equals("SG1")
					|| farbeNamePosition[3][1][1].equals("SG2")
					|| farbeNamePosition[3][2][2].equals("SG3")
					|| farbeNamePosition[3][3][3].equals("SG4")) {
				figZaehler++;
			}

		}

		return figZaehler;
	}

	/**
	 * Greift auf die vor in Spielfigur zu um sie zu bewegen
	 */

	public boolean figurBewegen() {
		// fig.vor();

		return false;
	}

}