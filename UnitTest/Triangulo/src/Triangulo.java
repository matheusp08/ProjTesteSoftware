
public class Triangulo 
{
	
	public String VerificaTipoTriangulo(int a, int b, int c)
	{
		if(a <= 0 || b <= 0 || c <= 0)
			return "invalido";
		
		if(a+b >= c && a+c >= b && b+c >= a)
		{
			if(a==b && b == c)
				return "equilatero";
			if(a==b || a==c || b==c)
				return "isosceles";
			return "escaleno";
		}
		
		return "invalido";
	}
	
}
