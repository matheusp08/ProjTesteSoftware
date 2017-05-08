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
		public void Teste_ZeroClientesECaixas() {
			int C = 0;
			int N = 0;
			
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, null);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_TempoChegadaNegativoETempoAtendimentoZedo() {
			int C = 1;
			int N = 2;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("-1 0");
			tempos.add("0 1");
			
			int valorEsperado = -1;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_TempoChegadaETempoAtendimentoMaioresQueLimite() {
			int C = 3;
			int N = 4;
			
			ArrayList<String> tempos = new ArrayList<String>();
			tempos.add("0 1");
			tempos.add("1 5");
			tempos.add("300 10");
			tempos.add("310 11");
			
			int valorEsperado = -1;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_NumeroCaixasMaiorQueLimite() {
			int C = 11;
			int N = 0;
			
			int valorEsperado = -1;
			int valorReal = banco.CalculaClientesEmEspera(C, N, null);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}

		@Test
		public void Teste_LimiteMaximoNumeroCaixasEClientes() {
			int C = 10;
			int N = 1000;
			
			ArrayList<String> tempos = new ArrayList<String>();
			
			while(tempos.size() < N){
				for(int i = 0; i < 300; i++){
					if (tempos.size() == N)
						break;
					else
						tempos.add(i + " 1");
				}
			}
				
			int valorEsperado = 0;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
		
		@Test
		public void Teste_NumeroClientesMaiorQueLimite() {
			int C = 10;
			int N = 1001;
			
			ArrayList<String> tempos = new ArrayList<String>();
			
			while(tempos.size() < N){
				for(int i = 0; i < 300; i++){
					if (tempos.size() == N)
						break;
					else
						tempos.add(i + " 1");
				}
			}
				
			int valorEsperado = -1;
			int valorReal = banco.CalculaClientesEmEspera(C, N, tempos);
			
			Assert.assertEquals(valorEsperado, valorReal);
		}
}
