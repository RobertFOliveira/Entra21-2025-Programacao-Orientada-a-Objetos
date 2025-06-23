package projetoMetodoExercicio9;

public class Principal {

	// 9) Faça um método que receba 4 números como parâmetros, some os 4 números.
	// Retorne a soma.
	public static int somarQuatroNumeros(int num1, int num2, int num3, int num4) {
		int soma = num1 + num2 + num3 + num4;
		return soma;
	}

	public static void main(String[] args) {
		int resultado = somarQuatroNumeros(10, 20, 30, 40);
		System.out.println("A soma dos números é: " + resultado);
	}

}
