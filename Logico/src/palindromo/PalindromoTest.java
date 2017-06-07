package palindromo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromoTest {

	private Palindromo palindromo;

	@Before
	public void setup() {
		palindromo = new Palindromo(); 
	}

	@Test
	public void TestCase01() {
		System.out.println("TEST 1:");
		Assert.assertTrue(palindromo.isPalindromo(" arara "));
	}
	
	@Test
	public void TestCase02() {
		System.out.println("\nTEST 2:");
		Assert.assertTrue(palindromo.isPalindromo("socorrammesubinoonibusemmarrocos"));
	}
	
	@Test
	public void TestCase03() {
		System.out.println("\nTEST 3:");
		Assert.assertFalse(palindromo.isPalindromo("socorrammes"));
	}	
	
	@Test
	public void TestCase04() {
		System.out.println("\nTEST 4:");
		Assert.assertTrue(palindromo.isPalindromo(""));
	}
}
