package exemplo2_secao08;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
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
