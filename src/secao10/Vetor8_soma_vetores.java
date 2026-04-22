package secao10;

import java.util.Scanner;

public class Vetor8_soma_vetores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantVetor = scan.nextInt();
		
		int [] vetorA = new int [quantVetor];
		int [] vetorB = new int [quantVetor];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length ; i++) {
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = scan.nextInt();
		}
		
		int [] vetorC = new int [quantVetor];
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		scan.close();

	}

}
