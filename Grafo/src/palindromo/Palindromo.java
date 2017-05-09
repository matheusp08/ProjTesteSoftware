package palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra;
		int contador_entrada, contador_texto, i, j;
		char[] texto = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;
		
		letra = sc.nextLine();
		while (!letra.isEmpty() && contador_entrada <= 10) {
			if (letra != " ") {
				texto[contador_texto] = letra.charAt(0);
				contador_texto++;
			}
			contador_entrada++;
			letra = sc.nextLine();
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
			System.out.println("SIM\n");
		} else {
			System.out.println("NAO\n");
		}
		sc.close();
	}
}


