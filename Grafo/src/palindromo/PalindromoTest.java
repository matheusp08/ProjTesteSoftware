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
	public void TestCase1() {
		Assert.assertTrue(palindromo.isPalindromo("arara"));
	}

	@Test
	public void TestCase2() {
		Assert.assertFalse(palindromo.isPalindromo("teste"));
	}
	
	@Test
	public void TestCase3() {
		Assert.assertTrue(palindromo.isPalindromo(" "));
	}
	
	@Test
	public void TestCase4() {
		Assert.assertTrue(palindromo.isPalindromo(""));
	}
	
	@Test
	public void TestCase5() {
		Assert.assertFalse(palindromo.isPalindromo("a b"));
	}
	
	@Test
	public void TestCase6() {
		Assert.assertTrue(palindromo.isPalindromo("a"));
	}
	
	@Test
	public void TestCase7() {
		Assert.assertFalse(palindromo.isPalindromo("bcca"));
	}
	
	@Test
	public void TestCase8() {
		Assert.assertTrue(palindromo.isPalindromo("aa "));
	}
}
