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
		W�rfel w = new W�rfel();
		w.werfen();
	}

	@Test
	public void SpielerErzeugen() {
		Spieler s = new Spieler("Hans", 123, FarbEnum.ROT);
		Spieler s2 = new Spieler ("Oli", 567, FarbEnum.ROT);
	}

}
