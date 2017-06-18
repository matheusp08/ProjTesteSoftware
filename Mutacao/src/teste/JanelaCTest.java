package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import janela.JanelaC;

public class JanelaCTest {

	private JanelaC janelaC;

	@Before
	public void setup() {
		janelaC = new JanelaC(); 
	}

	@Test
	public void TestCase01() {
		System.out.println("TEST 1:");
		Assert.assertEquals(3,janelaC.calculaJanela(1,2,3));
	}
}
