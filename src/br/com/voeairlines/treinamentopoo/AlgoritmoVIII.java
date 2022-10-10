package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;


public class AlgoritmoVIII {
	
	/*Algoritmo 8
	 *Criar um algoritmo que leia nome, endereço, telefone e mostre posteriormente
	 */

		Scanner leia = new Scanner(System.in).useLocale(Locale.US); {
			
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Informe o nome");
		nome = leia.nextLine();
		System.out.println("Informe o endereço");
		endereco = leia.nextLine();
		System.out.println("Informe o telefone");
		telefone = leia.nextLine();
		System.out.println("O nome é: " + nome);
		System.out.println("O endereço é: " + endereco);
		System.out.println("O telefone é: " + telefone + "\n");
	
		leia.close();

		}

		public void algoritmoVIII() {
			// TODO Auto-generated method stub
			
		}

		
}

