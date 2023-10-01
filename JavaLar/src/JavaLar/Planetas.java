package JavaLar;

import java.util.ArrayList;

public abstract class Planetas {

	protected int[] posicao = new int[2];
	protected int velocidade;
	protected double horas;
	protected String nome;
	protected int bugsCont;
	protected int devsCont;
	
	
	
	
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

	public Planetas(int posicaoX, int posicaoY, int velocidade, double horas) {
		this.posicao[0] = posicaoX;
		this.posicao[1] = posicaoY;
		this.velocidade = velocidade;
		this.horas = horas;
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

	public abstract void mover(int instantes);
	
	public static void showSpeed(ArrayList<Planetas> planeta) {
		System.out.println("\n\n");
		for (Planetas planetas : planeta) {
			System.out.println("A velocidade do planeta " + planetas.getNome() + " é de " + planetas.getVelocidade() + " unidades");
		}
		
		
	}
	
	

}
