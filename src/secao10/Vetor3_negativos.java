package secao10;

import java.util.Scanner;

public class Vetor3_negativos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int numero = scan.nextInt();
		
		int [] vetor = new int[numero];
		
		for (int i=0 ; i<vetor.length ; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Números negativos:");
		for (int i=0 ; i<vetor.length ; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		scan.close();

	}

}
