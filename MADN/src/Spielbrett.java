import java.util.ArrayList;

/**
 * Die Klasse Spielbrett
 * 
 * 
 **/
public class Spielbrett {
	
	
	private Spielfeld   [] spielbrettArray = new Spielfeld [40];
	private Spielfeld [][] startFeldArray = new Spielfeld [4][4];
	private Spielfeld [][] zielFeldArray = new Spielfeld [4][4];
	
	private ArrayList <Object> FeldID = new ArrayList <Object>();
	
	public Spielbrett (Spielfeld feld, Spielfeld[] spielbrettArray,Spielfeld[][] startFeldArray, Spielfeld[][] zielFeldArray) {
		
		FeldID.add(new Spielfeld(this));
		
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
