import java.util.ArrayList;

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
	 */
	private int spielerZaehler = 0;
	private int brettZaehler = 0;
	private int aktSpielerZaehler = 0;
	private Wuerfel w;
	private int[] spielFeldArray;
	protected boolean KIyn = false;
	int figZaehler = 0;
	private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

	/**
	 * @param fig
	 *            Spielfigur
	 *
	 * @param farbe
	 *            FarbEnum Farbe
	 */
	private Spielfigur fig;
	private FarbEnum farbe;

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
	public void entscheidungBeiSechs() {			//FIGANZAHLAUFFELD MUSS AUFGERUFENWERDEN

		 if (figZaehler ==0) {
			 aufStartSpielfeld();
			 System.out.println("Keine Figur auf den Feldern, eine Figur wir auf das Starfeld gesetzt.");
		 
		 }
		 else if(figZaehler!=4){
			
			 System.out.println("Moechtest du mit einer Figur ziehen oder eine neue auf das Startfeld setzen?");
			 //entscheidung zwischen figur.vor();	und aufStartSpielfeld();								//KONSOLEN EINGABE IMPLEMETIEREN
		 }
			 else{
				 
				 fig.vor();    //PROBLEM BEI VOR!!!
			 }
			 
		 
		
		 wuerfeln();

//		 Figur raus oder ziehen
//		 und nochmal wuerfeln

	}

	@Override
	public void welcheSpielfigurNutzen() {
		// auswahl zwischen den verfügbaren figuren geben,
		// (darauf achten ob im startfeld array oder nicht?)

	}

	public static boolean GegnerSchlagen() {
		// prüfen ob auch sicher Feindfigur
		// feindfigur zurückstellen
		//
		return false;
	}

	public int anzahlFigurenAufStartFeldern(FarbEnum farbe,
			Object[][][] farbeNamePosition) {
		figZaehler=0;
		if (farbe == FarbEnum.ROT) {
			for (int i = 0; i < farbeNamePosition.length; i++) {
				for (int j = 0; j < farbeNamePosition.length; j++) {
					for (int k = 0; k < farbeNamePosition.length; k++) {
						if (farbeNamePosition[i][j][k].equals("SR1")
								|| farbeNamePosition[i][j][k].equals("SR2")
								|| farbeNamePosition[i][j][k].equals("SR3")
								|| farbeNamePosition[i][j][k].equals("SR4")) {
							figZaehler++;
						}
					}
				}
			}
		}

		if (farbe == FarbEnum.BLAU) {
			for (int i = 0; i < farbeNamePosition.length; i++) {
				for (int j = 0; j < farbeNamePosition.length; j++) {
					for (int k = 0; k < farbeNamePosition.length; k++) {
						if (farbeNamePosition[i][j][k].equals("SB1")
								|| farbeNamePosition[i][j][k].equals("SB2")
								|| farbeNamePosition[i][j][k].equals("SB3")
								|| farbeNamePosition[i][j][k].equals("SB4")) {
							figZaehler++;
						}
					}
				}
			}
		}
		if (farbe == FarbEnum.GELB) {
			for (int i = 0; i < farbeNamePosition.length; i++) {
				for (int j = 0; j < farbeNamePosition.length; j++) {
					for (int k = 0; k < farbeNamePosition.length; k++) {
						if (farbeNamePosition[i][j][k].equals("SY1")
								|| farbeNamePosition[i][j][k].equals("SY2")
								|| farbeNamePosition[i][j][k].equals("SY3")
								|| farbeNamePosition[i][j][k].equals("SY4")) {
							figZaehler++;
						}
					}
				}
			}
		}

		if (farbe == FarbEnum.GRUEN) {
			for (int i = 0; i < farbeNamePosition.length; i++) {
				for (int j = 0; j < farbeNamePosition.length; j++) {
					for (int k = 0; k < farbeNamePosition.length; k++) {
						if (farbeNamePosition[i][j][k].equals("SG1")
								|| farbeNamePosition[i][j][k].equals("SG2")
								|| farbeNamePosition[i][j][k].equals("SG3")
								|| farbeNamePosition[i][j][k].equals("SG4")) {
							figZaehler++;
						}
					}
				}
			}
		}

		return figZaehler;
	}

	/**
	 * Greift auf die vor in Spielfigur zu um sie zu bewegen
	 */

	public static boolean figurBewegen() {
		// fig.vor();

		return false;
	}

}