package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor9_abaixo_da_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int qtdElements = scan.nextInt();
		
		double [] vetorNum = new double [qtdElements];
		
		double somaNum = vetorNum[0];
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.print("Digite um número: ");
			vetorNum[i] = scan.nextDouble();
			somaNum += vetorNum[i];
		}
		
		double mediaVetor = somaNum / qtdElements;
		
		System.out.printf("%nA média do vetor é %.3f%n", mediaVetor);
		System.out.println("Elementos abaixo da média: ");
		
		for (int i = 0; i < vetorNum.length; i++) {
			if (vetorNum[i] <= 10.0) {
				System.out.printf("%.1f%n", vetorNum[i]);
			}
		}
		
		scan.close();

	}

}
