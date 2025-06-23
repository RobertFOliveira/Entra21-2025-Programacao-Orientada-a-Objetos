package projetoMetodoExercicio12;

import java.util.Scanner;

public class Principal {

	// 12) Faça um programa que calcule o quadrado de um número caso esse número
	// seja par
	// e o dobro desse número caso esse número seja ímpar.
	// Retorne o resultado

	public static int calculeQuadrado(int numero) {
		if (numero % 2 == 0) {
			return numero * numero; // quadrado se par
		} else {
			return numero * 2; // dobro se ímpar
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = input.nextInt();

		int resultado = calculeQuadrado(numero);
		System.out.println("Resultado: " + resultado);
		input.close();

	}

}
