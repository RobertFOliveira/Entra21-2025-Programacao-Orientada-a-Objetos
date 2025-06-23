package projetoMetodoComRetornoExercicio8;

import java.util.Scanner;

public class Principal {
// Constantes Globais
	public static final int NUMERO_ESTACAO = 4;

	public static final String[] ESTACAO_ANO = { "Primavera", "Verão", "Outono", "Inverno", };

	public static void main(String[] args) {
		// Faça um programa em que o usuário entre com um número de 1 a 4
		// Com o número 1 sendo verão, 2 sendo outono...
		// Dependendo de o que o usuário informa, retorne:
		// É verão
		// E o tempo está quente. Ou
		// É inverno
		// E está frio.
		// Faça um método para cada estação do ano

		Scanner sc = new Scanner(System.in);

        System.out.println("Informe a Estação do Ano: ");
        System.out.println("1 - Primavera");
        System.out.println("2 - Verão");
        System.out.println("3 - Outono");
        System.out.println("4 - Inverno");
        System.out.print("Escolha (1 a 4): ");
        int escolha = sc.nextInt();
		
        // Método que retorna a mensagem
        String resultado = EscolhaEstacao(escolha);
        System.out.println(resultado);
		sc.close();
	}
	public static String EscolhaEstacao(int opcao) {
		switch (opcao) {
		case 1:
			return primavera();
		case 2:
			return verao();
		case 3:
			return outono();
		case 4:
			return inverno();
		default:
			return "Opção inválida. Por favor, escolha um número de 1 a 4.";
		}
	}
	public static String primavera() {
	return "É primavera\nAs flores estão desabrochando.";
	}
	public static String verao() {
		return "É verão\nO tempo está quente.";
	}
	public static String outono() {
		return "É outono\nAs folhas estão caindo.";
	}
	public static String inverno() {
		return "É inverno\nO tempo está frio.";
	}
}
