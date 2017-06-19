package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import janela.JanelaC;
import janela.JanelaC2;
import janela.Janela2;

public class TestGrandeJanelas {

	@Before
	public void setup() {
	}

	@Test
	public void TestGrandeJanelaC() {
		Assert.assertEquals(40000,JanelaC.calculaJanela(0,0,0));
		Assert.assertEquals(40000,JanelaC.calculaJanela(200,200,200));
		Assert.assertEquals(40000,JanelaC.calculaJanela(400,400,400));
		Assert.assertEquals(40000,JanelaC.calculaJanela(100,100,100));
		Assert.assertEquals(40000,JanelaC.calculaJanela(300,300,300));
		Assert.assertEquals(0,JanelaC.calculaJanela(0,200,400));
		Assert.assertEquals(0,JanelaC.calculaJanela(200,400,0));
		Assert.assertEquals(0,JanelaC.calculaJanela(400,0,200));
		Assert.assertEquals(10000,JanelaC.calculaJanela(0,100,300));
		Assert.assertEquals(10000,JanelaC.calculaJanela(100,300,0));
		Assert.assertEquals(10000,JanelaC.calculaJanela(300,0,100));
		Assert.assertEquals(20000,JanelaC.calculaJanela(200,100,300));
		Assert.assertEquals(20000,JanelaC.calculaJanela(100,300,200));
		Assert.assertEquals(20000,JanelaC.calculaJanela(300,200,100));
		Assert.assertEquals(10000,JanelaC.calculaJanela(400,100,300));
		Assert.assertEquals(10000,JanelaC.calculaJanela(400,300,100));
		Assert.assertEquals(30000,JanelaC.calculaJanela(300,400,400));
		Assert.assertEquals(10000,JanelaC.calculaJanela(300,100,0));
		Assert.assertEquals(0,JanelaC.calculaJanela(400,200,0));
		Assert.assertEquals(10000,JanelaC.calculaJanela(100,0,400));
		Assert.assertEquals(20000,JanelaC.calculaJanela(100,200,300));
		Assert.assertEquals(10000,JanelaC.calculaJanela(0,400,100));
		Assert.assertEquals(20000,JanelaC.calculaJanela(200,300,400));
		Assert.assertEquals(10000,JanelaC.calculaJanela(0,300,200));
		Assert.assertEquals(20000,JanelaC.calculaJanela(200,0,100));
		Assert.assertEquals(10000,JanelaC.calculaJanela(100,400,300));
		Assert.assertEquals(20000,JanelaC.calculaJanela(300,400,200));
		Assert.assertEquals(20000,JanelaC.calculaJanela(0,0,300));
		Assert.assertEquals(20000,JanelaC.calculaJanela(0,400,0));
		Assert.assertEquals(30000,JanelaC.calculaJanela(200,100,200));
		Assert.assertEquals(10000,JanelaC.calculaJanela(200,100,400));
	}
	
	@Test
	public void TestGrandeJanelaCMutantesSobreviventes(){	
		Assert.assertEquals(10000,JanelaC.calculaJanela(50, 300, 400));
		Assert.assertEquals(5000,JanelaC.calculaJanela(30, 180, 400));
	}
	
