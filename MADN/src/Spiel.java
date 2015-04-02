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
	 * @param spielFeldArray Array der Spielfelder1-40
	 * 
	 */
	private int spielerZaehler = 0;
	private int brettZaehler = 0;
	private Wuerfel w;
//	private int[] spielFeldArray;
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
	 *             Exception wenn die Max Spielerzahl �berschritten wird
	 */
	@Override
	public void erstelleSpieler(String name, FarbEnum farbe) {
		if (spielerZaehler <= 3) {
			new Spieler(name, farbe);
			spielerZaehler++;
		} else
			throw new RuntimeException("Max Spielerzahl erreicht!");

	}

	/**
	 * erstellt das Spielbrett
	 * 
	 * 
	 * @throws wirft
	 *             Exception wenn die Max Anzahl an Spielbretter �berschritten
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
	 * L�sst das Spiel beginnen
	 * 
	 */
	@Override
	public void spielStarten() {
		if (spielerZaehler > 0 || brettZaehler == 1) {
			System.out.println("Das Spiel beginnt.");
			System.out.println("Spieler" + "" + "darf wuerfeln!");
			// zwischen die + + muss der akt Spieler eingef�gt werden
		}

	}

	/**
	 * Gibt dem Spieler die M�glichkeit zu wuerfeln
	 * 
	 */
	@Override
	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * @param farbe
	 *            Farbe der Spieler
	 * @return spielFeldArray[1] Start-Spielfeld der Frabe Rot
	 * @return spielFeldArray[11] Start-Spielfeld der Frabe Blau
	 * @return spielFeldArray[21] Start-Spielfeld der Frabe Gruen
	 * @return spielFeldArray[31] Start-Spielfeld der Frabe Gelb
	 */
//	 @Override
//	 public int aufStartSpielfeld() {      		//m�ssen anders an die Farbe kommen da getFarbe nicht mehr da//
//	 figur.getFarbe();
//	 switch (farbe) {
//	 case ROT:
//	 return spielFeldArray[0]; //index 0 = FeldID 1 ff.
//	 case BLAU:
//	 return spielFeldArray[10];
//	 case GRUEN:
//	 return spielFeldArray[20];
//	 case GELB:
//	 return spielFeldArray[30];
//	
//	 default:
//	 return (Integer) null;
//	 }
//	 }

	@Override
	public void entscheidungBeiSechs() {
		// Figur raus oder ziehen
		// und nochmal wuerfeln

	}

	@Override
	public void welcheSpielfigurNutzen() {
		// auswahl zwischen den verf�gbaren figuren geben,
		// (darauf achten ob im startfeld array oder nicht?)

	}

	public void GegnerSchlagen() {
		// pr�fen ob auch sicher Feindfigur
		// feindfigur zur�ckstellen
		//
	}

	// public int anzahlFigurenAufStartFeldern(FarbEnum farbe, ){
	// if(array[x] ==Sr1||==sr2.... dann Startfeld zaehler ++
	// return ;
	// }

	// @Override
	// public int aufStartSpielfeld() {
	//
	// return (Integer) null;
	// }
	
	/**
	 *Greift auf die vor in Spielfigur zu um sie zu bewegen
	 */
	//@Override
	public void figurBewegen(){
		
		
	}

}