package projetoMetodoExercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do seu colega");
		String nome = input.next();

		if (nome.equalsIgnoreCase("carlos")) {
			carlos();
		} else if (nome.equalsIgnoreCase("luis")) {
			luis();
		}

	}

	public static void luis() {
		System.out.println("O nome dele é Luis");
		System.out.println("Ele tem 25 anos");
		System.out.println("Ele é estudante do SENAI");
	}

	public static void carlos() {
		System.out.println("O nome dele é Carlos");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é estudante do SENAI");
	}

}
