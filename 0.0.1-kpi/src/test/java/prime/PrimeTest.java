package prime;

import org.junit.Test;

public class PrimeTest {
	
	@Test
	public void check()
	{
		Prime P1 = new Prime();
		int n = P1.prime(2);
		int y = P1.prime(5);
		int x = P1.prime(37);
		Prime P2 = new Prime();
		int a = P2.prime(34);
		int b = P2.prime(35);
	}

}
