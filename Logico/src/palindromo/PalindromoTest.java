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
		Assert.assertFalse(palindromo.isPalindromo("teste"));
	}
	
	@Test
	public void TestCase03() {
		System.out.println("\nTEST 3:");
		Assert.assertTrue(palindromo.isPalindromo(" "));
	}
	
	@Test
	public void TestCase04() {
		System.out.println("\nTEST 4:");
		Assert.assertTrue(palindromo.isPalindromo(""));
	}
	
	@Test
	public void TestCase05() {
		System.out.println("\nTEST 5:");
		Assert.assertFalse(palindromo.isPalindromo("a b"));
	}
	
	@Test
	public void TestCase06() {
		System.out.println("\nTEST 6:");
		Assert.assertTrue(palindromo.isPalindromo("a"));
	}
	
	@Test
	public void TestCase07() {
		System.out.println("\nTEST 7:");
		Assert.assertFalse(palindromo.isPalindromo("bcca"));
	}
	
	@Test
	public void TestCase08() {
		System.out.println("\nTEST 8:");
		Assert.assertFalse(palindromo.isPalindromo("ab "));
	}
	
	@Test
	public void TestCase09() {
		System.out.println("\nTEST 9:");
		Assert.assertTrue(palindromo.isPalindromo("socorrammesubinoonibusemmarrocos"));
	}
	
	@Test
	public void TestCase10() {
		System.out.println("\nTEST 10:");
		Assert.assertFalse(palindromo.isPalindromo("socorrammes"));
	}
}
