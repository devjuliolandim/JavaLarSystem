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

}
