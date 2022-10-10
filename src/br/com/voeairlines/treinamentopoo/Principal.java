package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		algorit();
	}

	public static void algorit() {

		Scanner sc = new Scanner(System.in);

	
		System.out.println("Professor digite de número 1 para corrigir meu trabalho de POO final");
		int opcao = Integer.parseInt(sc.nextLine());
		switch (opcao) {

		
		// Algoritmo01
		case 1:
			AlgoritmoI alg1 = new AlgoritmoI();
			alg1.algoritmoI();
			
			// Algoritmo02
			case 2:
				AlgoritmoII alg2 = new AlgoritmoII();
				alg2.algoritmoII();

			// Algoritmo03
					case 3:
					AlgoritmoIII alg3 = new AlgoritmoIII();
					alg3.algoritmoIII();
					
					// Algoritmo04
						case 4:
						AlgoritmoIV alg4 = new AlgoritmoIV();
						String ma = alg4.imprimirMensagem4();
						System.out.println(ma);

						// Algoritmo05
							case 5:
							AlgoritmoV alg5 = new AlgoritmoV();
							alg5.algoritmoV();

							// Algoritmo06
						case 6:
							AlgoritmoVI alg6 = new AlgoritmoVI();
							alg6.algoritmoVI();

							// Algoritmo07 !!! CORRIGIR
							AlgoritmoVII alg7 = new AlgoritmoVII();
							alg7.algoritmoVII();

							// Algoritmo08
						case 8:
							AlgoritmoVIII alg8 = new AlgoritmoVIII();
							alg8.algoritmoVIII();

							// Algoritmo09
						case 9:
							AlgoritmoIX alg9 = new AlgoritmoIX();
							alg9.algoritmoIX();

							// Algoritmo10
						case 10:
							AlgoritmoX alg10 = new AlgoritmoX();
							alg10.algoritmoX();

							// Algoritmo11
						case 11:
							AlgoritmoXI alg11 = new AlgoritmoXI();
							alg11.algoritmoXI();

							// Algoritmo12
						case 12:
							AlgoritmoXII alg12 = new AlgoritmoXII();
							alg12.algoritmoXII();

							// Algoritmo13
						case 13:
							AlgoritmoXIII alg13 = new AlgoritmoXIII();
							alg13.algoritmoXIII();

							// Algoritmo14
						case 14:
							AlgoritmoXIV alg14 = new AlgoritmoXIV();
							alg14.algoritmoXIV();

							// Algoritmo15
						case 15:
							AlgoritmoXV alg15 = new AlgoritmoXV();
							alg15.algoritmoXV();

							// Algoritmo16
						case 16:
							AlgoritmoXVI alg16 = new AlgoritmoXVI();
							alg16.algoritmoXVI();

							// Algoritmo17
						case 17:
							AlgoritmoXVII alg17 = new AlgoritmoXVII();
							alg17.algoritmoXVII();

							// Algoritmo18
						case 18:
							AlgoritmoXVIII alg18 = new AlgoritmoXVIII();
							alg18.algoritmoXVIII();

							// Algoritmo19
						case 19:
							AlgoritmoXIX alg19 = new AlgoritmoXIX();
							alg19.algoritmoXIX();

							// Algoritmo20
						case 20:
							AlgoritmoXX alg20 = new AlgoritmoXX();
							alg20.algoritmoXX();

							// Algoritmo21
						case 21:
							AlgoritmoXXI alg21 = new AlgoritmoXXI();
							alg21.algoritmoXXI();

							// Algoritmo22
						case 22:
							AlgoritmoXXII alg22 = new AlgoritmoXXII();
							alg22.algoritmoXXII();

							// Algoritmo23
						case 23:
							AlgoritmoXXIII alg23 = new AlgoritmoXXIII();
							alg23.algoritmoXXIII();

							// Algoritmo24
						case 24:
							AlgoritmoXXIV alg24 = new AlgoritmoXXIV();
							alg24.algoritmoXXIV();

							// Algoritmo25
						case 25:
							AlgoritmoXXV alg25 = new AlgoritmoXXV();
							alg25.algoritmoXXV();

							// Algoritmo26
						case 26:
							AlgoritmoXXVI alg26 = new AlgoritmoXXVI();
							alg26.algoritmoXXVI();

		}
	sc.close();
	}
}

			
	
