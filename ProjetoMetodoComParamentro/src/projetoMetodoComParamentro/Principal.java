package projetoMetodoComParamentro;

import java.util.Scanner;

public class Principal {

	public static void multiplicarValores(int numero1, int numero2) {
		System.out.println(numero1 * numero2);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número 1");
		int numero1 = input.nextInt();

		System.out.println("Insira o número 2");
		int numero2 = input.nextInt();

		multiplicarValores(numero1, numero2);

	}

}
