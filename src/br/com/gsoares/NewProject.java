package br.com.gsoares;

import java.util.Scanner;

public class NewProject {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = s.nextLine();
		
		palavra = palavra.toLowerCase();
		int contador = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a') {
				contador++;
			}
		}
		
		System.out.println("A letra 'a' aparece " + contador + " vez(es) na palavra.");
		
		s.close();
	}

}
