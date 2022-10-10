package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXVII {
	
	//Algoritmo 17
	//Entrar com a base e a altura de um retângulo e imprimir a seguinte saída: 
	//Perímetro 
	//Area 
	//Diagonal 

	public void algoritmoXVII() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		int altura;
		int base;
		int perimetro;
		int area;
		int diagonal;
		System.out.println("Informe a base do retângulo");
		base = sc.nextInt();
		System.out.println("Informe a altura retângulo");
		altura = sc.nextInt();

		area = base * altura;
		perimetro = base * 2 + altura * 2;
		diagonal = base * altura / 2;
		System.out.println(" o perimetro do retângulo é : " + perimetro);
		System.out.println(" A área do retângulo é : " + area);
		System.out.println(" A diagonal do retângulo é : " + diagonal + "\n");
		Principal.algorit();
		
		
		sc.close();

	}


}


