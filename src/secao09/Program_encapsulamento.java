package secao09;

import java.util.Locale;
import java.util.Scanner;

import exemplo_encapsulamento.Product;

public class Program_encapsulamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		//instanciando o construtor padrão
		Product p = new Product();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("Preço: R$ ");
		double preco = scan.nextDouble();
		
		//obrigando a instanciação do objeto com os parâmetros definidos.
		Product produto = new Product(nome, preco);
		
		//com o modificador PRIVATE, não pode ser feita a atribuição desta forma abaixo.
		//produto.nome = "computer";
		
		//DEVE SER FEITA A ATRIBUIÇÃO DA FORMA ABAIXO:
		produto.setNome("Computer");
		System.out.println("Updated name: " + produto.getNome());
		
		produto.setPreco(1200.00);
		System.out.println("Updates price: R$ " + produto.getPreco());
		
		
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a ser adicionado no estoque: ");
		int quantidade = scan.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a ser removido no estoque: ");
		quantidade = scan.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println(p.getNome());
		System.out.println(p.getPreco());
		System.out.println(p.getQuantidade());
		
		scan.close();

	}
}
