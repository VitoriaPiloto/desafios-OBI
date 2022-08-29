package br.edu.faeterjrio.bonde;

import java.util.Scanner;

public class Bonde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alunos, monitores, total;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o número de alunos: ");
		alunos = in.nextInt();
		
		System.out.println("Insira o número de monitores: ");
		monitores = in.nextInt();
		
		total = alunos + monitores;
		
		if (total>50) {
			System.out.println("N");
		} else {
			System.out.println("S");
		}
	}

}
