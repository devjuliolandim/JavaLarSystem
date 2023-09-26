package JavaLar;

import java.util.Scanner;

public class Main {

	public static void show(int[] python, int[]javascript, int[] ROR) {
		
		System.out.println("A posição atual do Planeta JavaScript é (" + javascript[0] + " , " + javascript[1] + ")" );
		System.out.println("A posição atual do Planeta Python é: (" + python[0] + " , " + python[1]+ ")");
		System.out.println("A posição atual do Planeta Ruby On Rails é (" +ROR[0] + " , " + ROR[1] + ")");
		
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Python python = new Python(8,9,4,0);
		JavaScript javaScript = new JavaScript(8, 10, 3, 0);
		RubyOnRails ROR = new RubyOnRails(8,11,2,0);
		
		int escolha = 0;
		
		
		
		do {
		System.out.println("Digte os instantes:");
		int instantes = Utilidades.retornarInstantes();
		
		python.mover(instantes);
		javaScript.mover(instantes);
		ROR.mover(instantes);
		
		int[] posicaoJS = javaScript.getPosicao();
		int[] posicaoPython = python.getPosicao(); 
		int[] posicaoROR = ROR.getPosicao();
		
		show(posicaoPython, posicaoJS, posicaoROR);
		
		System.out.println("Deseja continuar?");
		System.out.println("1 - Sim!");
		System.out.println("2 - Não!");
		escolha = scanner.nextInt();
		
		}while(escolha == 1);
		
		
		scanner.close();
	}

}
