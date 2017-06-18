package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import janela.Janela2;

public class Janela2Test {

	private Janela2 janela2;

	@Before
	public void setup() {
		janela2 = new Janela2(); 
	}

	@Test
	public void TestCase01() {
		System.out.println("TEST 1:");
		Assert.assertEquals(3,janela2.calculaJanela(1,2,3));
	}
}
