package JavaLar;

public abstract class Planetas implements Mover {

	protected int[] posicao = new int[2];
	protected int velocidade;
	protected double horas;
	protected String nome;
	protected int bugsCont;
	protected int devsCont;
	protected int anos;
	protected int orbitaPermitida[][];
	protected int indicePosAtual = 0;
	
	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public int getDevsCont() {
		return devsCont;
	}

	public void setDevsCont(int devsCont) {
		this.devsCont = devsCont;
	}

	public int getBugsCont() {
		return bugsCont;
	}

	public void setBugsCont(int bugsCont) {
		this.bugsCont = bugsCont;
	}

	public Planetas() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getPosicao() {
		return posicao;
	}

	public int getPosicaoX() {
		return this.posicao[0];
	}

	public int getPosicaoY() {
		return this.posicao[1];
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

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public void mover(int instantes) {
		

		
	}
	

}
