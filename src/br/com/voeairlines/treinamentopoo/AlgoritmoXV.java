package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXV {
	
	//Algoritmo 15
	//Antes de o racionamento de energia ser decretado, quase ninguém falava em
	//quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário.
	//Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
	//fazer um algoritmo que receba o valor do salário mínimo e a
	//quantidade de quilowatts gasta por uma residência e calcule. Imprima: 
	//Valor em reais de cada quilowatt 
	//Valor em reais a ser pago 
	//O novo valor a ser pago por essa residência com um desconto de 10% 

	
	public void algoritmoXV() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double salario;
		double qlw;
		double novosalario;
		double novoqlw;

		System.out.println("Informe o valor do salário minimo");
		salario = sc.nextDouble();
		System.out.println("Informe o valor em reais dos quilowatts gastos em sua residência");
		qlw = sc.nextDouble();
		novosalario = salario / 0.07;
		novoqlw = novosalario - 0.10;
		System.out.println("O valor do salário minimo é: " + salario);
		System.out.println("O valor em reais de cada quilowatts é: " + qlw);
		System.out.println("O novo valor da residência a ser pago é: " + novoqlw);
		Principal.algorit();

		sc.close();

	}

}
