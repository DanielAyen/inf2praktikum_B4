import java.util.ArrayList;

/**
 * Die Klasse Spiel
 * */
public class Spiel implements iBediener {
	private Spielfeld feld;
	private Wuerfel w;
	private Spielfigur figur;
	private FarbEnum farbe;
	private Spielbrett brett;
	private int[] spielFeldArray;
	private int anzFigFarbeAufFeld;
	private ArrayList<Spieler> spieler = null;
	private Spielfeld ID;

	/**
	 * @return spieler gibt den aktuellen Spieler zurueck
	 * 
	 */
	@Override
	public ArrayList<Spieler> getSpieler() {
		return spieler;
	}

	@Override
	public Spieler aktiverSpieler() {
		return spieler.get(("aktiverSpieler"));
		/*
		 * public Spieler getSpielerAmZug(){ return
		 * spieler.get(d.toInt(dSp.get("spielerAmZug"))-1); }
		 */

	}

	/**
	 * @param spielerAnz
	 *            setzt die maximale Spieleranzahl fest
	 * 
	 * */
	@Override
	public void zaehlerSpielerMax(int spielerAnz) {
		// if (spielerAnz == 4) {
		// return false;
		// throw new RuntimeException("Es sind schon 4 Spieler erstellt.");
		// }
	}

	/**
	 * 
	 * @return spieler gibt den Spieler aus, der an der Reihe ist
	 */
	@Override
	public Spieler reihenfolgeSpieler() {
		if(){
			
		}
		return spieler;
		// spieler1
		// spieler2
		// spieler3
		// spieler4
		
		/*	
		 * 
		 * 
		 * public Spieler naechsterSpieler(){
		if (dSp.get("spielerAmZug").equals(dSp.get("anzahlSpieler"))){
			dSp.set("spielerAmZug",""+1);
			dSp.inc("runde");
		}
		else
			dSp.inc("spielerAmZug");
		Spieler sp=getSpielerAmZug();
		sp.neueRunde();
		return sp;
	}*/

	}

	/**
	 * 
	 * @param w
	 *            Parameter fuer den Wuerfel
	 */
	@Override
	public void nochmalWuerfeln() {
		w.werfen();

	}

	/**
	 * 
	 * @param anzFigFarbeAufFeld
	 *            Anzahl der Figuren auf dem Startfeld eines Spielers
	 * 
	 */
	@Override
	public void entscheidungBeiSechs() {
		if (anzFigFarbeAufFeld < 4) {
			System.out
					.println("Möchtest du dein Spieler aus dem Startbereich holen oder mit einer Figur ziehen?");
			// spieler rausholen oder mit welcher figur vor ()
		} else {
			figur.vor();
		}
		nochmalWuerfeln();

	}

	/**
	 * @param farbe
	 *            Farbe der Spieler
	 * @return spielFeldArray[1] Start-Spielfeld der Frabe Rot
	 * @return spielFeldArray[11] Start-Spielfeld der Frabe Blau
	 * @return spielFeldArray[21] Start-Spielfeld der Frabe Gruen
	 * @return spielFeldArray[31] Start-Spielfeld der Frabe Gelb
	 */
	@Override
	public int aufStartSpielfeld() {
		figur.getFarbe();
		switch (farbe) {
		case ROT:
			return spielFeldArray[1];
		case BLAU:
			return spielFeldArray[11];
		case GRUEN:
			return spielFeldArray[21];
		case GELB:
			return spielFeldArray[31];

		default:
			return (Integer) null;
		}
	}

	/**
	 * 
	 * @param istFeldBelegt
	 *            prüft ob ein Feld belegt ist
	 * @return
	 */
	@Override
	public void gegnerSchlagen() {
		if (istFeldBelegt() == true) {
			figur.getFarbe();
			if (this.farbe == farbe) {
				System.out
						.println("Du kannst ein Männchen deiner eigenen Farbe nicht Schlagen.");
				System.out.println("Der nächste Spieler ist nun am Zug.");
				return;
			} else {
				// Figur die geschlagen wurde auf StartFeld

			}
		}

	}

	/**
	 * @return true/false gibt aus ob ein Spielfeld belegt ist oder nicht
	 */
	@Override
	public boolean istFeldBelegt() {
		if (figur.getPos() == this.figur.getPos()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param prüft
	 *            wie viele Spielfiguren vorhanden sind
	 * 
	 */
	@Override
	public void welcheSpielfigurNutzen() {
		// wie viele im Feld?
	}

	/**
	 * 
	 * @param istZielfeldEndFeld
	 *            prüft ob ein Spielfeld ein Endfeld eines Spieler ist
	 */
	@Override
	public boolean istZielfeldEndfeld() {
		if (feld.getID().contains("E")) {
			return true;
		}
		return false;

	}

	/**
	 * @return anzFigFarbeAufFeld gibt die Anzahl der Spielfiguren aus, die
	 *         nicht auf Startfeld sind
	 */
	@Override
	public int figurenEinerFarbeAufFeld() {
		// 4 - anzFigAufStartfeld = anzFigFarbeAufFeld;
		return anzFigFarbeAufFeld;
	}

}

// Wenn schon 4 Spieler, kein neuer mehr
// wenn s1 rot, kann s2 nicht auch rot