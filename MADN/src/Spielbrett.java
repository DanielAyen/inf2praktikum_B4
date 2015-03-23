
/**
 * Die Klasse Spielbrett
 * 
 * 
 **/
public class Spielbrett {
	
	private Spielfeld feld;
	
	private Spielfeld   [] spielbrettArray = new Spielfeld [40];
	private Spielfeld [][] startFeldArray = new Spielfeld [4][4];
	private Spielfeld [][] zielFeldArray = new Spielfeld [4][4];
	
	
	
	public Spielbrett (Spielfeld feld, Spielfeld[] spielbrettArray,Spielfeld[][] startFeldArray, Spielfeld[][] zielFeldArray) {
		
		this.feld = feld;
		this.spielbrettArray = spielbrettArray;
		this.startFeldArray = startFeldArray;
		this.zielFeldArray = zielFeldArray;
	}

	public Spielfeld[] getSpielbrettArray() {
		return spielbrettArray;
	}

	public Spielfeld [][] getStartFeldArray() {
		return startFeldArray;
	}

	public Spielfeld[][] getZielFeldArray() {
		return zielFeldArray;
	}
}
