public class KI_Aggressiv extends KI {

	private Spielfeld feld;
	private Spieler spieler;
	private Wuerfel w;
	private Spiel spiel;
	private boolean zugBeendet = false;

	public KI_Aggressiv(Spieler spieler) {
		super(spieler);

		if (zugBeendet == false) {
			gegnerSchlagen();
			zugBeendet = KIyn;
			if (zugBeendet == false) {
				figurenAufsFeld();
				zugBeendet = KIyn;
			}
			if (zugBeendet == false) {

				figurenInsEndfeld();

				zugBeendet = KIyn;
			}
		}

	}

}
/*
 * schlagen raus beenden
 */
