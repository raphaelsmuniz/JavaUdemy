package secao08;

import java.util.Locale;
import java.util.Scanner;

import exemplo2_secao08.Product;

public class Program_exemplo2_secao08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = scan.nextLine();
		System.out.print("Preço: R$ ");
		produto.preco = scan.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = scan.nextInt();
			
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
		
		scan.close();

	}

}
