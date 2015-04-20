/**
 * Die Klasse KI_Defensiv
 *
 */

public class KI_Defensiv extends KI {
	private boolean zugBeendet = false;

	/**
	 * 
	 * @param spieler Spieler
	 */
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
