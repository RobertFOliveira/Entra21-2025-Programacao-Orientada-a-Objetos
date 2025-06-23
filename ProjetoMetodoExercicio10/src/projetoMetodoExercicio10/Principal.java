package projetoMetodoExercicio10;

import java.util.Scanner;

public class Principal {
	// 10) Faça um método booleano que retorne true se o número passado como
	// parâmetro seja par.
	// Retorne false caso seja ímpar.
	public static void numeroParOuImpar(int num) {
		if (num % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		numeroParOuImpar(numero);
	}

}
