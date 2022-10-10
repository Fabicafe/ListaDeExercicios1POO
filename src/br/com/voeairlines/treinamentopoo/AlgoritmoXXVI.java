package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXVI {

	// Algoritmo 26
	// Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula
	// de prestação =
	// valor+(valor*(taxa/100)*tempo).

	public void algoritmoXXVI() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double prestacao;
		double valor;
		double taxa;
		double tempo = 72;

		System.out.println("Sabendo que a taxa de juros é de 5% ao dia");
		System.out.println("Sabendo que a mercadoria está atrasada a 3 dias");
		System.out.println("-----");
		System.out.println("Informe o valor da prestação");

		System.out.println("-----");

		taxa = (0.15 / 100) * tempo;
		valor = sc.nextDouble();
		prestacao = valor + (valor * (taxa / 100) * tempo);
		System.out.println("O valor da prestação da multa em atraso é de:" + prestacao + "\n");

		Principal.algorit();

		sc.close();
	}

}
