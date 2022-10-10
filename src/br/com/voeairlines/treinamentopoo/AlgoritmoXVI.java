package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoXVI {
	//Algoritmo 16 
	//Entrar com um nome e imprimir 
	//Todo nome 
	//Primeiro caractere 
	//Ultimo caractere 
	//Do primeiro ate o terceiro 
	//Quarto caractere 
	//Todos menos o primeiro 
	//Os dois últimos
	
	
	public void algoritmoXVI() {
				
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		System.out.println("Informe o nome");
		nome = sc.nextLine();

		//Nome
		System.out.println("O nome digitado é: " + nome);
		
		// primeiro caractere
		System.out.println("O primeiro caractere do nome é: " + nome.charAt(0));
		
		//Ultimo caractere
		char lastChar = nome.charAt(nome.length() - 1);
		System.out.println("A ultima letra do nome é: " + lastChar);
		
		//Terceiro caractere
		String tresPrimeiros = nome.substring(0, 3);
		System.out.println("O primeiro até o terceiro caractere é: " + tresPrimeiros);
		
		//Todos menos o primeiro
		String quartocaractere = nome.substring(1);
		System.out.println("O quarto caractere é: " + quartocaractere);
		
		// Os dois ultimos
		String doisultimos = nome.substring(5);
		System.out.println("Os dois ultimos caracteres  é: " + doisultimos);
		
		Principal.algorit();
		sc.close();

	}	
	}

