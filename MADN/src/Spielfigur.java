import java.util.ArrayList;

/**
 * Die Klasse Spielfigur
 * 
 * @param farbe
 *            Farbe der Figur
 * @param FeldID
 *            ID des Spielfeldes
 * @param anzFarbe
 *            Anzahl der Spielfigurenfarbe, die jede Figur hat
 * @param spielFeldArray
 *            Felder des Spielfeldes
 * @param startFeldArray
 *            Felder der Startfelder
 * @param endFeldArray
 *            Felder der Endfelder
 * @param w
 *            Parameter fuer den Wuerfel
 **/

public class Spielfigur {

	private FarbEnum farbe;
	private static final int anzFarbe = 4;
	private Spielfeld feld;
	private int[] spielFeldArray;
	private String[][] startFeldArray;
	private String[][] endFeldArray;
	private Wuerfel w;

	/** Konstruktor der Spielfigur **/
	public Spielfigur(FarbEnum farbe) {
		this.setFarbe(farbe);
		w = new Wuerfel();

	}

	/**
	 * @param f
	 *            Farbe der Spielfigur
	 */
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}

	/** @return f gibt die Farbe der Spielfigur zurueck **/
	public FarbEnum getFarbe() {
		return farbe;
	}

	/** @return endFeldArray gibt diePosition der Spielfigur zurueck **/
	public String[][] getPosi() {
		return endFeldArray;

	}

	/** @return spielFeldArray gibt diePosition der Spielfigur zurueck **/
	public int[] getPos() {
		return spielFeldArray;
	}

	public void vor(Spielfigur fig, int pos) {
		int erg=0;
		erg= pos + w.werfen();
		for ( int i = pos; i < erg -1; i++){
			//if(Spielfeld.getSpielfeld(i)!= 0){
				
			}
		}
//		public void bewegen(Spielfigur figur, int pos) {
//			int erg=0;
//			erg= pos + Wuerfel.werfen();
//			for(int i=pos;i<erg-1;i++){
//				if(Spielfeld.getNextElem()!=null){
//					Spielfeld.getNextElem().getFigur();
//					if(Spielfigur.getFarbe()==Spielfigur.getFarbe()){
//						throw new RuntimeException("Diese Figur kann nicht geschlagen werden");
//					}else{
//						Spielfeld.getNextElem().getFigur();
//						if(Spielfigur.getFarbe()!=Spielfigur.getFarbe()){
//							Spielfeld.getNextElem().setId(null);
//							Spieler.zurueckAufStart(figur);
//							Spieler.removeSpielfigur();
//							
//							}
//						}
//					}
//					if(Spielfeld.getNextElem()==null){
//					return;
//				}
//			}
//			pos= erg;
//	 
//		}
	}

	//
	// public void gegnerSchlagen(){
	//
	// }
	//
	// public void feldBetreten(){
	// }

	//
	// public void aufStartfeldSetzen(){
	//
	// }

