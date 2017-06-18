package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import janela.JanelaC2;

public class JanelaC2Test {

	private JanelaC2 janelaC2;

	@Before
	public void setup() {
		janelaC2 = new JanelaC2(); 
	}

	@Test
	public void TestCase01() {
		System.out.println("TEST 1:");
		Assert.assertEquals(3,janelaC2.calculaJanela(1,2,3));
	}
}
