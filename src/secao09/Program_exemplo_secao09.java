package secao09;

import java.util.Locale;
import java.util.Scanner;

import exemplo1_secao09.Product;

public class Program_exemplo_secao09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("Preço: R$ ");
		double preco = scan.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = scan.nextInt();
		
		//obrigando a instanciação do objeto com os parâmetros definidos.
		Product produto = new Product(nome, preco, quantidade);
			
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a ser adicionado no estoque: ");
		quantidade = scan.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a ser removido no estoque: ");
		quantidade = scan.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println();
		System.out.println(produto);
		
		scan.close();

	}

}
