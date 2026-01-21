package exemplo_encapsulamento;

public class Product {

	private String nome;
	private double preco;
	private int quantidade;
	
	//criando um construtor padrão
	public Product() {
		
	}
	//exemplo de sobrecarga, chamando o mesmo construtor 2x, sendo que parâmetros diferentes.
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double totalValueinStock() {
		return (double) preco * quantidade;
	}
	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return "Dados do produto: " + nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f", totalValueinStock());
	}
}
