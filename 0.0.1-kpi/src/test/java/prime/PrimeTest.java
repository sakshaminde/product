package prime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeTest {
	
	@Test
	public void check()
	{
		Prime P1 = new Prime();
		assertEquals(true,P1.prime(2));
		assertEquals(true,P1.prime(3));
		assertEquals(false,P1.prime(6));
		assertEquals(false,P1.prime(8));
	}

}
