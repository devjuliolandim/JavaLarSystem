package JavaLar;

import java.util.ArrayList;
import java.util.Random;

public class Bug extends OutrosPersonagens {

	public Bug(int pX, int pY) {
		super(pX, pY);
	}
	
	
	public static void criarBugs(int qntdBug, ArrayList<Bug> bugs, ArrayList<Desenvolvedor> devs) {
		Random random = new Random();
		boolean[][] posOcupadas = new boolean[15][15];
		int pX = 0;
		int pY = 0;

		for (Desenvolvedor desenvolvedor : devs) {

			pX = desenvolvedor.getPX();
			pY = desenvolvedor.getPY();

			posOcupadas[pX][pY] = true;

		}

		for (int i = 0; i < qntdBug; i++) {

			do {
				pX = random.nextInt(15);
				pY = random.nextInt(15);
			} while (posOcupadas[pX][pY] == true || (pX == 8 && pY == 8));

			Bug bug = new Bug(pX, pY);
			bugs.add(bug);
			posOcupadas[pX][pY] = true;

		}

	}
	
	public static void verificarEncontrocomBugs(ArrayList<Planetas> planetas, ArrayList<Bug> bugs) {
		
		ArrayList<String> registroDeColisoes = new ArrayList<>();
		ArrayList<Bug> removerBug = new ArrayList<>();
		ArrayList<Planetas> removerPlaneta = new ArrayList<>();

		for (Planetas planeta : planetas) {
			int velocidade = planeta.getVelocidade();
			for (Bug bug : bugs) {

				if (planeta.getPosicaoX() == bug.getPX() && planeta.getPosicaoY() == bug.getPY()) {
					String mensagem = "Há uma colisão do planeta " + planeta.getNome() + " com um bug na posicão ("+ planeta.getPosicaoX() + ", " + planeta.getPosicaoY() + ")";
					if(!registroDeColisoes.contains(mensagem)) {
						System.out.println(mensagem);
						registroDeColisoes.add(mensagem);
					}
					
					planeta.setVelocidade(velocidade - 1);
					removerBug.add(bug);
				}

			}
			if (velocidade == 0) {
				removerPlaneta.add(planeta);
				System.out.println("O planeta " + planeta.getNome() + " explodiu!");

			}

		}
		planetas.removeAll(removerPlaneta);
		bugs.removeAll(removerBug);
	}
	
	
	
	
	

}
