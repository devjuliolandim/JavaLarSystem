package JavaLar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Python python = new Python(8,9,4,0);
		JavaScript javaScript = new JavaScript(8, 10, 3, 0);
		RubyOnRails ROR = new RubyOnRails(8,11,2,0);
		PHP php = new PHP(8,12,2,0);
		CSharp csharp = new CSharp(8,13,1,0);
		CPlusPlus cplusplus = new CPlusPlus(8,14,2,0);
		C c = new C(8,15,10,0);
		
		int escolha = 0;
		
		
		
		do {
		System.out.println("Digte os instantes:");
		int instantes = Utilidades.retornarInstantes();
		
		python.mover(instantes);
		javaScript.mover(instantes);
		ROR.mover(instantes);
		php.mover(instantes);
		csharp.mover(instantes);
		cplusplus.mover(instantes);
		c.mover(instantes);
		
		int[] posicaoJS = javaScript.getPosicao();
		int[] posicaoPython = python.getPosicao(); 
		int[] posicaoROR = ROR.getPosicao();
		int[] posicaophp = php.getPosicao();
		int[] posicaocsharp = csharp.getPosicao();
		int[] posicaocplusplus = cplusplus.getPosicao();
		int[] posicaoc = c.getPosicao();
		
		
		
		
		Utilidades.show(posicaoPython, posicaoJS, posicaoROR, posicaophp, posicaocsharp, posicaocplusplus, posicaoc);
		
		System.out.println("Deseja continuar?");
		System.out.println("1 - Sim!");
		System.out.println("2 - Não!");
		escolha = scanner.nextInt();
		
		}while(escolha == 1);
		
		
		scanner.close();
	}

}