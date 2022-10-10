package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXI {

	// Algoritmo 21
	// Criar um algoritmo que calcule e imprima a área de um triângulo

	public void algoritmoXXI() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int altura;
		int base;
		int area;

		System.out.println("Informe a base do triângulo");
		base = sc.nextInt();
		System.out.println("Informe a altura do triângulo");
		altura = sc.nextInt();
		area = base * altura;
		System.out.println(" A área do triângulo é : " + area);
		Principal.algorit();

		sc.close();

	}

}
