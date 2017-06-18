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
    
    int resultado = janelaC.calculaJanela(0,0,0);
    
    System.out.println("Resultado Obtido: " + resultado);
    
    Assert.assertEquals(40000,resultado);
  }
  
  @Test
  public void TestCase02() {
    System.out.println("TEST 2:");
    
    int resultado = janelaC.calculaJanela(100,200,300);
    
    System.out.println("Resultado Obtido: " + resultado);
    
    Assert.assertEquals(20000,resultado);
  }
  
  @Test
  public void TestCase03() {
    System.out.println("TEST 3:");
    
    int resultado = janelaC.calculaJanela(400,400,400);
    
    System.out.println("Resultado Obtido: " + resultado);
    
    Assert.assertEquals(40000,resultado);
  }
  
  @Test
  public void TestCase04() {
    System.out.println("TEST 4:");
    
    int resultado = janelaC.calculaJanela(0,200,400);
    
    System.out.println("Resultado Obtido: " + resultado);
    
    Assert.assertEquals(0,resultado);
  }
  
  @Test
  public void TestCase05() {
    System.out.println("TEST 5:");
    
    int resultado = janelaC.calculaJanela(1,1,390);
    
    System.out.println("Resultado Obtido: " + resultado);
    
    Assert.assertEquals(20000,resultado);
  }
}