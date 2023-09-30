package JavaLar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criação dos objetos planetas!
		Python python = new Python(8, 9, 4, 0, "Python");
		JavaScript javaScript = new JavaScript(8, 10, 3, 0, "JavaScript");
		RubyOnRails ROR = new RubyOnRails(8, 11, 2, 0, "Ruby on Rails");
		PHP php = new PHP(8, 12, 2, 0, "PHP");
		CSharp csharp = new CSharp(8, 13, 1, 0, "C#");
		CPlusPlus cplusplus = new CPlusPlus(8, 14, 2, 0, "C++");
		C c = new C(8, 15, 10, 0, "C");

		ArrayList<Planetas> planetas = new ArrayList<>();
		planetas.add(python);
		planetas.add(javaScript);
		planetas.add(ROR);
		planetas.add(php);
		planetas.add(csharp);
		planetas.add(cplusplus);
		planetas.add(c);

		ArrayList<Bug> bugs = new ArrayList<>();
		ArrayList<Desenvolvedor> dev = new ArrayList<>();

		MostrarMensagens.bemVindo();

		int opcao = Utilidades.retornarOpcao();

		switch (opcao) {

		case 1:
			// Variável que realiza o do-while
			int escolha = 0;
			do {
				System.out.println("Digte os instantes:");
				int instantes = Utilidades.retornarInstantes();
				int quantidadeBug = 0;
				int quantidadeDesenvolvedores = 0;
				int espacoDisponivel = 224 - planetas.size() - bugs.size() - dev.size();

				System.out.print("Digite a quantidade de Bugs que você deseja: ");
				quantidadeBug = Utilidades.retornarQuantidadeDeBugs(espacoDisponivel);
				Bug.criarBugs(quantidadeBug, bugs, dev);

				espacoDisponivel = 224 - planetas.size() - bugs.size() - dev.size();

				System.out.println("Digite a quantidade de Desenvolvedores que você deseja: ");
				quantidadeDesenvolvedores = Utilidades.retornarQuantidadeDeDevs(espacoDisponivel);
				Desenvolvedor.criarDesenvolvedores(quantidadeDesenvolvedores, dev, bugs);

				Utilidades.mover(planetas, instantes);
				Utilidades.show(planetas);

				Bug.verificarEncontrocomBugs(planetas, bugs);
				Desenvolvedor.verificarEncontroComDesenvolvedores(planetas, dev);
				int quantidadeDePlanetasExistentes = planetas.size();
				if (quantidadeDePlanetasExistentes == 0) {
					System.out.println("Todos os planetas explodiram !");
					break;
				}

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
			int info = 0;
			System.out.println("O que você deseja saber?");
			System.out.println("1 - Como funciona o sistema?");
			System.out.println("2 - O que são linguagens de programação?");
			System.out.println("3 - Conte-me mais sobre as linguagens de programação do JavaLar :D");

			info = Utilidades.retornarOpcao();

			// Pendente
			if (info == 1) {

			} else if (info == 2) {

			} else if (info == 3) {

			}

			break;

		case 3:

			System.exit(0);

		}

		scanner.close();
	}

}
