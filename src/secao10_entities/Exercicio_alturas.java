package secao10_entities;

public class Exercicio_alturas {

	private String nome;
	private int idade;
	private double altura;
	
	
	public Exercicio_alturas() {
	}

	public Exercicio_alturas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
