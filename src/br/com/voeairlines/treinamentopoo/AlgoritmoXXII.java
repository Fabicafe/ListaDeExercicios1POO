package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXXII {
	
	//Algoritmo 22 
	//Criar um algoritmo que calcule e imprima a área de um losango 

	public void algoritmoXXII() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int altura;
		int base;
		int area;

		System.out.println("Informe a base do losango");
		base = sc.nextInt();
		System.out.println("Informe a altura do losango");
		altura = sc.nextInt();
		area = base * altura;
		System.out.println(" A área do losango é : " + area);
		Principal.algorit();
		
		
		sc.close();

	}



}

