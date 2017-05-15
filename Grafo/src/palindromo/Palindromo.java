package palindromo;

import java.util.Scanner;

public class Palindromo {

	public boolean isPalindromo(String palavra) {
		System.out.print("Caminho: [1-");
		Scanner sc = new Scanner(palavra);
		boolean isPalindromo = false;
		String letra, resposta;
		int contador_entrada, contador_texto, i, j;
		char[] texto = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;

		sc.useDelimiter("");
		System.out.print("2-");
		while (sc.hasNext() && contador_entrada <= 10) {
			System.out.print("3-");
			letra = sc.next();
			if (!letra.equals(" ")) {
				System.out.print("4-");
				texto[contador_texto] = letra.charAt(0);
				contador_texto++;
			}
			contador_entrada++;
			System.out.print("5-2-");
		}
		System.out.print("6-");
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		System.out.print("7-");
		while (j > i) {
			System.out.print("8-");
			if (texto[i] != texto[j]) {
				System.out.print("9-");
				palindromo = 0;
			}
			j = j - 1;
			i = i + 1;
			System.out.print("10-7-");
		}
		System.out.print("11-");
		if (palindromo == 1) {
			System.out.print("12-");
			isPalindromo = true;
			resposta = "SIM";
		} else {
			System.out.print("13-");
			isPalindromo = false;
			resposta = "NAO";
		}
		System.out.println("14]");
		sc.close();
		System.out.println("Resultado obtido: " + resposta);
		return isPalindromo;
	}

}
