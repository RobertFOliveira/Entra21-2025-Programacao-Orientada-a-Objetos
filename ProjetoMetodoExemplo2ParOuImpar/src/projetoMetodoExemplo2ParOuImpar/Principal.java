package projetoMetodoExemplo2ParOuImpar;

import java.util.Scanner;

public class Principal {
// Metodo 1 Exemplo
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		
//		System.out.print("Informe um número: ");
//		int numero = input.nextInt();
		
//		if (numero % 2 == 0) {
//			System.out.println("Par");
//		}else {
//			System.out.println("Ímpar");
//		}

//	}

	public static void numeroParOuImpar(int num) {
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int numero = input.nextInt();
		numeroParOuImpar(numero);
	}
}

