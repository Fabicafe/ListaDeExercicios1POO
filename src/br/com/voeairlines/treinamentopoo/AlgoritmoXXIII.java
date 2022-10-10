package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXIII {

	// Algoritmo 23
	// Entrar com nome e idade. Imprimir a seguinte saída
	// Nome
	// Idade

	public void algoritmoXXIII() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String nome;
		int idade;
		System.out.println("Informe o nome");
		nome = sc.nextLine();
		System.out.println("Informe a idade");
		idade = sc.nextInt();
		System.out.println("O nome é: " + nome);
		System.out.println("O idadeé: " + idade + "\n");

		Principal.algorit();

		sc.close();

	}

}
