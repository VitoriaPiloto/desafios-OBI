package br.edu.faeterjrio.pneu;

import java.util.Scanner;

public class Pneu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pressaoDesejada, pressaoReal, difPressao;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a pressão desejada: ");
		pressaoDesejada = in.nextFloat();
		
		System.out.println("Insira a pressão real: ");
		pressaoReal = in.nextFloat();
		
		if (pressaoDesejada > 40 || pressaoReal > 40) {
			System.out.println("Insira os dados no intervalo de 1 a 40.");
		}
		
		difPressao = pressaoDesejada - pressaoReal;
		
		System.out.println(difPressao);
	}

}
