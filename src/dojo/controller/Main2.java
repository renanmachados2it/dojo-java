package dojo.controller;

import dojo.model.Phrase;

public class Main2 {
	public static void main(String[] args) {
		
		Phrase phrase = new Phrase("Programar Java � muito f�cil, em 321...");
		
		System.out.println("Frase: "+phrase.getDescription());
		System.out.println("Quantidade Vogais: "+phrase.getQtVowel());
		System.out.println("Quantidade Consoantes: "+phrase.getQtConsonant());
		System.out.println("Quantidade Espa�os: "+phrase.getQtSpace());
		System.out.println("Quantidade N�meros: "+phrase.getQtNumber());
		System.out.println("Quantidade Caracteres Especiais: "+phrase.getQtSpecialChar());
	}
}
