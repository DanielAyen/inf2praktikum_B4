import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class JUnitTests {

	@Before
	public void davor() {
		Spielfeld feld = new Spielfeld();
	}

	@Test
	public void werfen() {
		Wuerfel w = new Wuerfel();
		w.werfen();
	}

	@Test
	public void SpielerErzeugen() {
		Spieler spieler = new Spieler("Hans", FarbEnum.ROT);
		Spieler spieler2 = new Spieler ("Oli", FarbEnum.ROT);
	}
	
	@Test
	public void FarbeTest(){
		Spieler spieler =new Spieler ("Alf", FarbEnum.GELB);
		spieler.getFarbe();
	}
	

}
