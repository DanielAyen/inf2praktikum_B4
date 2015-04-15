public class KI_Defensiv extends KI {
	private boolean zugBeendet = false;

	public KI_Defensiv(Spieler spieler) {
		super(spieler);
		if (zugBeendet == false) {
			figurenInsEndfeld();

			zugBeendet = KIyn;
			if (zugBeendet == false) {
				figurenAufsFeld();
				zugBeendet = KIyn;
			}
			if (zugBeendet == false) {
				gegnerSchlagen();

				zugBeendet = KIyn;
			}
		}
	}

}

/*
 * beenden raus schlagen
 * 
 * laufen
 */
