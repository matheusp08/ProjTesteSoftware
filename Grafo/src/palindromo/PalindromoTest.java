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
		System.out.println("TEST 1:");
		Assert.assertTrue(palindromo.isPalindromo(" arara "));
	}

	@Test
	public void TestCase2() {
		System.out.println("TEST 2:");
		Assert.assertFalse(palindromo.isPalindromo("teste"));
	}
	
	@Test
	public void TestCase3() {
		System.out.println("TEST 3:");
		Assert.assertTrue(palindromo.isPalindromo(" "));
	}
	
	@Test
	public void TestCase4() {
		System.out.println("TEST 4:");
		Assert.assertTrue(palindromo.isPalindromo(""));
	}
	
	@Test
	public void TestCase5() {
		System.out.println("TEST 5:");
		Assert.assertFalse(palindromo.isPalindromo("a b"));
	}
	
	@Test
	public void TestCase6() {
		System.out.println("TEST 6:");
		Assert.assertTrue(palindromo.isPalindromo("a"));
	}
	
	@Test
	public void TestCase7() {
		System.out.println("TEST 7:");
		Assert.assertFalse(palindromo.isPalindromo("bcca"));
	}
	
	@Test
	public void TestCase8() {
		System.out.println("TEST 8:");
		Assert.assertFalse(palindromo.isPalindromo("ab "));
	}
}
