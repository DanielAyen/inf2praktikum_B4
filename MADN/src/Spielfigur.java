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

		if (farbe == FarbEnum.ROT) {
			for (int i = 1; i <= 4; i++) {
				Spielfigur Roti;
			}
		} else if (farbe == FarbEnum.BLAU) {
			for (int i = 1; i <= 4; i++) {
				Spielfigur Blaui;
			}

		} else if (farbe == FarbEnum.GELB) {
			for (int i = 1; i <= 4; i++) {
				Spielfigur Gelbi;
			}

		} else if (farbe == FarbEnum.GRUEN) {
			for (int i = 1; i <= 4; i++) {
				Spielfigur Grueni;
			}

		}

		this.setFarbe(farbe);

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

	// /** @return endFeldArray gibt diePosition der Spielfigur zurueck **/
	// SPÄTER
	// public String[][] getPosi() {
	// return endFeldArray;
	//
	// }

	/** @return spielFeldArray gibt diePosition der Spielfigur zurueck **/
	public int getPos(int x) {

		return spielFeldArray[x]; // spielFeldArray[x] ist FeldID
	}

	public void vor(Spielfigur fig, int pos) {
		int erg = 0;
		erg = pos + w.werfen();
		for (int i = pos; i < erg - 1; i++) {
			// if(Spielfeld.getSpielfeld(i)!= 0){

		}
	}

	// sobald spielfiguren ueber ihren Konstruktor erstellt werden müssen sie
	// wissen dass ihre pos S+Farbe+zahl ist!
	public Object posFigurenRot() {

		return pos;
	}

	public Object posFigurenBlau() {

		return pos;
	}

	public Object posFigurenGelb() {

		return pos;
	}

	public Object posFigurenGruen() {

		return pos;
	}
	// public void bewegen(Spielfigur figur, int pos) {
	// int erg=0;
	// erg= pos + Wuerfel.werfen();
	// for(int i=pos;i<erg-1;i++){
	// if(Spielfeld.getNextElem()!=null){
	// Spielfeld.getNextElem().getFigur();
	// if(Spielfigur.getFarbe()==Spielfigur.getFarbe()){
	// throw new RuntimeException("Diese Figur kann nicht geschlagen werden");
	// }else{
	// Spielfeld.getNextElem().getFigur();
	// if(Spielfigur.getFarbe()!=Spielfigur.getFarbe()){
	// Spielfeld.getNextElem().setId(null);
	// Spieler.zurueckAufStart(figur);
	// Spieler.removeSpielfigur();
	//
	// }
	// }
	// }
	// if(Spielfeld.getNextElem()==null){
	// return;
	// }
	// }
	// pos= erg;
	//
	// }
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

