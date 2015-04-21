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
			System.out.println("Gegner wurde geschlagen.");
			if (zugBeendet == false) {
				figurenAufsFeld();
				System.out.println("Figur wurden aus dem Startfeld aufs Spielfeld gesetzt.");
				zugBeendet = KIyn;
			}
			if (zugBeendet == false) {

				figurenInsEndfeld();
				System.out.println("Figur wurde ins Endfeld gesetzt.");

				zugBeendet = KIyn;
			}
		}

	}

}
