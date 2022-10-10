package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXIX {

	// Algoritmo 19
	// Entrar com o lado de um quadrado e imprimir
	// Perímetro
	// Area
	// Diagonal

	public void algoritmoXIX() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int altura;
		int base;
		int perimetro;
		int area;
		int diagonal;
		System.out.println("Informe a base do quadrado");
		base = sc.nextInt();
		System.out.println("Informe a altura quadrado");
		altura = sc.nextInt();

		area = base * altura;
		perimetro = base * 2 + altura * 2;
		diagonal = base * altura / 2;
		System.out.println(" o perimetro do quadrado é : " + perimetro);
		System.out.println(" A área do quadrado é : " + area);
		System.out.println(" A diagonal do quadrado é : " + diagonal + "\n");
		Principal.algorit();

		sc.close();

	}

}
