
public class Spielbrett {

	Spielfigur []   spielbrettArray;
	Spielfigur [][] startFeldArray;
	Spielfigur [][] zielFeldArray;
	
	public Spielbrett (){
		
		spielbrettArray = new Spielfigur[40];
		startFeldArray = new Spielfigur[4][4];
		zielFeldArray = new Spielfigur[4][4];

	}

}
