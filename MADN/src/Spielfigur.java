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
	private String[] spielFeldArray;
	private String[][] startFeldArray;
	private String[][] endFeldArray;
	private Spieler Spieler;
	private Object[][][] farbeNamePosition = new Object[4][16][16];
	
	public void farbeNamePosZuordnung(){
	farbeNamePosition[0][0][0]=FarbEnum.ROT;
	farbeNamePosition[1][0][0]=FarbEnum.BLAU;
	farbeNamePosition[2][0][0]=FarbEnum.GELB;
	farbeNamePosition[3][0][0]=FarbEnum.GRUEN;
	
	farbeNamePosition[0][0][0]=  "FRot1";
	farbeNamePosition[0][1][0]=  "FRot2";
	farbeNamePosition[0][2][0]=  "FRot3";
	farbeNamePosition[0][3][0]=  "FRot4";
	
	farbeNamePosition[1][0][0]=  "FBlau1";
	farbeNamePosition[1][1][0]=  "FBlau2";
	farbeNamePosition[1][2][0]=  "FBlau3";
	farbeNamePosition[1][3][0]=  "FBlau4";
	
	farbeNamePosition[2][0][0]=  "FGelb1";
	farbeNamePosition[2][1][0]=  "FGelb2";
	farbeNamePosition[2][2][0]=  "FGelb3";
	farbeNamePosition[2][3][0]=  "FGelb4";
	
	farbeNamePosition[3][0][0]=  "FGruen1";
	farbeNamePosition[3][1][0]=  "FGruen2";
	farbeNamePosition[3][2][0]=  "FGruen3";
	farbeNamePosition[3][3][0]=  "FGruen4";
	
	farbeNamePosition[0][0][0]=  "SR1";
	farbeNamePosition[0][1][1]=  "SR2";
	farbeNamePosition[0][2][2]=  "SR3";
	farbeNamePosition[0][3][3]=  "SR4";

	farbeNamePosition[1][0][0]=  "SB1";
	farbeNamePosition[1][1][1]=  "SB2";
	farbeNamePosition[1][2][2]=  "SB3";
	farbeNamePosition[1][3][3]=  "SB4";
	
	farbeNamePosition[2][0][0]=  "SY1";
	farbeNamePosition[2][1][1]=  "SY2";
	farbeNamePosition[2][2][2]=  "SY3";
	farbeNamePosition[2][3][3]=  "SY4";
	
	farbeNamePosition[3][0][0]=  "SG1";
	farbeNamePosition[3][1][1]=  "SG2";
	farbeNamePosition[3][2][2]=  "SG3";
	farbeNamePosition[3][3][3]=  "SG4";
	}
	
	private Wuerfel w;

	/** Konstruktor der Spielfigur **/
	public Spielfigur(FarbEnum farbe) {

		this.setFarbe(farbe);

	}

	/**
	 * @param f
	 *            Farbe der Spielfigur
	 */
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
		
	}


	/**  */
	public String getPosSpielFelder(int x,Spielfigur fig) {

		return spielFeldArray[x];
		
	}
	public String getPosEndFelder(int x, int y,Spielfigur fig){
		
		return endFeldArray[x][y];
	}
	
	public void setPosImArray(String [] spielFeldArray,Object[][][] farbeNamePosition){
		
		
	}

	public void vor(Spielfigur fig, int pos) {
		int erg = 0;
		erg = pos + w.werfen();
		for (int i = pos; i < erg - 1; i++) {
			// if(Spielfeld.getSpielfeld(i)!= 0){

		}

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

