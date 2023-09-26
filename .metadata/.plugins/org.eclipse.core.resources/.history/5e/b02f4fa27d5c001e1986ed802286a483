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
		
		for (int i = 0; i < 8; i++) {
			
			orbitaPermitida[i][0] = 8 + (i % 2);
			orbitaPermitida[i][1] = 9 - (i/2);
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
