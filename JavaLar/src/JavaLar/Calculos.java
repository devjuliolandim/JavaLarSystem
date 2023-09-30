package JavaLar;

import java.util.ArrayList;

public class Calculos {

	public static void hemisferios(String planeta, int[] posicao) {

		String hemisferio = null;

		if (posicao[1] > 8) {

			hemisferio = "Norte";
		} else if (posicao[1] < 8) {

			hemisferio = "Sul";
		}

		System.out.println("O planeta " + planeta + " está no Hemisfério " + hemisferio);

	}

	public static boolean diagonalSecundaria(int pX, int pY, int[][] posicoesGeral) {

		int diagonalSecundaria = 0;
		int diminuicao = 1;

		for (int i = 0; i < 7; i++) {
			if (pX == (posicoesGeral[i][0] - diminuicao) && pY == (posicoesGeral[i][1] - diminuicao)) {
				diagonalSecundaria++;
			}

			if (diagonalSecundaria > 0) {
				diminuicao++;
			}
		}

		if (diagonalSecundaria > 0) {

			return true;
		} else {

			return false;
		}

	}

	public static boolean diagonalPrincipal(int pX, int pY, int[][] posicoes) {
		int diagonalPrincipal = 0;
		int diminuicao = 1;
		int aumento = 1;

		for (int i = 0; i < 7; i++) {

			if (pX == (posicoes[i][0] + aumento) && pY == (posicoes[i][1] - diminuicao)) {
				diagonalPrincipal++;
			}
			if (diagonalPrincipal > 0) {
				diminuicao++;
				aumento++;
			}

		}
		
		
		if(diagonalPrincipal > 0) {
			
			return true;
		}else {
			
			return false;
		}
		
	
	}

