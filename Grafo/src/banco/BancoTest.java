package banco;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BancoTest {
		private Banco banco;

		@Before
		public void setup() {
			banco = new Banco(); 
		}

		
		@Test
		public void TestCase1() {
			System.out.println("Test 1:");
			int N = 1;
			int C = 2;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("1 1");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase2() {
			System.out.println("Test 2:");
			int N = 4;
			int C = 3;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("1 1");
			tempos.add("1 10");
			tempos.add("3 10");
			tempos.add("3 1");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase3() {
			System.out.println("Test 3:");
			int N = 10;
			int C = 3;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("0 10");
			tempos.add("0 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			tempos.add("10 10");
			
			int valorEsperado = 2;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);

			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase4() {
			System.out.println("Test 4:");
			int N = 2;
			int C = 1;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("0 10");
			tempos.add("10 10");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
}
