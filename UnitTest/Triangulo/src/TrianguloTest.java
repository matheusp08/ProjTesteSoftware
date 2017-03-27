import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	private Triangulo triangulo;

	@Before
	public void setup() {
		triangulo = new Triangulo();
	}

	@Test
	public void Teste_EquilateroValido() {
		int a = 3;
		int b = 3;
		int c = 3;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "equilatero";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_EscalenoValido() {
		int a = 3;
		int b = 4;
		int c = 5;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "escaleno";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_IsoscelesValido_ABC() {
		int a = 3;
		int b = 3;
		int c = 4;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_IsoscelesValido_CBA() {
		int a = 3;
		int b = 3;
		int c = 4;
		String tipo = triangulo.VerificaTipoTriangulo(c, b, a);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_IsoscelesValido_BAC() {
		int a = 3;
		int b = 3;
		int c = 4;
		String tipo = triangulo.VerificaTipoTriangulo(b, a, c);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_LadosZero() // item 5 e 11
	{
		int a = 0;
		int b = 0;
		int c = 0;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "invalido";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_LadoNegativo() {
		int a = -3;
		int b = 3;
		int c = 4;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "invalido";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaABIgualC() {
		int a = 3;
		int b = 3;
		int c = 6;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaACIgualB() {
		int a = 3;
		int b = 6;
		int c = 3;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaBCIgualA() {
		int a = 6;
		int b = 3;
		int c = 3;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "isosceles";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaABMenorQueC() {
		int a = 3;
		int b = 3;
		int c = 7;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "invalido";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaACMenorQueB() {
		int a = 3;
		int b = 7;
		int c = 3;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "invalido";

		Assert.assertEquals(valorEsperado, tipo);
	}

	@Test
	public void Teste_SomaBCMenorQueA() {
		int a = 7;
		int b = 3;
		int c = 3;
		String tipo = triangulo.VerificaTipoTriangulo(a, b, c);
		String valorEsperado = "invalido";

		Assert.assertEquals(valorEsperado, tipo);
	}
}
