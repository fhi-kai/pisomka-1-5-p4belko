import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZajacieUsiTest {

	private ZajacieUsi zajacieUsi;

	@Before
	public void setup() {
		//TU vytvorte instanciu vasej triedy
		this.zajacieUsi = new MojeUsi();
	}


	@Test
	public void testZajacieUsi() {
		assertEquals(0, this.zajacieUsi.zajacieUsi( 0 ));
		assertEquals(2, this.zajacieUsi.zajacieUsi( 1 ));
		assertEquals(5, this.zajacieUsi.zajacieUsi( 2 ));
		assertEquals(7, this.zajacieUsi.zajacieUsi( 3 ));
	}

}
