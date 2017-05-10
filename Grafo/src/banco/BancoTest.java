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
			int N = 2;
			int C = 1;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("1 1");
			tempos.add("3 1");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase3() {
			int N = 3;
			int C = 1;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("1 10");
			tempos.add("1 10");
			tempos.add("1 2");
			
			int valorEsperado = 1;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase4() {
			int N = 3;
			int C = 2;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("1 10");
			tempos.add("1 10");
			tempos.add("1 5");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase5() {
			int N = 0;
			int C = -1;
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, null);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void TestCase6() {
			int N = 3;
			int C = 2;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("0 5");
			tempos.add("10 10");
			tempos.add("15 10");
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
}
