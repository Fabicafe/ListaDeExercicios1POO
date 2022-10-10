package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXIV {

	public void algoritmoXIV() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double saldo;
		double novoSaldo;
		double reajuste = 0.01;

		System.out.println("Informe o saldo da aplicação");
		saldo = sc.nextInt();

		novoSaldo = (saldo / reajuste);
		System.out.println("O novo saldo é:" + novoSaldo);

		Principal.algorit();

		sc.close();

	}

}
