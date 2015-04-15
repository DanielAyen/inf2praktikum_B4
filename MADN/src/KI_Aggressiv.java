public class KI_Aggressiv extends KI {

	private Spielfeld feld;
	private Spieler spieler;
	private Wuerfel w;
	private Spiel spiel;
private boolean zugBeendet=false;

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
	
	
	if(zugBeendet==false){
		gegnerSchlagen();
		return zugBeendet;
		if(zugBeendet==false){
			figurenAufsFeld();
			return zugBeendet;
		}
		if(zugBeendet==false){
			
			figurenInsEndfeld();
			
		return zugBeendet;
		}
	}
	
	
	
	

}
/*
 * schlagen raus beenden
 */
