package JavaLar;

public class Python extends Planetas {

	private int[][] orbitaPermitida;
	private int indicePosAtual = 0;

	public Python(int posicaoX, int posicaoY, int velocidade, int horas) {
		super(posicaoX, posicaoY, velocidade, horas);

		preencherOrbita();
	}

	private void preencherOrbita() {
		orbitaPermitida = new int[8][2];
		int x = 8;
		int y = 9;

		for (int i = 0; i < 8; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;

			if (i < 1) {

				x--;
			} else if (i < 3) {
				y--;

			} else if (i < 5) {
				x++;

			} else if (i < 7) {
				y++;
			} else {
				x--;
			}

		}
	}

	public int horasPassadas(int instantes) {

		horas = 24 * instantes;

		return horas;
	}

	public void mover(int instantes) {

		for (int i = 0; i < instantes; i++) {

			indicePosAtual = (indicePosAtual + getVelocidade()) % orbitaPermitida.length;
			setPosicao(orbitaPermitida[indicePosAtual]);
		}

	}

}
