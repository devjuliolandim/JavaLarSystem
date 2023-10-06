package JavaLar;

public class C extends Planetas {

	public C(int posicaoX, int posicaoY, int velocidade, double horas) {
		super(posicaoX, posicaoY, velocidade, horas);

		preencherOrbita();
		setVelocidade(velocidade);
		setPosicao(new int[] { 8, 15 });
		setBugsCont(0);
		setNome("C");
	}

	public void preencherOrbita() {

		orbitaPermitida = new int[56][2];

		int x = 8;
		int y = 15;

		for (int i = 0; i < 56; i++) {

			orbitaPermitida[i][0] = x;
			orbitaPermitida[i][1] = y;
			if (i < 7) {

				x--;

			} else if (i < 21) {

				y--;

			} else if (i < 35) {

				x++;
			} else if (i < 49) {

				y++;

			} else {
				x--;

			}
			
		}
		
	}

	public void mover(int instantes) {

		for (int i = 0; i < instantes; i++) {
			indicePosAtual = (indicePosAtual + velocidade) % orbitaPermitida.length;
			setPosicao(orbitaPermitida[indicePosAtual]);
		
			if(getPosicaoX() == 8 && getPosicaoY() == 15) {
				
				anos++;
				
			}
		
		
		
		}
	}

}
