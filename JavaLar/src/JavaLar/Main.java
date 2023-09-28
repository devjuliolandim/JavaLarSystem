package JavaLar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Python python = new Python(8, 9, 4, 0);
		JavaScript javaScript = new JavaScript(8, 10, 3, 0);
		RubyOnRails ROR = new RubyOnRails(8, 11, 2, 0);
		PHP php = new PHP(8, 12, 2, 0);
		CSharp csharp = new CSharp(8, 13, 1, 0);
		CPlusPlus cplusplus = new CPlusPlus(8, 14, 2, 0);
		C c = new C(8, 15, 10, 0);

		Utilidades.bemvindo();

		int opcao = Utilidades.retornarOpcao();
		int escolha = 0;

		switch (opcao) {

		case 1:

			do {
				System.out.println("Digte os instantes:");
				int instantes = Utilidades.retornarInstantes();

				Utilidades.mover(python, javaScript, ROR, php, csharp, cplusplus, c, instantes);
				Utilidades.show(python.getPosicao(), javaScript.getPosicao(), ROR.getPosicao(), php.getPosicao(), csharp.getPosicao(), cplusplus.getPosicao(), c.getPosicao());

				Calculos.numeroDePlanetas(python, javaScript, ROR, php, csharp, cplusplus, c);
				Calculos.alinhamentosEixoX(python, javaScript, ROR, php, csharp, cplusplus, c);
				Calculos.alinhamentosDiagonal(python, javaScript, ROR, php, csharp, cplusplus, c);
				
				
				
				System.out.println("\n\nDeseja continuar?");
				System.out.println("1 - Sim!");
				System.out.println("2 - Não!");
				escolha = scanner.nextInt();

				if (escolha == 2) {

					System.out.println("Fim de programa!");
				}

			} while (escolha == 1);

			break;

		case 2:

			break;

		case 3:

			System.exit(0);

		}

		scanner.close();
	}

}
