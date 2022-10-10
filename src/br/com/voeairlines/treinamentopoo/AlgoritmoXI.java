package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXI {
	// Algoritmo 11
	// Ler um número real e imprimir a terça parte deste número

	public void algoritmoXI() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int num;
		double terco;

		System.out.println("Informe um número real");
		num = sc.nextInt();

		terco = num / 3;
		System.out.println("O terço do número informado é:" + terco);
		Principal.algorit();

		sc.close();

	}

}
