package JavaLar;

public class MostrarMensagens {

	public static void bemVindo() {

		System.out.println("Bem-vindo à Sistema JavaLar!!");
		System.out.println("Digite um número correspondente à uma ação!");
		System.out.println("1 - Iniciar");
		System.out.println("2 - Informações");
		System.out.println("3 - Sair");

	}

	public MostrarMensagens(int opcao, Utilidades utilidades) {
		
		do {
			if (opcao == 1) {
				comoFuncionaOSistema();
			} else if (opcao == 2) {

			} else if (opcao == 3) {
				continue;
			}
		
			System.out.println("\n\nDeseja saber algo mais?");
			mostrarInformacoes();
			
			opcao = 0;
			opcao = utilidades.retornarOpcao();
			
		}while(opcao < 3);
		
		
	}

	public static void mostrarInformacoes() {

		System.out.println("1 - Como funciona o sistema?");
		System.out.println("2 - O que são linguagens de programação?");
		System.out.println("3 - Sair");

	}

	public static void comoFuncionaOSistema() {

		System.out.println(
				"Basicamente, no sistema JavaLar, o usuário digita a quantidade de instantes, bugs e desenvolvedores que serão criados");
		System.out.println(
				"Os planetas têm velocidades e se movem em função dos instantes que são cedidos pelo usuário!");
		System.out.println(
				"Ao se chocar com um bug o planeta perde 1 de velocidade! Ao se chocar com um desenvolvedor ele ganha 1 de velocidade!");
		System.out.println("Ao chegar a 0 de velocidade o planeta explode :'(");
		System.out.println(
				"A cada instante são mostradas ao usuário informações sobre cada planeta: velocidade atual, posição, distancia para outros planetas, area... etc");
	}

}
