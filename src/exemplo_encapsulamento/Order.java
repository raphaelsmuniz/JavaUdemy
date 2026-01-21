package exemplo_encapsulamento;

import java.util.Date;

public class Order {

	private Date data;
	private Product produto;
	
	public Order(Date data, Product produto) {
		super();
		this.data = data;
		this.produto = produto;
		this.produto.nome = "TV";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}
	
	
	
}
