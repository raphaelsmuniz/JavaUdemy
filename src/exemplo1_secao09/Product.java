package exemplo1_secao09;
public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
	//criando um construtor e passando os argumentos para obrigar na inicialização
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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
