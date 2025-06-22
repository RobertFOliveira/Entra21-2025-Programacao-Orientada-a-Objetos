package projetoMetodoExercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor");
		int estacao = input.nextInt();

		if (estacao == 1) {
			imprimirVerao();
		} else if (estacao == 2) {
			imprimirOutono();
		} else if (estacao == 3) {
			imprimirInverno();
		} else if (estacao == 4) {
			imprimirPrimavera();
		}

	}

	public static void imprimirVerao() {
		System.out.println("É verão\nE o tempo está quente");
	}

	public static void imprimirOutono() {
		System.out.println("É outono\nE as folhas estão caindo");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno\nE está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera\nE as flores estão crescendo");
	}

}
