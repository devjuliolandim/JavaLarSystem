package JavaLar;

public abstract class Planetas {

	protected int[] posicao = new int[2];
	protected int velocidade;
	protected int horas;
	
	
	public Planetas(int posicaoX, int posicaoY,  int velocidade, int horas) {
		this.posicao[0] = posicaoX;
		this.posicao[0] = posicaoY;
		this.velocidade = velocidade;
		this.horas = horas;
	}

	public int[] getPosicao() {
		return posicao;
	}

	public void setPosicao(int[] posicao) {
		this.posicao = posicao;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public abstract void mover(int instantes);
	
	
	

}
