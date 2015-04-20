/**
 *Die Klasse KI_Aggressiv
 *
 */
public class KI_Aggressiv extends KI {
	private boolean zugBeendet = false;
	
	/**
	 * 
	 * @param spieler Spieler
	 */

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