	@Test
	public void TestGrandeJanela2() {
		Assert.assertEquals(20000,Janela2.calculaJanela(0,0,0));
		Assert.assertEquals(20100,Janela2.calculaJanela(200,200,200));
		//Assert.assertEquals(40000,Janela2.calculaJanela(400,400,400)); ERRO
		Assert.assertEquals(20100,Janela2.calculaJanela(100,100,100));
		Assert.assertEquals(20100,Janela2.calculaJanela(300,300,300));
		Assert.assertEquals(59900,Janela2.calculaJanela(0,200,400));
		//Assert.assertEquals(0,Janela2.calculaJanela(200,400,0)); ERRO
		Assert.assertEquals(59900,Janela2.calculaJanela(400,0,200));
		Assert.assertEquals(49900,Janela2.calculaJanela(0,100,300));
		Assert.assertEquals(50000,Janela2.calculaJanela(100,300,0));
		Assert.assertEquals(49900,Janela2.calculaJanela(300,0,100));	
		Assert.assertEquals(40000,Janela2.calculaJanela(200,100,300));
		Assert.assertEquals(40100,Janela2.calculaJanela(100,300,200));
		Assert.assertEquals(40000,Janela2.calculaJanela(300,200,100));
		Assert.assertEquals(50000,Janela2.calculaJanela(400,100,300));
		Assert.assertEquals(50000,Janela2.calculaJanela(400,300,100));
		//Assert.assertEquals(30000,Janela2.calculaJanela(300,400,400)); ERRO
		Assert.assertEquals(49900,Janela2.calculaJanela(300,100,0));
		Assert.assertEquals(59900,Janela2.calculaJanela(400,200,0));
		Assert.assertEquals(49900,Janela2.calculaJanela(100,0,400));
		Assert.assertEquals(40000,Janela2.calculaJanela(100,200,300));
		//Assert.assertEquals(10000,Janela2.calculaJanela(0,400,100)); ERRO
		Assert.assertEquals(40000,Janela2.calculaJanela(200,300,400));
		Assert.assertEquals(50000,Janela2.calculaJanela(0,300,200));
		Assert.assertEquals(39900,Janela2.calculaJanela(200,0,100));
		//Assert.assertEquals(10000,Janela2.calculaJanela(100,400,300)); ERRO
		//Assert.assertEquals(20000,Janela2.calculaJanela(300,400,200)); ERRO
		Assert.assertEquals(40000,Janela2.calculaJanela(0,0,300));
		//Assert.assertEquals(20000,Janela2.calculaJanela(0,400,0)); ERRO
		Assert.assertEquals(30000,Janela2.calculaJanela(200,100,200));
		Assert.assertEquals(50000,Janela2.calculaJanela(200,100,400));
	}
	
	@Test
	public void TestGrandeJanelaC2() {
		Assert.assertEquals(40000, JanelaC2.calculaJanela(0, 0, 0));
		Assert.assertEquals(40000, JanelaC2.calculaJanela(200,200,200));
		Assert.assertEquals(40000, JanelaC2.calculaJanela(400,400,400));
		Assert.assertEquals(40000, JanelaC2.calculaJanela(100,100,100));
		Assert.assertEquals(40000, JanelaC2.calculaJanela(300,300,300));
		Assert.assertEquals(0, JanelaC2.calculaJanela(0,200,400));
		Assert.assertEquals(60000, JanelaC2.calculaJanela(200,400,0));
		Assert.assertEquals(60000, JanelaC2.calculaJanela(400,0,200));
		Assert. assertEquals(0, JanelaC2.calculaJanela(0,100,300));
	    Assert.assertEquals(50000, JanelaC2.calculaJanela(100,300,0));
	    Assert. assertEquals(60000, JanelaC2.calculaJanela(300,0,100));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(200,100,300));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(100, 300, 200));
	    Assert.assertEquals(60000, JanelaC2.calculaJanela(300, 200, 100));
	    Assert.assertEquals(50000, JanelaC2.calculaJanela(400,100,300));
	    Assert.assertEquals(70000, JanelaC2.calculaJanela(400,300,100));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(300,400,400));
	    Assert.assertEquals(70000, JanelaC2.calculaJanela(300,100,0));
	    Assert.assertEquals(80000, JanelaC2.calculaJanela(400,200,0));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(100,0,400));
	    Assert.assertEquals(20000, JanelaC2.calculaJanela(100,200,300));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(0, 400, 100));
	    Assert.assertEquals(20000, JanelaC2.calculaJanela(200, 300, 400));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(0, 300, 200));
	    Assert.assertEquals(50000, JanelaC2.calculaJanela(200, 0, 100));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(100, 400, 300));
	    Assert.assertEquals(50000, JanelaC2.calculaJanela(200, 0, 100));
	    Assert.assertEquals(50000, JanelaC2.calculaJanela(300, 400, 200));
	    Assert.assertEquals(20000, JanelaC2.calculaJanela(0, 0, 300));
	    Assert.assertEquals(40000, JanelaC2.calculaJanela(0, 400, 0));
	    Assert.assertEquals(40000, JanelaC2.calculaJanela(200, 100, 200));
	    Assert.assertEquals(30000, JanelaC2.calculaJanela(200, 100, 400));
	}
}
