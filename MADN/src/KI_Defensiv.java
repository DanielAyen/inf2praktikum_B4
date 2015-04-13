public class KI_Defensiv extends KI {

	public KI_Defensiv(Spieler spieler) {
		super(spieler);
		int i;
		for(i=1; i<=3; i++){
			if (i==1){
				figurenInsEndfeld();
			}
			else{
				if(i==2){
					figurenAufsFeld();
					
				}
				else{
					gegnerSchlagen();
				}
			}

			
		}
	}

}

/*
 * beenden raus schlagen
 * 
 * laufen
 */
