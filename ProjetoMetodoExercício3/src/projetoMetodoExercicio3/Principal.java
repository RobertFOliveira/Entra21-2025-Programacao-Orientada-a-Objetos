package projetoMetodoExercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		imprimirValores(numero);

	}

	public static void imprimirValores(int numeroParametro) {

		for (int i = numeroParametro; i <= numeroParametro + 20; i++) {
			System.out.println(i);
		}

	}
}
