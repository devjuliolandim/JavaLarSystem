package JavaLar;

public class CPlusPlus extends Planetas{

	private int orbitaPermitida [][];
	private int indicePosAtual;
	
	
	
	public CPlusPlus(int posicaoX, int posicaoY, int velocidade, int horas) {
		super(posicaoX, posicaoY, horas, horas);
		
		preencherOrbita();
		setVelocidade(velocidade);
		setPosicao(new int[] {8,14});
	}

	
	public void preencherOrbita() {

		orbitaPermitida = new int[48][2];

		int x = 8;
		int y = 14;

		for (int i = 0; i < 48; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 6) {

				x--;

			} else if (i < 18) {

				y--;

			} else if (i < 30) {

				x++;
			} else if (i < 42) {

				y++;

			} else {
				x--;

			}

		}

	}
	
	
	public void mover(int instantes) {

		
		indicePosAtual = (indicePosAtual + velocidade) % orbitaPermitida.length;
		setPosicao(orbitaPermitida[indicePosAtual]);
		
		
	}
	
}
