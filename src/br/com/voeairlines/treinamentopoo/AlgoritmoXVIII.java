package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXVIII {

	// Algoritmo 18
	// Entrar com o raio de um círculo e imprimir a seguinte saída:
	// Perímetro
	// Área

	public void algoritmoXVIII() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int raio = 10;
		int resultado;

		resultado = raio / 2;

		System.out.println("A área do circulo é: " + resultado);
		System.out.println("O perimetro do circulo é: " + raio);
		Principal.algorit();

		sc.close();
	}

}
