package JavaLar;

import java.util.ArrayList;

public class Relatorio {

	public static void relatorio(ArrayList<Planetas> planetas, ArrayList<CemiterioDePlanetas> cova, int instantes) {

		
		System.out.println("-//-//-//-//- RELATÓRIO -//-//-//-//-\n\n");
		
		for (Planetas planeta : planetas) {

			System.out.println("-//-//-//-//- " + planeta.getNome() + " -//-//-//-//-");
			System.out.println("A quantidade de vezes que o planeta " + planeta.getNome() + " colidiu com um bug foi: "
					+ planeta.getBugsCont());
			System.out.println("A quantidade de vezes que o planeta " + planeta.getNome()
					+ " colidiu com um desenvolvedor foi: " + planeta.getDevsCont());
			System.out.println("A velocidade de rotação foi de : " + planeta.getHoras() + " horas por instante");
			System.out.println("A quantidade de horas que se passaram no planeta " + planeta.getNome() + " foram " + (planeta.getHoras() * instantes));
			System.out.println("A quantidade de anos que se passaram no planeta " + planeta.getNome() + " foram " + planeta.getAnos());
			System.out.println("\n\n");
		}

		
		System.out.println("-//-//-//-//- INSTANTES -//-//-//-//-");
		System.out.println("A quantidade de instantes pedida pelo usuário foi de: " + instantes + " instantes.\n");
		int size = cova.size();
		
		
		System.out.println("-//-//-//-//- EXPLOSÕES -//-//-//-//-");
		if (size == 0) {

			System.out.println("Nenhum planeta explodiu!");

		} else if (size == 1) {

			for (CemiterioDePlanetas covas : cova) {

				System.out.println("O planeta que explodiu foi o: " + covas.getNome());
			}

		} else {

			System.out.println("Os planetas que explodiram foram:");

			for (CemiterioDePlanetas covas : cova) {

				System.out.println("-> " + covas.getNome());
			}

		}

	}
	
	
	
	
	

	public static float anosJavaLar(ArrayList<Planetas> planetas) {

		float anos = 0;

		return anos;
	}

}
