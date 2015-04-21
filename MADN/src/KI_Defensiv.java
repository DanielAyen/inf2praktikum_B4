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
			System.out.println("Figur wurde ins Endfeld gesetzt.");

			zugBeendet = KIyn;
			if (zugBeendet == false) {
				figurenAufsFeld();
				System.out.println("Figur wurden aus dem Startfeld aufs Spielfeld gesetzt.");
				zugBeendet = KIyn;
			}
			if (zugBeendet == false) {
				gegnerSchlagen();
				System.out.println("Gegner wurde geschlagen.");
				zugBeendet = KIyn;
			}
		}
	}

}
