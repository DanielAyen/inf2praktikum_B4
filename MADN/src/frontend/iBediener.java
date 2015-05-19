package frontend;

import java.io.IOException;
import java.util.ArrayList;

import backend.Regelwerk;
import backend.Spielbrett;
import backend.Spieler;

public interface iBediener {
	
	/**
	 * Methode um einen Spieler hinzuzufuegen
	 * @param name des Spielers 
	 * @param farbe der gewaehlten Spilfigur 
	 */
	public void SpielerHinzufuegen(String name, String farbe, String ki);
	
	/**
	 * Methode um das Spiel zu initialisieren 
	 */
	public void initSpiel();
	
	public String[] zugDurchfuehren(String ID);
	public int wurf();
	public void addSpieler(Spieler s);
	public void setAmZug(Spieler amZug);
	public void setNaechster(Spieler amZug);
	public Regelwerk getRegelwerk();
	public Spielbrett getBrett();
	public ArrayList<Spieler> getSpieler();
	public Spieler getAmZug();
	public String getDateiname();
	public int getAnzahlSpieler();
	



	Object laden(String dateiname, String dateiende);
	void Speichern(String dateiname, String dateiende) throws IOException;

	
//________________________TestSituationen___________________________________________________//
//	void initTestSpiel();
//	void initTestSpielZugAggressiv();
//	void initTestSpielZugDefensiv();
//	public void zugDurchfuehrenSchmeissenTest(int ID);
//	public void zugDurchfuehrenEndfeldTest(int ID);

	
//___________________________________________________________________________________________--
	//void mailSenden();
	
	
}
