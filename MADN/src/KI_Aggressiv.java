public class KI_Aggressiv extends KI {

	private Spielfeld feld;
	private Spieler spieler;
	private Wuerfel w;
	private Spiel spiel;

	public KI_Aggressiv(Spieler spieler) {
		super(spieler);
		int i;
		for (i = 1; i <= 3; i++) {
			if (i == 1) {
				gegnerSchlagen();
			} else {
				if (i == 2) {
					figurenAufsFeld();

				} else {
					figurenInsEndfeld();

				}
			}

		}

	}

	private void aggressiv() {

		for (int i = 0; i < 4; i++) { // i = 0 ist die Farbe ROT
			for (int j = 0; j < 4; j++) {
				if (this.w.werfen() == 6) { // wenn man eine 6 würfel, dann erst
											// raus, this. weil dieser KI der
											// gerade dran ist gerade würfelt

					if (feld.getStartfelder()[i] != null) {
						if (feld.getSpielfelder()[1] == null) { // else
																// Bedingungen
																// NICHT
																// vergessen !

							// spieler.(feld.getStartfelder()[0][j]); // erste
							// rote Spielfigur auf Startfeld 1 (j)
							this.w.werfen();
							if (this.w.werfen() == 1) {
								if (feld.getSpielfelder()[2] != null) {
									spiel.GegnerSchlagen();

								}
							}
						}

					}

				}
			}
		}
	}
}
/*
 * schlagen raus beenden
 */
