package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest
{
private Currency cur;
	
	@Before
	public void setup(){
		 cur = new Currency("USD", 2);
	}
	
	@Test
	public void convertFromPlnTest() {
		assertEquals(6, cur.convertFromPLN(12), Double.MIN_VALUE);
	}
	
	@Test
	public void convertToPlnTest() {
		assertEquals(6, cur.convertToPLN(3), Double.MIN_VALUE);
	}
}