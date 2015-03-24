import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class JUnitTests {

//	@Ignore
//	@Before
//	public void davor() {
//		Spielfeld feld = new Spielfeld();
//	}

	@Test
	public void werfen() {
		Wuerfel w = new Wuerfel();
		w.werfen();
	}
	
	@Test
	public void FarbeTest(){
		Spieler spieler =new Spieler ("Alex", FarbEnum.GELB);
		spieler.getFarbe();
	}

	@Test
	public void SpielerErzeugen() {
		Spieler spieler = new Spieler("Hans", FarbEnum.ROT);
		Spieler spieler2 = new Spieler ("Oli", FarbEnum.GRUEN);
		System.out.println(spieler.toString());
		System.out.println(spieler2.toString());
	}
	
	@Test (expected = RuntimeException.class) //Exception erwartet, da Name zu kurz
		public void SpielerTest(){
		Spieler spieler = new Spieler ("a", FarbEnum.BLAU);
	}
	

	
	@Test
	public void gleicherSpielerTest(){
		Spieler spieler = new Spieler("Hans", FarbEnum.ROT);
		equals (spieler == spieler);	
	}
	

}
