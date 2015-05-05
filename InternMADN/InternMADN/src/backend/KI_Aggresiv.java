package backend;

import java.io.Serializable;

public class KI_Aggresiv extends KI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KI_Aggresiv(Spieler spieler, Spiel spiel) {
		super(spieler, spiel);
	}

	/**
	 * gibt eine Spielfigur weiter in zugDurchführen der Klasse Spiel mit
	 * folgender Priorität:1. schmeissen wenn nicht dann 2. Versuchen raus zu
	 * kommen wenn nicht dann 3. Versuche ins Endfeld wenn nicht dann 4. Figur
	 * im Spielfeld ziehen wenn nicht dann ist der nächste Spieler am Zug
	 */

	@Override
	public void kiZug() {

		if (KIGegnerSchlagen() != null) {
//			System.out.println("nr1");
			int id = KIGegnerSchlagen().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else if (KIaufStartSpielFeld() != null) {
//			System.out.println("nr2");
			int id = KIaufStartSpielFeld().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else if (KIinsEndfeld() != null) {
			int id = KIinsEndfeld().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else if (KIvor() != null) {
//			System.out.println("nr4");
			int id = KIvor().getID();
			super.getSpiel().zugDurchfuehren(id);

		} else
			super.getSpiel().setNaechster(super.getSpieler());
	}

}
