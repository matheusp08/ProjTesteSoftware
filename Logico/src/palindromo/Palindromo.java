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

		sc.useDelimiter("");
		while (sc.hasNext() && contador_entrada <= 10) {
			System.out.println("P1-C1-C2-C3");
			letra = sc.next();
			if (!letra.equals(" ")) {
				System.out.println("P2-C4");
				texto[contador_texto] = letra.charAt(0);
				contador_texto++;
			}
			contador_entrada++;
		}
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		while (j > i) {
			System.out.println("P3-C5");
			if (texto[i] != texto[j]) {
				System.out.println("P4-C6");
				palindromo = 0;
			}
			j = j - 1;
			i = i + 1;
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
