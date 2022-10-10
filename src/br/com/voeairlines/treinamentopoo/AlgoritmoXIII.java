package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXIII {
	// Algoritmo 13
	// Entrar com quatro números e imprimir a média ponderada, sabendo-se que os
	// pesos são respectivamente: 1,2,3 e 4

	public void algoritmoXIII() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int num1;
		int num2;
		int num3;
		int num4;

		@SuppressWarnings("unused")
		int mp;

		System.out.println("Entre com o primeiro número");
		num1 = sc.nextInt();

		System.out.println("Entre com o segundo número");
		num2 = sc.nextInt();

		System.out.println("Entre com o terceiro número");
		num3 = sc.nextInt();

		System.out.println("Entre com o quarto número");
		num4 = sc.nextInt();

		mp = (num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4) / 10;
		System.out.println("A média ponderada é:");

		Principal.algorit();

		sc.close();

	}

}
