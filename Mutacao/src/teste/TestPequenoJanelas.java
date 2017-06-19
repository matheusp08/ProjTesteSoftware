package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import janela.JanelaC;
import janela.JanelaC2;
import janela.Janela2;

public class TestPequenoJanelas {

	@Before
	public void setup() {
	}

	@Test
	public void TestPequenoJanelaC() {
		Assert.assertEquals(40000,JanelaC.calculaJanela(0,0,0));
		Assert.assertEquals(20000,JanelaC.calculaJanela(100,200,300));
		Assert.assertEquals(40000,JanelaC2.calculaJanela(400,400,400));
		Assert.assertEquals(0,JanelaC.calculaJanela(0,200,400));
		Assert.assertEquals(20000,JanelaC.calculaJanela(1,1,390));
	}
	
	@Test
	public void TestPequenoJanelaC2() {
		Assert.assertEquals(40000,JanelaC2.calculaJanela(0,0,0));
		Assert.assertEquals(20000,JanelaC2.calculaJanela(100,200,300));
		Assert.assertEquals(40000,JanelaC2.calculaJanela(400,400,400));
		Assert.assertEquals(0,JanelaC2.calculaJanela(0,200,400));
		Assert.assertEquals(20000,JanelaC2.calculaJanela(1,1,390));
	}
	
	@Test
	public void TestPequenoJanela2() {
		Assert.assertEquals(20000,Janela2.calculaJanela(0,0,0));
		Assert.assertEquals(40000,Janela2.calculaJanela(100,200,300));
		//Assert.assertEquals(40000,Janela2.calculaJanela(400,400,400)); ERRO
		Assert.assertEquals(59900,Janela2.calculaJanela(0,200,400));
		Assert.assertEquals(40100,Janela2.calculaJanela(1,1,390));
	}
}
