package voo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VooTest {
		private Voo voo;

		@Before
		public void setup() {
			voo = new Voo();
		}

		@Test
		public void Teste_EntradasNegativas() {
			String pa = "-01:00";
			String cb = "-01:00";
			String pb = "-01:00";
			String ca = "-01:00";
			
			String valorEsperado = "Entradas invalidas";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_EntradasLimiteMinimo() {
			String pa = "00:00";
			String cb = "00:00";
			String pb = "00:00";
			String ca = "00:00";
			
			String valorEsperado = "0 0";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_EntradasValidasPaMenorPb() {
			String pa = "02:00";
			String cb = "10:00";
			String pb = "04:00";
			String ca = "08:00";
			
			String valorEsperado = "360 2";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_EntradasValidasPaMaiorPb() {
			String pa = "04:00";
			String cb = "10:00";
			String pb = "02:00";
			String ca = "08:00";
			
			String valorEsperado = "360 0";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}

		@Test
		public void Teste_EntradasLimiteMaximo() {
			String pa = "23:59";
			String cb = "23:59";
			String pb = "23:59";
			String ca = "23:59";
			
			String valorEsperado = "0 0";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_EntradasInvalidas() {
			String pa = "25:60";
			String cb = "25:60";
			String pb = "25:60";
			String ca = "25:60";
			
			String valorEsperado = "Entradas Invalidas";
			String valorReal = voo.CalculaVoo(pa, cb, pb, ca);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
}
