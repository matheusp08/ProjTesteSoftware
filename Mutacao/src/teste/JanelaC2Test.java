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
		int resultado = janelaC2.calculaJanela(1,2,3);
		
		System.out.println("Resultado Obtido: " + resultado);
		Assert.assertEquals(39800, resultado);
	}
	
	  @Test
	  public void TestCase02() {
	    System.out.println("TEST 2:");
	    
	    int resultado = janelaC2.calculaJanela(100,200,300);
	    
	    System.out.println("Resultado Obtido: " + resultado);
	    
	    Assert.assertEquals(20000,resultado);
	  }
	  @Test
	  public void TestCase03() {
	    System.out.println("TEST 3:");
	    
	    int resultado = janelaC2.calculaJanela(100,199,400);
	    
	    System.out.println("Resultado Obtido: " + resultado);
	    
	    Assert.assertEquals(10100,resultado);
	  }
	  
	  @Test
	  public void TestCase04() {
	    System.out.println("TEST 4:");
	    
	    int resultado = janelaC2.calculaJanela(0,300,400);
	    
	    System.out.println("Resultado Obtido: " + resultado);
	    
	    Assert.assertEquals(10000,resultado);
	  }
	  
	  @Test
	  public void TestCase05() {
	    System.out.println("TEST 5:");
	    
	    int resultado = janelaC2.calculaJanela(0,200,400);
	    
	    System.out.println("Resultado Obtido: " + resultado);
	    
	    Assert.assertEquals(0,resultado);
	  }
}
