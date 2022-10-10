package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXIV {
	// Ler uma temperatura em graus centígrados e apresentá-la convertida em graus
	// Fahrenheit. A fórmula de conversão é :
	// Onde F é a temperatura em Fahrenheit e C é a temperatura em centígrados.

	public void algoritmoXXIV() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double graus;
		double fahrenheit;

		System.out.println("Informe a temperatura em graus");
		graus = sc.nextDouble();
		fahrenheit = (1.8 * graus + 32);
		System.out.println(" A temperatura convertida em graus fahrenheit é : " + fahrenheit + "\n");
		Principal.algorit();

		sc.close();

	}

}
