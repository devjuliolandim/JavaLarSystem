package JavaLar;

import java.util.Scanner;

public class Utilidades {

	public static int retornarInstantes() {
		Scanner scanner = new Scanner(System.in);

		int opcao;

		do {
			opcao = scanner.nextInt();
			if (opcao == 0) {

				System.out.println("O número de instantes '0' não é permitido");
			} else if (opcao < 0) {
				System.out.println("Números menores do que '0' não são permitidos");
			}

		} while (opcao <= 0);

		return opcao;
	}


	public static void show(int[] python, int[]javascript, int[] ROR, int[]php, int[]csharp, int[]cplusplus, int[]c) {
		
		System.out.println("A posição atual do Planeta JavaScript é (" + javascript[0] + " , " + javascript[1] + ")" );
		System.out.println("A posição atual do Planeta Python é: (" + python[0] + " , " + python[1]+ ")");
		System.out.println("A posição atual do Planeta Ruby On Rails é (" +ROR[0] + " , " + ROR[1] + ")");
		System.out.println("A posição atual do Planeta PHP é (" +php[0] + " , " + php[1] + ")");
		System.out.println("A posição atual do Planeta C# é (" +csharp[0] + " , " + csharp[1] + ")");
		System.out.println("A posição atual do Planeta C++ é (" +cplusplus[0] + " , " + cplusplus[1] + ")");
		System.out.println("A posição atual do Planeta C é (" +c[0] + " , " + c[1] + ")");
	}














}