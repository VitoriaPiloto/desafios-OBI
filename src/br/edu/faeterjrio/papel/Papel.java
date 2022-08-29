package br.edu.faeterjrio.papel;

import java.util.Scanner;

public class Papel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nParticipantes, folhasCompradas, folhasRecebidas, folhasTotal;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o número de participantes: ");
		nParticipantes = in.nextInt();
		
		System.out.println("Insira o número de folhas compradas: ");
		folhasCompradas = in.nextInt();
		
		System.out.println("Insira o número de folhas p/ cada participante: ");
		folhasRecebidas = in.nextInt();
		
		folhasTotal = (folhasCompradas / nParticipantes);
		
		if (folhasTotal >= folhasRecebidas) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
