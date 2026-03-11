package secao10;

import java.util.Scanner;

public class Vetor6_pares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int contPares = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int numero = scan.nextInt();
		
		int [] vetorPar = new int[numero];
		
		for (int i = 0; i < numero; i++) {
			System.out.print("Digite um número: ");
			vetorPar[i] = scan.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("Números pares:");
		
		for (int i = 0; i < vetorPar.length; i++) {
			if (vetorPar[i] % 2 == 0) {
				System.out.print(vetorPar[i] + "  ");
				contPares += 1;
			}
		}
		
		System.out.println(" ");
		System.out.print("Quantidade de pares = " + contPares);
		
		scan.close();

	}

}