	public static void alinhamentosDiagonal(Python p, JavaScript js, RubyOnRails ror, PHP php, CSharp cs, CPlusPlus cp,
			C c) {

		int[][] posicoes = new int[7][2];

		posicoes[0][0] = p.getPosicaoX();
		posicoes[0][1] = p.getPosicaoY();
		posicoes[1][0] = js.getPosicaoX();
		posicoes[1][1] = js.getPosicaoY();
		posicoes[2][0] = ror.getPosicaoX();
		posicoes[2][1] = ror.getPosicaoY();
		posicoes[3][0] = php.getPosicaoX();
		posicoes[3][1] = php.getPosicaoY();
		posicoes[4][0] = cs.getPosicaoX();
		posicoes[4][1] = cs.getPosicaoY();
		posicoes[5][0] = cp.getPosicaoX();
		posicoes[5][1] = cp.getPosicaoY();
		posicoes[6][0] = c.getPosicaoX();
		posicoes[6][1] = c.getPosicaoY();

		ArrayList<String> planetasDiagonalSecundaria = new ArrayList<>();

		if (diagonalSecundaria(posicoes[0][0], posicoes[0][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("Python");
		}
		if (diagonalSecundaria(posicoes[1][0], posicoes[1][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("JavaScript");
		}
		if (diagonalSecundaria(posicoes[2][0], posicoes[2][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("Ruby on Rails");
		}
		if (diagonalSecundaria(posicoes[3][0], posicoes[3][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("PHP");
		}
		if (diagonalSecundaria(posicoes[4][0], posicoes[4][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("C#");
		}
		if (diagonalSecundaria(posicoes[5][0], posicoes[5][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("C++");
		}
		if (diagonalSecundaria(posicoes[6][0], posicoes[6][1], posicoes) == true) {
			planetasDiagonalSecundaria.add("C");
		}

		
		System.out.println("\n-//-//-//- Diagonais -//-//-//-");
		
		if (!planetasDiagonalSecundaria.isEmpty()) {
			System.out.println("Há alinhamentos na diagonal secundária dos seguintes planetas:");
			for (String planeta : planetasDiagonalSecundaria) {
				System.out.print(planeta + ", ");
			}
		} else {
			System.out.println("Não há nenhum alinhamento na diagonal secundária!");
		}

		
		
		ArrayList<String> planetasDiagonalPrincipal = new ArrayList<>();
		
		if (diagonalPrincipal(posicoes[0][0], posicoes[0][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("Python");
		}
		if (diagonalPrincipal(posicoes[1][0], posicoes[1][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("JavaScript");
		}
		if (diagonalPrincipal(posicoes[2][0], posicoes[2][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("Ruby on Rails");
		}
		if (diagonalPrincipal(posicoes[3][0], posicoes[3][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("PHP");
		}
		if (diagonalPrincipal(posicoes[4][0], posicoes[4][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("C#");
		}
		if (diagonalPrincipal(posicoes[5][0], posicoes[5][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("C++");
		}
		if (diagonalPrincipal(posicoes[6][0], posicoes[6][1], posicoes) == true) {
			planetasDiagonalPrincipal.add("C");
		}
		
		
		if(!planetasDiagonalPrincipal.isEmpty()) {
			
			System.out.println("\nHá alinhamentos de planetas na diagonal principal dos planetas:");
			for(String planeta : planetasDiagonalPrincipal) {
				System.out.print(planeta + ", ");
				
			} 
			
		}else {
			
			System.out.println("Não há alinhamentos na diagonal principal");
		}
		
		
	}

	public static void alinhamentosEixoX(Python p, JavaScript js, RubyOnRails ror, PHP php, CSharp cs, CPlusPlus cp,
			C c) {

		int pX = p.getPosicaoX();
		int jsX = js.getPosicaoX();
		int rorX = ror.getPosicaoX();
		int phpX = php.getPosicaoX();
		int csX = cs.getPosicaoX();
		int cpX = js.getPosicaoX();
		int cX = js.getPosicaoX();

		int[] posicoes = new int[7];

		posicoes[0] = pX;
		posicoes[1] = jsX;
		posicoes[2] = rorX;
		posicoes[3] = phpX;
		posicoes[4] = csX;
		posicoes[5] = cpX;
		posicoes[6] = cX;

		int alinhamentos = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {

				if (posicoes[i] == posicoes[j]) {

					alinhamentos++;
				}

			}

		}

		if (alinhamentos > 0) {

			System.out.println("Há alinhamentos de planetas na vertical");

		}

	}

	public static void DistanciaArea(Python p, JavaScript js, RubyOnRails ror, PHP php, CSharp cs, CPlusPlus cp, C c) {

	}

	public static void numeroDePlanetas(Python p, JavaScript js, RubyOnRails ror, PHP php, CSharp cs, CPlusPlus cp,
			C c) {

		int[] planetas = { p.getPosicaoY(), js.getPosicaoY(), ror.getPosicaoY(), php.getPosicaoY(), cs.getPosicaoY(),
				cp.getPosicaoY(), c.getPosicaoY() };

		int quantidadeNorte = 0;

		int quantidadeSul = 0;

		for (int i = 0; i < planetas.length; i++) {

			if (planetas[i] > 8) {

				quantidadeNorte++;
			} else if (planetas[i] < 8) {

				quantidadeSul++;
			}

		}

		String Norte = "Norte";
		String Sul = "Sul";

		System.out.println("-//-//-//-  Hemisfério de Planetas  -//-//-//-");
		imprimirNumeroDePlanetas(Norte, quantidadeNorte);
		imprimirNumeroDePlanetas(Sul, quantidadeSul);
		System.out.println("-//-//-//-//-//-//-\n\n");

	}

	public static void imprimirNumeroDePlanetas(String direcao, int quantidade) {

		if (quantidade > 0 && quantidade == 1) {

			System.out.println("Existe 1 único planeta ao " + direcao + " de Java");

		} else if (quantidade > 1) {

			System.out.println("Existem " + quantidade + " planetas ao " + direcao + " de Java");
		} else {

			System.out.println("Não existe nenhum planeta ao " + direcao + " de Java!");
		}

	}

}