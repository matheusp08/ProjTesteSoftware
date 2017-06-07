package palindromo;

import java.util.Scanner;

public class Palindromo {

	public boolean isPalindromo(String palavra) {
		Scanner sc = new Scanner(palavra);
		boolean isPalindromo = false;
		String letra, resposta;
		int contador_entrada, contador_texto, i, j;
		char[] texto = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;

		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;

		int count = 0;
		
		sc.useDelimiter("");
		while (sc.hasNext() && contador_entrada <= 10) {
			count++;
			if (flag){
				System.out.println("P1-C1-C3");
				flag = false;
			}
			
			letra = sc.next();
			
			if (!letra.equals(" ")) {
				if (flag2){
					System.out.println("P2-C4");
					flag2 = false;
				}
				texto[contador_texto] = letra.charAt(0);
				contador_texto++;
			}
			else
			{
				if (flag3){
					System.out.println("!P2-!C4");
					flag3 = false;
				}
			}
			contador_entrada++;
		}	
				
		if(flag || count > 0){
			System.out.print("!P1-");
			if(sc.hasNext())
				System.out.print("C1-");
			else
				System.out.print("!C1-");

			if(contador_entrada <= 10)
				System.out.println("C3");
			else
				System.out.println("!C3");		
		}
		
		flag = true;
		flag2 = true;
		flag3 = true;
		
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		while (j > i) {
			if (flag){
				System.out.println("P3-C5");
				flag = false;
			}
			if (texto[i] != texto[j]) {
				if (flag2){
					System.out.println("P4-C6");
					flag2 = false;
				}
				palindromo = 0;
			}else{
				if (flag3){
					System.out.println("!P4-!C6");
					flag3 = false;
				}
			}
			j = j - 1;
			i = i + 1;
		}
		if(flag){
			System.out.println("!P3-!C5");
		}
		if (palindromo == 1) {
			System.out.println("P5-C7");
			isPalindromo = true;
			resposta = "SIM";
		} else {
			System.out.println("!P5-!C7");
			isPalindromo = false;
			resposta = "NAO";
		}
		sc.close();
		System.out.println("Resultado obtido: " + resposta);
		return isPalindromo;
	}

}
