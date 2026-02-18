package secao10;

import java.util.Scanner;

public class Vetor3_negativos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int numero3 = scan.nextInt();
		
		int [] vetor3 = new int[numero3];
		
		for (int i=0 ; i<vetor3.length ; i++) {
			System.out.print("Digite um número: ");
			vetor3[i] = scan.nextInt();
		}
		
		System.out.println("Números negativos:");
		for (int i=0 ; i<vetor3.length ; i++) {
			if (vetor3[i] < 0) {
				System.out.println(vetor3[i]);
			}
		}
		
		scan.close();

	}

}
