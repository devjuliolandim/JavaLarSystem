package JavaLar;

import java.util.ArrayList;

public class InicioJavaLar {

	private int opcao;
	private int somatorioDeInstantes;

	public InicioJavaLar() {

		Planetas python = new Python(8, 9, 4, 24);
		Planetas javaScript = new JavaScript(8, 10, 3, 10);
		Planetas ROR = new RubyOnRails(8, 11, 2, 48);
		Planetas php = new PHP(8, 12, 2, 60);
		Planetas csharp = new CSharp(8, 13, 1, 4);
		Planetas cplusplus = new CPlusPlus(8, 14, 2, 0.5);
		Planetas c = new C(8, 15, 10, 0.1);

		ArrayList<Bug> bugs = new ArrayList<>();
		ArrayList<Desenvolvedor> dev = new ArrayList<>();
		ArrayList<Planetas> planetas = new ArrayList<>();
		ArrayList<CemiterioDePlanetas> cova = new ArrayList<>();

		planetas.add(python);
		planetas.add(javaScript);
		planetas.add(ROR);
		planetas.add(php);
		planetas.add(csharp);
		planetas.add(cplusplus);
		planetas.add(c);

		Utilidades utilidades = new Utilidades();

		MostrarMensagens.bemVindo();
		opcao = utilidades.retornarOpcao();

		switch (opcao) {

		case 1:
			opcao = 0;
			somatorioDeInstantes = 0;

			new Simulacao(opcao, planetas, utilidades, somatorioDeInstantes, bugs, dev, cova);

			break;

		case 2:
			MostrarMensagens.mostrarInformacoes();

			opcao = 0;
			opcao = utilidades.retornarOpcao();

			new MostrarMensagens(opcao, utilidades);

			break;

		case 3:

			System.out.println("Tchau! Até a próxima!");

			System.exit(0);

		}

	}

}