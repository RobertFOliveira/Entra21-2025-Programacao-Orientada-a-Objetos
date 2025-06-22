package projetoMetodoExercicio6;

import java.util.Scanner;

public class Prinicipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor base");

		int base = input.nextInt();

		encontrarValorMaisProximo(base);

	}

	public static void encontrarValorMaisProximo(int base) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número 1");
		int numero1 = input.nextInt();

		System.out.println("Insira o número 2");
		int numero2 = input.nextInt();

		int distanciaBase1 = Math.abs(base - numero1);
		int distanciaBase2 = Math.abs(base - numero2);

		if (distanciaBase1 < distanciaBase2) {
			System.out.println(numero1 + " está mais próximo de " + base);
		} else if (distanciaBase2 < distanciaBase1) {
			System.out.println(numero2 + " está mais próximo de " + base);
		} else {
			System.out.println("Distância iguais");
		}

	}

}
