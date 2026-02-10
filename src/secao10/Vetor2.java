package secao10;

import java.util.Locale;
import java.util.Scanner;

import secao10_entities.Produto_Vetor2;


public class Vetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Produto_Vetor2[] vetor = new Produto_Vetor2[n];
		
		for (int i=0 ; i < n ; i++) {
			scan.nextLine();
			String nome = scan.nextLine();
			double preco = scan.nextDouble();
			vetor[i] = new Produto_Vetor2(nome, preco);
		}
		
		double soma = 0.0;
		
		for (int i=0 ; i<n ; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("a média de preço é R$ %.2f%n", media);
		
		
		
		
		scan.close();

	}

}
