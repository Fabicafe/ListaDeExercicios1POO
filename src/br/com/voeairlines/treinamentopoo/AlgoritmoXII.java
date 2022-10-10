package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXII {

	// Algoritmo 12
	// Entrar com dois números reais e imprimir a média aritmética com a mensagem
	// “média” antes do resultado

	public void algoritmoXII() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int num1;
		int num2;
		int media;

		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();

		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();

		media = num1 + num2 / 2;
		System.out.println("A média é:" + media);

		Principal.algorit();

		sc.close();

	}

}
