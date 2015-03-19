
public class Spielbrett {

	private Spielfeld feld;
	
	private Spielfigur []   spielbrettArray = new Spielfigur [40];
	private Spielfigur [][] startFeldArray = new Spielfigur [4][4];
	private Spielfigur [][] zielFeldArray = new Spielfigur [4][4];
	
	public Spielbrett(Spielfeld feld, Spielfigur[] spielbrettArray,Spielfigur[][] startFeldArray, Spielfigur[][] zielFeldArray) {

		this.feld = feld;
		this.spielbrettArray = spielbrettArray;
		this.startFeldArray = startFeldArray;
		this.zielFeldArray = zielFeldArray;
	}


	public Spielfigur[] getSpielbrettArray() {
		return spielbrettArray;
	}


	public Spielfigur[][] getStartFeldArray() {
		return startFeldArray;
	}


	public Spielfigur[][] getZielFeldArray() {
		return zielFeldArray;
	}

	
	

}
