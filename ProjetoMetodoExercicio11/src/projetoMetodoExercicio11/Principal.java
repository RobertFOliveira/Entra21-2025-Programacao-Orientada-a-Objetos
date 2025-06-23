package projetoMetodoExercicio11;

import java.util.Scanner;

public class Principal {
	// 11) Faça um programa que receba 2 números do usuário.
	// Faça um método que descubra qual dos números é maior e retorne esse valor.
	// Se os dois números forem iguais, retorne: número iguais.

	public static String descubraMaior(int num1, int num2) {
		if (num1 > num2) {
			return "O maior número é: " + num1;
		} else if (num2 > num1) {
			return "O maior número é: " + num2;
		} else {
			return "Números iguais.";
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número:");
		int num1 = input.nextInt();
		System.out.print("Informe o segundo número:");
		int num2 = input.nextInt();

		String resultado = descubraMaior(num1, num2);
		System.out.println(resultado);
		input.close();
	}

}
