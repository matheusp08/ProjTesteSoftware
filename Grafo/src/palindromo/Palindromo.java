package palindromo;

import java.util.Scanner;

public class Palindromo {

	 public boolean isPalindromo(String palavra) {
		Scanner sc = new Scanner(palavra);
		boolean isPalindromo = false;
		String letra;
		int contador_entrada, contador_texto, i, j;
		char[] texto = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;
		
		sc.useDelimiter("");
		
		while (sc.hasNext() && contador_entrada <= 10) {
			letra = sc.next();
			if (!letra.equals(" ")) {
				texto[contador_texto] = letra.charAt(0);
				contador_texto++;
			}
			contador_entrada++;
		}
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		while (j > i) {
			if (texto[i] != texto[j]) {
				palindromo = 0;
			}
			j = j - 1;
			i = i + 1;
		}
		if (palindromo == 1) {
			isPalindromo = true;
			System.out.println("SIM\n");
		} else {
			isPalindromo = false;
			System.out.println("NAO\n");
		}
		sc.close();
		return isPalindromo;
	}
	
}


