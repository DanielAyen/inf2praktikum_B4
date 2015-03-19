import java.util.ArrayList;


/**
 * Die Klasse Spielfigur
 * 
 * @param farbe
 *            Farbe der Figur
 * @param FeldID
 *            ID des Spielfeldes 
 * @param anzahlFig
 * 			  Anzahl der Spielfiguren, die jede Farbe hat
 * @param w
 * 			  Parameter fuer den Wuerfel
 **/

public class Spielfigur {
	
	private FarbEnum farbe;
	private ArrayList<Object> FeldID = new ArrayList<Object>();
	private static final int anzahlFig=4;
	private Wuerfel w;
	
	/** Konstruktor der Spielfigur**/
	public Spielfigur(FarbEnum farbe){
		w = new Wuerfel();
		FeldID= new ArrayList<Object>();
		this.farbe=farbe;
		
	}
	
	/**
	 * @param f Farbe der Spielfigur 
	 */
	public void setFarbe(FarbEnum farbe){
		this.farbe=farbe;
	}
	
	/** @return f gibt die Farbe der Spielfigur zurueck **/
	public FarbEnum getFarbe() {
		return farbe;
	}
	
	
	public void vor(){
		w.werfen();
		
		
		}
	
	public void aufStartfeldSetzen(){
		
		}
	}
	
	
	