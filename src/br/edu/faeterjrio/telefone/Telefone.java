package br.edu.faeterjrio.telefone;

import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o telefone: ");
		String telefone = in.nextLine();
		
		telefone.toLowerCase();
		
		telefone = telefone.replace("A", "2");
		telefone = telefone.replace("B", "2");
		telefone = telefone.replace("C", "2");
		telefone = telefone.replace("D", "3");
		telefone = telefone.replace("E", "3");
		telefone = telefone.replace("F", "3");
		telefone = telefone.replace("G", "4");
		telefone = telefone.replace("H", "4");
		telefone = telefone.replace("I", "4");
		telefone = telefone.replace("J", "5");
		telefone = telefone.replace("K", "5");
		telefone = telefone.replace("L", "5");
		telefone = telefone.replace("M", "6");
		telefone = telefone.replace("N", "6");
		telefone = telefone.replace("O", "6");
		telefone = telefone.replace("P", "7");
		telefone = telefone.replace("Q", "7");
		telefone = telefone.replace("R", "7");
		telefone = telefone.replace("S", "7");
		telefone = telefone.replace("T", "8");
		telefone = telefone.replace("U", "8");
		telefone = telefone.replace("V", "8");
		telefone = telefone.replace("W", "9");
		telefone = telefone.replace("X", "9");
		telefone = telefone.replace("Y", "9");
		telefone = telefone.replace("Z", "9");
		
		System.out.println(telefone);
	}

}
