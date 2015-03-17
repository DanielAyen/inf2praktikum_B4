import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitTests {

	@Before
	public void davor() {
		Spielfeld feld = new Spielfeld();
	}

	
	@Test
	public void werfen(){
		Würfel w = new Würfel();
		w.werfen();
	}

}
