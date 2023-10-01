package JavaLar;

import java.util.ArrayList;

public abstract class Planetas {

	protected int[] posicao = new int[2];
	protected int velocidade;
	protected int horas;
	protected String nome;

	public Planetas(int posicaoX, int posicaoY, int velocidade, int horas, String nome) {
		this.posicao[0] = posicaoX;
		this.posicao[1] = posicaoY;
		this.velocidade = velocidade;
		this.horas = horas;
		this.nome = nome;
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public abstract void mover(int instantes);
	
	public static void showSpeed(ArrayList<Planetas> planeta) {
		System.out.println("\n\n");
		for (Planetas planetas : planeta) {
			System.out.println("A velocidade do planeta " + planetas.getNome() + " é de " + planetas.getVelocidade() + " unidades");
		}
		
		
	}

	

}
