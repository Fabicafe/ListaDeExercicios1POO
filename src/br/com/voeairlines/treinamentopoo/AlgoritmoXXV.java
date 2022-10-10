package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXV {

	// Algoritmo 25
	// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
	// fórmula: volume = 3.14159 * R² *altura

	public void algoritmoXXV() {

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
