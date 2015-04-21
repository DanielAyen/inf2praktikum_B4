import java.io.PrintWriter;
import java.io.Serializable;

/**
 * Die Klasse Spieler
 * 
 * @param name
 *            Name des Spielers
 * @param farbe
 *            Das FarbEnum
 * @param fig
 *            Die Spielfigur
 * @param w
 *            Der Wuerfel
 **/

public class Spieler implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String name;
	private FarbEnum farbe;
	private Spielfigur fig;
	private Wuerfel w;
	private Spieler s;
	private Spiel spiel=new Spiel();

	// private KI ki;
	// private ArrayList<KI> ki = new ArrayList<KI>(); // fuer Komposition

	/**
	 * Konstruktor des Spielers
	 * 
	 * @param name
	 *            Name Des Spielers
	 * @param farbe
	 *            Das FarbEnum
	 **/
	public Spieler(String name, FarbEnum farbe) {
		setName(name);
		w = new Wuerfel();
		setFarbe(farbe);
		
		figurenErstellenundFarbe(farbe);
		
		// ki.getSpieler();
		// ki.add(new KI(this)); // fuer Komposition
	}
	
	
/**
 *4Figuren pro Farbe werden erstellt 
 *
 * @param farbe Farbe aus dem FarbEnum
 */
	public void figurenErstellenundFarbe(FarbEnum farbe) {
		
		if (farbe == FarbEnum.ROT) {
			Spielfigur FRot1= new Spielfigur(FarbEnum.ROT); 
			Spielfigur FRot2= new Spielfigur(FarbEnum.ROT);
			Spielfigur FRot3= new Spielfigur(FarbEnum.ROT);
			Spielfigur FRot4= new Spielfigur(FarbEnum.ROT);

		} else if (farbe == FarbEnum.BLAU) {
			Spielfigur FBlau1= new Spielfigur(FarbEnum.BLAU);
			Spielfigur FBlau2= new Spielfigur(FarbEnum.BLAU);
			Spielfigur FBlau3= new Spielfigur(FarbEnum.BLAU);
			Spielfigur FBlau4= new Spielfigur(FarbEnum.BLAU);

		} else if (farbe == FarbEnum.GELB) {
			Spielfigur FGelb1= new Spielfigur(FarbEnum.GELB);
			Spielfigur FGelb2= new Spielfigur(FarbEnum.GELB);
			Spielfigur FGelb3= new Spielfigur(FarbEnum.GELB);
			Spielfigur FGelb4= new Spielfigur(FarbEnum.GELB);

		} else if (farbe == FarbEnum.GRUEN) {
			Spielfigur FGruen1= new Spielfigur(FarbEnum.GRUEN); 
			Spielfigur FGruen2= new Spielfigur(FarbEnum.GRUEN);
			Spielfigur FGruen3= new Spielfigur(FarbEnum.GRUEN);
			Spielfigur FGruen4= new Spielfigur(FarbEnum.GRUEN);

	}
	}
	
	public void figurenAufStartfeldSetzen(String startFeldArray[][],Spielfigur x){
		
		
	}

	/**
	 * @return gibt gewuerfelte Zahl zurueck
	 */

	public void wuerfeln() {
		w.werfen();
	}

	/**
	 * @param name
	 *            Name des Spielers
	 * @throws RuntimeException
	 *             wenn kein Name oder ein zu kurzer Name eingegeben wurde
	 */
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new RuntimeException(
					"Der Name ist zu kurz! Bitte mehr als zwei Zeichen eingeben.");
		} else {
			this.name = name;
		}

	}

	/** @return n gibt den Namen des Spielers zurueck **/
	public String getName() {
		return name;
	}

	/**
	 * @param f
	 *            Farbe des Spielers
	 */
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}

	/** @return f gibt die Farbe des Spielers zurueck **/
	public FarbEnum getFarbe() {
		System.out.println("Du hast die Farbe " + farbe + " gewaehlt.");
		return farbe;
	}

	/** @return gibt Name, ID und Farbe des Spielers zurueck */
//	@Override
//	public String toString() {
//		return "Spieler " + getName() + " mit der Farbe " + getFarbe();
//	}

	/**
	 * @return Vergleicht (ueber eindeutigen Namen), ob Spieler wirklich DER
	 *         Spieler ist
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Spieler))
			return false;
		Spieler s = (Spieler) o;
		return (s.getName() == this.getName());
	}


	// public void spielerHinzufuegen(Spieler s){
	// if (anzSpieler>4){
	// throw new RuntimeException("Zu viele Spieler!");
	// }
	// for (int i=0; i<4;i++){
	// this.setS(s);
	// }
	// }

	public void setS(Spieler s) {
		this.s = s;
	}

	public Spieler getSpieler() {
		return s;

	}

	public void writeToStream(PrintWriter pw){
		pw.println(name+";"+farbe+";");
		pw.flush();
	}
	
	@Override
	public String toString(){
		return name+" "+farbe+" ";
	}


}
