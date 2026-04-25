package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor10_media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int qtdNum = scan.nextInt();
		
		int [] vetorNum = new int[qtdNum];
		
		int x = 0;		
		double somaNum = vetorNum[0];
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.print("Digite um número: ");
			vetorNum[i] = scan.nextInt();
			
			if (vetorNum[i] % 2 == 0) {
				somaNum += vetorNum[i];
				x += 1;
			}	
		}
		
		double mediaVetor = somaNum / x;
		
		if (somaNum > 0) {
			System.out.printf("A média dos pares é %.1f", mediaVetor);
		} else {
			System.out.println("Nenhum número par!");
		}
		
		
		scan.close();
	}
}
