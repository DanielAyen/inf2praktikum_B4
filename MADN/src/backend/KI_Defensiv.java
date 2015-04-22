package backend;

import java.io.Serializable;

public class KI_Defensiv extends KI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KI_Defensiv(Spieler spieler, Spiel spiel) {
		super(spieler, spiel);

	}

	/**
	 * gibt eine Spielfigur weiter in zugDurchfuehren der Klasse Spiel mit
	 * folgender Priorität: 1.Versuchen raus zu kommen, wenn nicht dann 2.
	 * Versuche ins Endfeld zu kommen, wenn nicht dann 3. Versuche Figur zu
	 * ziehen, wenn nicht dann 4. schmeissen wenn nicht dann ist der nächste
	 * Spieler am Zug
	 * 
	 */

	@Override
	public void kiZug() {

		if (KIinsEndfeld() != null) {
			int id = KIinsEndfeld().getID();
			super.getSpiel().zugDurchfuehren(id);
			
		} else if (KIaufStartSpielFeld() != null) {
			int id = KIaufStartSpielFeld().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else if (KIGegnerSchlagen() != null) {
			int id = KIGegnerSchlagen().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else if (KIvor() != null) {
			int id = KIvor().getID();
			super.getSpiel().zugDurchfuehren(id);
		}

		else
			super.getSpiel().setNaechster(super.getSpieler());
	}

}
